package com.file.system.entity;

import lombok.Data;

@Data
public class User {

    private Integer id;

    private String name;

    private String pwd;

    private Integer type;

    private Integer role;

    private String realName;

    private String nickName;

    private String img;

    private String email;

    private Integer emailValid;

    private String tel;

    private Integer telValid;

    private String lastLoginTime;

    private String lastLoginIp;

    private String lastLoginCity;

    private Integer createType;

    private String createTime;

    private String intro;

}