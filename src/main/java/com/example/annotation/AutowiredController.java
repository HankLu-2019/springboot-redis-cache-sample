package com.example.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.beantest.MyBean;

@RestController
public class AutowiredController {
    @Autowired
    private IService service;
    
    @Autowired
    private MyBean mybean;

    @RequestMapping("/autowiredController")
    public String get () {
        return service.get()  + mybean.get();
    }
}