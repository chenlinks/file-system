package com.file.system.utils.DocConvertUtil;

import cn.hutool.log.LogFactory;
import com.file.system.utils.ReturnAjax;
import jdk.internal.jline.internal.Log;
import lombok.extern.slf4j.Slf4j;
import org.jodconverter.LocalConverter;
import org.jodconverter.OfficeDocumentConverter;
import org.jodconverter.office.LocalOfficeManager;
import org.jodconverter.office.OfficeException;
import org.jodconverter.office.OfficeManager;

import java.io.File;

/**
 * 这是一个工具类，主要是为了使Office2003-2007全部格式的文档(.doc|.docx|.xls|.xlsx|.ppt|.pptx)
 * 转化为pdf文件<br>
 * Office2010的没测试<br>
 */
public class Office2PDF {


    /**
     * 使Office2003-2007全部格式的文档(.doc|.docx|.xls|.xlsx|.ppt|.pptx) 转化为pdf文件<br>
     * 
     * @param inputFilePath
     *            源文件路径，如："e:/test.docx"
     * @param rt 
     * @return
     */
    public static boolean openOfficeToPDF(String inputFilePath, String outputFilePath, String officeHome, ReturnAjax rt) {
    	 return office2pdf(inputFilePath,outputFilePath, officeHome, rt);
    }

    /**
     * 连接OpenOffice.org 并且启动OpenOffice.org
     * 
     * @return
     */
    public static OfficeManager getOfficeManager(String officeHome) {

        LocalOfficeManager officeManager = LocalOfficeManager.builder().officeHome(officeHome).build();
        try {
            officeManager.start();
        } catch (OfficeException e) {
            e.printStackTrace();
            Log.error(e.getMessage(),e);
        }
        return officeManager;
    }

    /**
     * 转换文件
     * 
     * @param inputFile
     * @param outputFilePath_end
     * @param inputFilePath
     * @param converter
     */
    public static boolean converterFile(File inputFile, String outputFilePath_end, String inputFilePath,
                                        OfficeDocumentConverter converter) {
        File outputFile = new File(outputFilePath_end);
        // 假如目标路径不存在,则新建该路径
        if (!outputFile.getParentFile().exists()) {
            outputFile.getParentFile().mkdirs();
        }

        try {
            converter.convert(inputFile, outputFile);
        } catch (OfficeException e) {
            e.printStackTrace();
        }
        System.out.println("文件 " + inputFilePath + "转换为 目标文件:" + outputFile + " 成功!");
        return true;
    }

    /**
     * 使Office2003-2007全部格式的文档(.doc|.docx|.xls|.xlsx|.ppt|.pptx) 转化为pdf文件<br>
     * 
     * @param inputFilePath
     *            源文件路径，如："e:/test.docx"
     * @param outputFilePath 
     * @param outputFilePath
     *            目标文件路径，如："e:/test_docx.pdf"
     * @param rt 
     * @return
     */
    public static boolean office2pdf(String inputFilePath, String outputFilePath, String officeHome, ReturnAjax rt) {
        if (inputFilePath == null || "".equals(inputFilePath)) {
            System.out.println("office2pdf() 输入文件地址为空，转换终止!");
            rt.setError("文件未指定！");
            return false;
        }

        File inputFile = new File(inputFilePath);

        if (!inputFile.exists()) {
            System.out.println("office2pdf() 输入文件不存在，转换终止!");
            rt.setError("文件 " + inputFilePath + " 不存在！");
            return false;
        }
    	
    	OfficeManager officeManager = null;
    	try {
    		officeManager = getOfficeManager(officeHome);
    		// 连接OpenOffice
            OfficeDocumentConverter converter = new  OfficeDocumentConverter(officeManager);
        	boolean ret = converterFile(inputFile, outputFilePath, inputFilePath, converter);
        	officeManager.stop();
        	officeManager = null;
        	return ret;
    	} catch (Exception e) {
    		rt.setError("文件转换异常!");
    		if(officeManager != null)
    		{
                try {
                    officeManager.stop();
                } catch (OfficeException ex) {
                    ex.printStackTrace();
                }
            }
    		System.out.println("office2pdf() getOfficeManager Exception");
			e.printStackTrace();
			return false;
    	}
    }

    /**
     * 获取inputFilePath的后缀名，如："e:/test.pptx"的后缀名为："pptx"<br>
     * 
     * @param inputFilePath
     * @return
     */
    public static String getPostfix(String inputFilePath) {
        return inputFilePath.substring(inputFilePath.lastIndexOf(".") + 1);
    }

}
