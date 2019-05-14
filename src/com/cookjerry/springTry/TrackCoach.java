package com.cookjerry.springTry;

public class TrackCoach implements Coach {

	
	private FortuneService fortuneService;
	
	
	
	@Override
	public String getDailyWorkout() {
		
		return "run hard 5k";
	}

	@Override
	public String getDailyFortune() {
		
		return"track coach " + fortuneService.getFortune();
	}

	@Override
	public String getTeam() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getEmailAddress() {
		// TODO Auto-generated method stub
		return null;
	}
	
	//method to use setter injection
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

}
