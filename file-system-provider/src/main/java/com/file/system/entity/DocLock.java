package com.file.system.entity;

import lombok.Data;

@Data
public class DocLock {
    private Integer id;

    private Integer type;

    private String name;

    private String path;

    private Long docId;

    private Long pid;

    private Integer vid;

    private Integer state;

    private String locker;

    private Integer lockBy;

    private Long lockTime;

}