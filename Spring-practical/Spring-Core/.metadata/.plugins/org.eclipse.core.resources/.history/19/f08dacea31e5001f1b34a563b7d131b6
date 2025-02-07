package com.rays.bean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class TestStudent {
	public static void main(String[] args) {
		
	 {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("StudentBean.xml"));
			StudentBySetter student =	(StudentBySetter) factory.getBean("student");
			System.out.println(student.getName());
			System.out.println(student.getRoll());

		
	}
	
	}
}
