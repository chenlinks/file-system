package com.file.system.common;

import com.file.system.entity.Doc;

import java.util.List;

public class CommitAction{
	public enum CommitType {
		UNDEFINED,
		ADD,
		DELETE,
		MODIFY,
		MOVE,
		COPY,
		FILETODIR,
		DIRTOFILE;
	}
	
    private CommitType action; //1:add 2:delete 3:modify 4:move 5:copy
    
    private Doc doc;
    private Doc newDoc;

    private String localRootPath;
    private String localRefRootPath;
    
    //subAction
    public boolean isSubAction = false;

    //Sub Action List
    private List<CommitAction> subActionList = null;
	
	public void setAction(CommitType commitActionType) {
		this.action = commitActionType;
	}
	
	public CommitType getAction()
	{
		return action;
	}
	
	public void setDoc(Doc doc) {
		this.doc = doc;
	}
	
	public Doc getDoc()
	{
		return doc;
	}

	public void setNewDoc(Doc newDoc) {
		this.newDoc = newDoc;
	}
	
	public Doc getNewDoc()
	{
		return newDoc;
	}

	public void setLocalRefRootPath(String localRefRootPath) {
		this.localRefRootPath = localRefRootPath;
	}
	
	public String getLocalRefRootPath()
	{
		return localRefRootPath;
	}
	
	public void setLocalRootPath(String localRootPath) {
		this.localRootPath = localRootPath;
	}
	
	public String getLocalRootPath()
	{
		return localRootPath;
	}
	
	public void setSubActionList(List<CommitAction> subActionList) {
		this.subActionList = subActionList;
	}
	
	public List<CommitAction> getSubActionList()
	{
		return subActionList;
	}
	
}