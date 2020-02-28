package com.buscar.searchengine.repository;

import java.util.*;

import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.buscar.searchengine.model.*;

@Repository
	public interface ContentRepository extends CrudRepository<Content, String> {

	    public Content findByTitle(String title);
	    
	    @Query("{\"metadata\":\"tags\":\"?0\"}")
	    public List<Content> findByTag(String tag);
	    
	    
	    @Query("{\"metadata\":\"tags\":\"?0\"}")
	    public List<Content> findByRegion(String region);


	}
