package com.cookjerry.springTry;

public class FootballCoach implements Coach {

	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
	@Override
	public String getDailyWorkout() {
		return"practice tackling";
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
	
	//method for setter injection of Fortune service
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	//method to set email from file
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	//method to set team name from file
	public void setTeam(String team) {
		this.team = team;
	}

}
