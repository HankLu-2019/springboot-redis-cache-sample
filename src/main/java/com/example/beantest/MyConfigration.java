package com.example.beantest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MyConfigration {

	@Bean(initMethod = "init", destroyMethod = "destroy")
	@Scope("prototype")
	public MyBean myBean() {
		return new MyBean();
	}
}