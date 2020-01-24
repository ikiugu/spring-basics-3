package com.ikiugu.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	// define bean for our sad fortune service
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	// define bean for swim coach and inject its dependencies
	// we are passing the sadFortuneService() since this is the ID as created above
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}
}
