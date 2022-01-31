package com.luv2code.springdemo;

public class TrackCoach implements Coach {

		private FortuneService fortuneService;
		
		public TrackCoach() {
			
		}
		
	public TrackCoach(FortuneService fortuneService) {
			super();
			this.fortuneService = fortuneService;
		}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run a hard 5k";
	}

	@Override
	public String Lucky() {
		// TODO Auto-generated method stub
		return "Just Do it :you are Lucky";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just do it"+" " +fortuneService.getDailyFortune();
	}
	
	//add init method 
	public void doMyStartupStuff() {
		System.out.println("TrackCoach:inside doMyStartupStuff");
	}
	
	// add destroy method
	public void doMyCleanupStuff() {
		System.out.println("TrackCoach:inside doMyCleanupStuff");
	}
	

}
