package com.file.system.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface DocAuthMapper extends BaseMapper<DocAuth> {

    int deleteByPrimaryKey(Integer id);

    int insert(DocAuth record);

    int insertSelective(DocAuth record);

    DocAuth selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DocAuth record);

    int updateByPrimaryKey(DocAuth record);

    DocAuth selectSelective(DocAuth docAuth);

	DocAuth getDocAuth(DocAuth docAuth);

	int deleteSelective(DocAuth docAuth);

	List<DocAuth> getDocAuthForUser(DocAuth docAuth);
	List<DocAuth> getDocAuthForGroup(DocAuth docAuth);
	List<DocAuth> getDocAuthForAnyUser(DocAuth docAuth);
	
	//这个接口是故意这么实现的 
	List<DocAuth> getAllDocAuthList(HashMap<String, Object> params);
}