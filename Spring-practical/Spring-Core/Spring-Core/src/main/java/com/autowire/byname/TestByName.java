package com.autowire.byname;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestByName {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("autowire-by-name.xml");
			UserService userService =	(UserService) context.getBean("userService");
			userService.testAdd();
	}

}
