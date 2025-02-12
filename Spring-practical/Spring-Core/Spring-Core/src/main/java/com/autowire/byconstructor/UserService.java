package com.autowire.byconstructor;

public class UserService {
	private UserDao userDao;
	

	public UserService(UserDao userDao) {
		this.userDao = userDao;
		
	}
	public void testadd() {
		userDao.add();
	}

}
