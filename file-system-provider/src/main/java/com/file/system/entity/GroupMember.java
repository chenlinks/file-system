package com.file.system.entity;

import lombok.Data;

@Data
public class GroupMember {
    private Integer id;

    private Integer groupId;

    private Integer userId;

    //ReposAuth 附加信息: 需要通过joint doc and user or group Table to get these info
    private String userName="";	//from user Table
    private String nickName="";	//from user Table
    private String realName="";	//from user Table
    
    private String groupName="";	//from group Table
    
}