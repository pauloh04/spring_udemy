package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;

	private String emailAddress;
	private String team;

	public CricketCoach() {
		System.out.println("CricketCoach constructor...");
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach set fortune method...");
		this.fortuneService = fortuneService;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach set email method...");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach set Team method...");
		this.team = team;
	}

	@Override
	public String getDailyworkout() {
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
