package com.example.annotation;

import org.springframework.stereotype.Component;

//@Component("componentBeanId")
@Component(value = "componentBeanId")
public class UserComponentImplWithParam implements IUser {
	private String name = "UserComponentImplWithParam";

	@Override
	public String get() {
		return name;
	}
}