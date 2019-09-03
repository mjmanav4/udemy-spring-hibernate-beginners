package com.manavjain.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnootationDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
		
		Coach theCoach = context.getBean("tennisCoach",Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		
		
		context.close();

	}

}
