package com.ikiugu.springdemo;

public class SwimCoach implements Coach {

	private FortuneService fortuneService;
	
	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getWorkoutPlan() {
		return "100 laps both ways";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
