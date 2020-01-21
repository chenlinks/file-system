package com.file.system.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface DocMapper extends BaseMapper<Doc> {
    int deleteByPrimaryKey(Integer id);

    int insert(Doc record);

    int insertSelective(Doc record);

    Doc selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Doc record);

    int updateByPrimaryKeyWithBLOBs(Doc record);

    int updateByPrimaryKey(Doc record);
   	
    //get DocList
    List<Doc> selectSelective(Doc record);
    
    //delete selctive
	int deleteSelective(Doc record);

	//For Doc Search
	List<Doc> queryDocList(HashMap<String, Object> params);
}