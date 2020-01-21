package com.file.system.entity;

import lombok.Data;

@Data
public class Doc  implements Comparable<Doc> {
    private Integer id;	//id in dataBase
        		
    private String name;

    private Integer type;	//0:不存在  1:文件  2:目录

    private Long size;

    private String checkSum;

    private String revision;

    private String path;

    private Long docId;

    private Long pid;

    private Integer vid;

    private String pwd;

    private Integer creator;

    private Long createTime;

    private Integer latestEditor;

    private Long latestEditTime;

    private String content;	//vDoc Content
    private String tmpContent;	//tmp Saved vDoc Content
    
    private String docText; //文本文件内容或者Office文件的文本内容
    private String tmpDocText; //tmp Saved docText
    
	private int sortIndex;

    private String creatorName;

    private String latestEditorName;
    
    private Integer level;
    
    private String localRootPath;
    
    private String localRefRootPath;

    private String localVRootPath;
    
    private boolean isRealDoc = true;


    public int compareTo(Doc doc) {
    	//Sort By sortIndex
        int ret = doc.sortIndex - this.sortIndex;
        if(ret != 0)
        {
        	return ret;
        }
        
        //Sort by docType
        if(doc.type != null && this.type != null)
        {
	        ret = doc.type - this.type;
	        if(ret != 0)
	        {
	        	return ret;
	        }
        }
        
        //Sort by doName
        return doc.name.compareTo(this.name);   
    }
}