package com.file.system.entity;

import lombok.Data;

@Data
public class DocShare {
    private Integer id;

    private Integer shareId;

    private String name;

    private String path;

    private Long docId;

    private Integer vid;

    private String shareAuth;

    private String sharePwd;

    private Integer sharedBy;

    private Long expireTime;

}