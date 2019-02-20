package com.example.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service("autowiredUserServiceImpl")
// @Service
@Scope("prototype")
public class IServiceImpl implements IService {

	@Autowired
	// @Qualifier("autowiredUserDaoImpl")
	@Qualifier("autowiredAdminDaoImpl")
//	@Qualifier("AdminDaoImpl")
	private IDao dao;

	@Override
	public String get() {
		return dao.get();
	}

}
