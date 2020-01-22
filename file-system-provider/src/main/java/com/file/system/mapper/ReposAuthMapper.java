package com.file.system.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.file.system.entity.ReposAuth;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface ReposAuthMapper extends BaseMapper<ReposAuth> {

    int deleteByPrimaryKey(Integer id);

    int insert(ReposAuth record);

    int insertSelective(ReposAuth record);

    ReposAuth selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ReposAuth record);

    int updateByPrimaryKey(ReposAuth record);
    
    List<ReposAuth> selectSelective(ReposAuth reposAuth);

	ReposAuth getReposAuth(ReposAuth reposAuth);

	//获取所有用户列表（包含授权信息，但这个函数名定义确实有点奇怪）
	List<ReposAuth> getReposAllUsers(Integer reposId);
	
	List<ReposAuth> getReposAllGroups(Integer reposId);
	
	//获取仓库的所有授权信息
	List<ReposAuth> getReposAuthList(Integer reposId);
	
	List<ReposAuth> getReposAuthForUser(ReposAuth reposAuth);

	int deleteSelective(ReposAuth reposAuth);
}