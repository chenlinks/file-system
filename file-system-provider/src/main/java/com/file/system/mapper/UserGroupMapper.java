package com.file.system.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.file.system.entity.UserGroup;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface UserGroupMapper extends BaseMapper<UserGroup> {
    int deleteByPrimaryKey(Integer id);

    int insert(UserGroup record);

    int insertSelective(UserGroup record);

    UserGroup selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserGroup record);

    int updateByPrimaryKey(UserGroup record);
    
	List<UserGroup> selectAll();

	List<UserGroup> selectSelective(UserGroup qGroup);
}