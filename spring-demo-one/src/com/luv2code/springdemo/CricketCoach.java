package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	//injecting literals
	private String emailAddress;
	private String team;
	
	
	public String getEmailAddress() {	
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		System.out.println("You are inside setter method : emailAddress");
		this.emailAddress = emailAddress;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		System.out.println("You are inside setter method : team");
		this.team = team;
	}
	
	//no arg-constructor
	public CricketCoach() {
		System.out.println("You are inside no-arg Constructor");
	}
	// our setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("You are inside setter method");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice fast bowling";
	}

	@Override
	public String Lucky() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getDailyFortune();
	}

	

}
