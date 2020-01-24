package com.ikiugu.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(Config.class);
		
		
		Coach theSuperCoach = context.getBean("swimCoach", Coach.class);
		
		System.out.println("The coach says: " + theSuperCoach.getWorkoutPlan());
		
		System.out.println("\nToday the fortune is: " + theSuperCoach.getDailyFortune());
		
		context.close();

	}

}
