package com.file.system.entity;

import lombok.Data;

@Data
public class ReposAuth {

    private Integer id;

    private Integer userId;

    private Integer groupId;

    private Integer type;

    private Integer priority;

    private Integer reposId;

    private Integer isAdmin;

    private Integer access;

    private Integer editEn;

    private Integer addEn;

    private Integer deleteEn;

    private Integer heritable;


    //ReposAuth 附加信息: 需要通过joint doc and user or group Table to get these info
    private String userName="";	//from user Table
    private String realName="";	//from user Table
    private String groupName="";	//from group Table
    
    private String docName="";		//from doc Table
    private String docPath="";		//from doc Table
    
}