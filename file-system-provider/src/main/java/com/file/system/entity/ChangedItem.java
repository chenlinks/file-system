package com.file.system.entity;

import lombok.Data;

@Data
public class ChangedItem {

	private Integer changeType;
    
	private Integer entryType;

    private String path;
	private String name;
	private String entryPath;
	
    private String srcPath;
    private String srcName;
    private String srcEntryPath;
    
    private String commitId;
    


}
