package com.file.system.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface ReposMapper extends BaseMapper<Repos> {
    int deleteByPrimaryKey(Integer id);

    int insert(Repos record);

    int insertSelective(Repos record);

    Repos selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Repos record);

    int updateByPrimaryKey(Repos record);
    
    //get all ReposList
    List<Repos> selectAll();

    //get ReposList by repos Info
    List<Repos> selectSelective(Repos repos);

    //get add ReposList
    List<Repos> selectAuthedReposList(Integer UserId);
	
    //add repos and will set the id to repos
	int add(Repos repos);
}