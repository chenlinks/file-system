package com.file.system.entity;

import lombok.Data;

@Data
public class Repos {

	public static final Integer FSM = 1;
	public static final Integer FSP = 2;
	public static final Integer VRPSVN = 3;
	public static final Integer VRPGIT = 4;
    
    private Integer id;

    private String name;

    private Integer type;

    private String path;

    private String realDocPath;

    private Integer verCtrl;

    private Integer isRemote;

    private String localSvnPath;

    private String svnPath;

    private String svnUser;

    private String svnPwd;

    private String revision;

    private Integer verCtrl1;

    private Integer isRemote1;

    private String localSvnPath1;

    private String svnPath1;

    private String svnUser1;

    private String svnPwd1;

    private String revision1;

    private String info;

    private String pwd;

    private Integer owner;

    private Long createTime;

    private Integer state;

    private Integer lockBy;

    private Long lockTime;

}