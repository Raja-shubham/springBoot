package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	public TennisCoach() {
		System.out.println("TennisCoach: inside default constructor");
	}
	
//	@Autowired
//	public TennisCoach(FortuneService thefortuneService) {
//		fortuneService=thefortuneService;
//	}
	
	// defining setter method
	
//	@Autowired
//	public void setFortuneService(FortuneService fortuneService) {
//		System.out.println("TennisCoach: inside setter method");
//		this.fortuneService=fortuneService;
//	}
	
	@Override
	public String getDailyWorkout() {
		return "practice your backhand volley";
	}



	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
