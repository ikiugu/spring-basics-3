package com.ikiugu.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(Config.class);
		
		
		Coach theSuperCoach = context.getBean("rugbyCoach", Coach.class);
		
		System.out.println("The coach says: " + theSuperCoach.getWorkoutPlan());
		
		context.close();

	}

}
