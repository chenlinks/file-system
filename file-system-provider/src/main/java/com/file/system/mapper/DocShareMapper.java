package com.file.system.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DocShareMapper extends BaseMapper<DocShare> {
    int deleteByPrimaryKey(Integer id);

    int insert(DocShare record);

    int insertSelective(DocShare record);

    DocShare selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DocShare record);

    int updateByPrimaryKey(DocShare record);
}