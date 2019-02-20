package com.example.annotation;

import org.springframework.stereotype.Service;

//@Component
@Service
public class UserComponentImpl implements IUser {
	private String name = "UserComponentImpl";

	@Override
	public String get() {
		return name;
	}
}
