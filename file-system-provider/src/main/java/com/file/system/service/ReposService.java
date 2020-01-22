package com.file.system.service;


import com.file.system.entity.Doc;
import com.file.system.entity.DocAuth;
import com.file.system.entity.Repos;
import com.file.system.entity.ReposAuth;

import java.util.List;

public interface ReposService {

	//add a Repos
    public int addRepos(Repos repos);

    //add a Repos
    public int deleteRepos(Integer id);

    //Get the ReposList
    public List<Repos> getAllReposList();

    //Get the ReposList
    public List<Repos> getReposList(Repos repos);
    
    //update ReposVersion
    public int updateRepos(Repos repos);
    
    //add a Document
    public int addDoc(Doc doc);
    
    //get a Document
    public Doc getDoc(Integer id);
    
    //update a Document
    public int updateDoc(Doc doc);
    
    //delete a Document
    public int deleteDoc(Integer id);
    
    //get ReposAuth
    public ReposAuth getReposAuth(ReposAuth reposAuth);
    
    //get DocAuth
    public DocAuth getDocAuth(DocAuth docAuth);

}
