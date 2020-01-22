package com.file.system.service.impl;

import com.file.system.entity.GroupMember;
import com.file.system.entity.User;
import com.file.system.entity.UserGroup;
import com.file.system.mapper.GroupMemberMapper;
import com.file.system.mapper.UserGroupMapper;
import com.file.system.mapper.UserMapper;
import com.file.system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service  
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userDao;
    @Resource
    private UserGroupMapper groupDao;
    @Resource
    private GroupMemberMapper groupMemberDao;
    
    public  int addUser(User user) {
    	return userDao.insertSelective(user);
    }
    
    public  int updateUserInfo(User user) {
    	return userDao.updateByPrimaryKeySelective(user);
    }
    
    public List<User> getUserListByUserInfo(User user) {
    	return userDao.selectSelective(user);
    } 
    
    public List<User> queryUserExt(User user)
    {
    	return userDao.queryUserExt(user);
    }

	public List<User> geAllUsers() {
		return userDao.selectAll();
	}

	public User getUser(Integer userID) {
		return userDao.selectByPrimaryKey(userID);
	}
	
	public int delUser(Integer userId) {
		return userDao.deleteByPrimaryKey(userId);
	}
	
	public int editUser(User user) {
		return userDao.updateByPrimaryKeySelective(user);

	}

	/*The following interface is for group*/
	public List<UserGroup> geAllGroups() {
		return groupDao.selectAll();
	}

	public List<UserGroup> getGroupListByGroupInfo(UserGroup qGroup) {
		return groupDao.selectSelective(qGroup);
	}
	
	public int addGroup(UserGroup group) {
		return groupDao.insertSelective(group);
	}

	public int delGroup(Integer id) {
		return groupDao.deleteByPrimaryKey(id);
	}

	public int editGroup(UserGroup group) {
		return groupDao.updateByPrimaryKeySelective(group);
	}
	
	public List<GroupMember> getGroupAllUsers(Integer groupId) {
		return groupMemberDao.getGroupAllUsers(groupId);
	}

	public List<UserGroup> getGroupMemberListByGroupMemberInfo(GroupMember groupMember) {
		return groupMemberDao.selectSelective(groupMember);
	}

	public int addGroupMember(GroupMember groupMember) {
		return groupMemberDao.insertSelective(groupMember);
	}

	public int delGroupMember(Integer id) {
		return groupMemberDao.deleteByPrimaryKey(id);
	}

	public int deleteGroupMemberSelective(GroupMember groupMember) {
		return groupMemberDao.deleteSelective(groupMember);	
	}

}  
