package com.example.springbootcacheredisdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	 @Autowired
	 private TestCacheService testCacheService;

	    @RequestMapping(value = "/hello", method = RequestMethod.GET)
	    public String getUser(@RequestParam String name) {
	        return testCacheService.testCache(name);
	    }


}
