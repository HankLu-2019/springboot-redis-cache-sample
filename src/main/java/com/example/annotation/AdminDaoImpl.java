package com.example.annotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository("autowiredAdminDaoImpl")
// @Repository
@Scope("prototype")
public class AdminDaoImpl implements IDao {

	@Override
	public String get() {
		return "@Autowired注解实现自动装配 - AdminDaoImpl";
	}
}