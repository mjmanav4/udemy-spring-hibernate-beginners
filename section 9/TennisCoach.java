package com.manavjain.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component

public class TennisCoach implements Coach {

	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	
	public TennisCoach() {
		System.out.println("constructor tennis coach ");
	}
	/*@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	*/
	
//	@Autowired
//	public void defaultmethod(FortuneService theFortuneService) {
//		System.out.println("default method tennis coach ");
//	
//		fortuneService = theFortuneService;
//		
//	}
	
	@PostConstruct
	public void startUpStuff() {
		System.out.println("startup tennis coach");
		
	}
	
	@PreDestroy
	public void cleanUpStuff() {
		System.out.println("shut tennis coach");
		
	}
	
	
	
	
	@Override
	public String getDailyWorkout() {
		return "Practice your smash";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
