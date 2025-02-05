package com.rays.bean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class TestPerson {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("PersonBean.xml"));
		PersonbyConstructor person =	(PersonbyConstructor) factory.getBean("person");
		System.out.println(person.getName());
		System.out.println(person.getAddress());
	}
	

}
