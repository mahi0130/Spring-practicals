package com.autowire.bytype;

public class UserService {
	private UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public void testAdd() {
		userDao.add();
	}

}
