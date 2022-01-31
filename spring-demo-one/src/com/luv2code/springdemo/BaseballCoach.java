package com.luv2code.springdemo;

public class BaseballCoach implements Coach {
	
	// define private field for dependency
	private FortuneService fortuneService;
	
	//defining constructor for dependency injection
	
	BaseballCoach(FortuneService theFortuneSevice){
		fortuneService=theFortuneSevice;
	}
	
	
	
	@Override
	public String getDailyWorkout() {
		return "spend 30 min on batting practice";
	}

	@Override
	public String Lucky() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDailyFortune() {
		// use my fortuneService to get fortuneService 
		
		return fortuneService.getDailyFortune();
	}

}
