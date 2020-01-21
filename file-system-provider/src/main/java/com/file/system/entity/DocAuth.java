package com.file.system.entity;

import lombok.Data;

@Data
public class DocAuth {

    private Integer id;

    private Integer userId;

    private Integer groupId;

    private Integer type;

    private Integer priority;

    private Long docId;

    private Integer reposId;

    private Integer isAdmin;

    private Integer access;

    private Integer editEn;

    private Integer addEn;

    private Integer deleteEn;

    private Integer heritable;

    private String docPath;

    private String docName;

}