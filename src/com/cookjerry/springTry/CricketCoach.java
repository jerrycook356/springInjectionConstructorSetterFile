package com.cookjerry.springTry;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
	public CricketCoach() {
		
	}
	
	
	@Override
	public String getDailyWorkout() {
		
		return "practice cricket";
	}

	@Override
	public String getDailyFortune() {
		
		return "Cricket Coach = "+fortuneService.getFortune();
	}

	@Override
	public String getTeam() {
		
		return team;
	}

	@Override
	public String getEmailAddress() {
		
		return emailAddress;
	}
	
	//function for setter injection
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	//method used for literal injection
	public void setEmailAddress(String emailAddress) {
		this.emailAddress= emailAddress;
	}
	//method used for literal injection
	public void setTeam(String team) {
		this.team = team;
	}

}
