package com.ikiugu.springdemo;

import org.springframework.stereotype.Component;

public class RugbyCoach implements Coach {

	@Override
	public String getWorkoutPlan() {
		return "50 Scrums per day";
	}

	@Override
	public String getDailyFortune() {
		return "No pack no gain";
	}

}
