package com.file.system.entity;

import lombok.Data;

@Data
public class UserGroup {

    private Integer id;

    private String name;

    private Integer type;

    private String info;

    private String img;

    private Integer priority;

    private String createTime;

}