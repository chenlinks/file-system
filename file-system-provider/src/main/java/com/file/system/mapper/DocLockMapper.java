package com.file.system.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.file.system.entity.DocLock;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DocLockMapper extends BaseMapper<DocLock> {

    int deleteByPrimaryKey(Integer id);

    int insert(DocLock record);

    int insertSelective(DocLock record);

    DocLock selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DocLock record);

    int updateByPrimaryKey(DocLock record);
    
    //get DocLockList
    List<DocLock> selectSelective(DocLock record);
}