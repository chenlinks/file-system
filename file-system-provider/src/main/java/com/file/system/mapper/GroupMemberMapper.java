package com.file.system.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.file.system.entity.GroupMember;
import com.file.system.entity.UserGroup;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GroupMemberMapper extends BaseMapper<GroupMember> {
    int deleteByPrimaryKey(Integer id);

    int insert(GroupMember record);

    int insertSelective(GroupMember record);

    GroupMember selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GroupMember record);

    int updateByPrimaryKey(GroupMember record);

    //获取所有用户列表（包含组信息，但这个函数名定义确实有点奇怪）
	List<GroupMember> getGroupAllUsers(Integer groupId);

	List<UserGroup> selectSelective(GroupMember groupMember);

	int deleteSelective(GroupMember groupMember);
}