package com.rays.multiple;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMultipleByArray {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "Student.xml", "Person.xml" });
		Student st = (Student) context.getBean("student");
		System.out.println(st.getSubject());

		Person p = (Person) context.getBean("person");
		System.out.println(p.getName());

	}

}
