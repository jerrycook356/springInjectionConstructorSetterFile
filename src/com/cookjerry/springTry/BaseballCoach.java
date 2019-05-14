package com.cookjerry.springTry;

public class BaseballCoach implements Coach {

	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
	//constructor to use constructor injection
	
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	@Override
	public String getDailyWorkout() {
		
		return "30 minutes of batting practice";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

	@Override
	public String getTeam() {
		
		return team;
	}

	@Override
	public String getEmailAddress() {
		return emailAddress;
	}

}
