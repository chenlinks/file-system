package com.file.system.entity;

import lombok.Data;

import java.util.List;

@Data
public class LogEntry {
	private long revision;
	private String commitId;
	private String commitUser;
	private String commitMsg;
	private long commitTime;
	private List<ChangedItem> changedItems;	//有变化的文件列表
}