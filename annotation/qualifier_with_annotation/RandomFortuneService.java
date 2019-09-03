package com.manavjain.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	
	private String[] data = {
			"Beware ",
			"okay",
			"grren"
	};
	
	private Random myrandom = new Random();
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		int index = myrandom.nextInt(data.length);
		
		return data[index];
	}

}
