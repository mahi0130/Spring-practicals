package com.rays.bean;

public class UserBean {
	
	private String  Login= null;
	private String Password = null;
	
	public UserBean(String login , String password) {
		this.Login = login;
		this.Password = password;
		
	}
	
	public String getLogin() {
		return Login;
	}
	public void setLogin(String login) {
		Login = login;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	
	
	
	
	

}
