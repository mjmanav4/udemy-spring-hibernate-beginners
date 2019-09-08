package com.manavjain.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
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
