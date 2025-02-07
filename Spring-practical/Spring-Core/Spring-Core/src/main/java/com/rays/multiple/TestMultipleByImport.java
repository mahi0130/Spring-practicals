package com.rays.multiple;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMultipleByImport {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Multiple.xml");
		Person p = (Person) context.getBean("person");
		Student s =	(Student) context.getBean("student");
		System.out.println(p.getName());
		System.out.println(s.getSubject());
	}

}
