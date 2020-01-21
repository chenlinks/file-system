package com.file.system.utils.SvnUtil;

import org.tmatesoft.svn.core.SVNException;
import org.tmatesoft.svn.core.wc.*;

public class ConflictResolverHandler implements ISVNConflictHandler {  
  
    /*  
     * (non-Javadoc)  
     *   
     * @see  
     * org.tmatesoft.svn.core.wc.ISVNConflictHandler#handleConflict(org.tmatesoft  
     * .svn.core.wc.SVNConflictDescription)  
     */  
    @Override
    public SVNConflictResult handleConflict( SVNConflictDescription conflictDescription) throws SVNException {  
        System.out.println("Enter handleConflict()");
        
        SVNConflictReason reason = conflictDescription.getConflictReason();
        System.out.println("conflict reason:" + reason);
        
        SVNConflictResult ConflictResult = null;
        if(reason == SVNConflictReason.EDITED)
        {
            SVNMergeFileSet mergeFiles = conflictDescription.getMergeFiles();
            System.out.println("Conflict discovered in:" + mergeFiles.getWCFile());
            
            SVNConflictChoice choice = SVNConflictChoice.MINE_FULL; //get the local working copy file 
            //choice = SVNConflictChoice.THEIRS_FULL; //get the remote file 
            
            ConflictResult = new SVNConflictResult(choice, mergeFiles.getResultFile());         
        }
        else
        {
        	System.out.println("conflict will not be fixed:" + reason);
        }
        System.out.println("leave handleConflict()");
        return ConflictResult;
    }  
}  