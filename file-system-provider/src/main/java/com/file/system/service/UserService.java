package com.file.system.service;


import com.file.system.entity.User;

import java.util.List;

public interface UserService {  
    public List<User> getUserListByUserInfo(User user);
    
    public List<User> queryUserExt(User user);
}  
