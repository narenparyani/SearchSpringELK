package com.buscar.searchengine.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.buscar.searchengine.model.Content;
import com.buscar.searchengine.service.ContentService;

@RestController
@RequestMapping("/searchengine")
public class ContentController {


	

	    @Autowired
	    private ContentService contentService;

	    @GetMapping("/titles/{title}")
	    public Content getContentByTitle(@PathVariable("title") String title) {
	        return contentService.findContentByTitle(title);
	    }
	    @GetMapping("/tags/{tag}")
	    public List<Content> getContentByTag(@PathVariable("tag") String tag) {
	        return contentService.findContentByTag(tag);
	    }

	    @GetMapping("/regions/{region}")
	    public List<Content> getContentByRegion(@PathVariable("region") String region) {
	        return contentService.findContentByRegion(region);
	    }
	   

	    
	
}
