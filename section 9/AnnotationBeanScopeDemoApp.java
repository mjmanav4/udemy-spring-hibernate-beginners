package com.manavjain.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Coach theCoach = context.getBean("tennisCoach",Coach.class);
		
		Coach theCoach2 = context.getBean("tennisCoach",Coach.class);
	
		boolean result = (theCoach == theCoach2);
		
		System.out.println("bool "+result);
		
		context.close(); 
	}

}
