package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(..) is not necessary (no component scan) because the beans are configured manually
public class SoccerConfig {
	// define bean for our Daily fortune service
	@Bean
	public FortuneService dailyFortuneService() {
		return new DailyFortuneService();
	}
	
	// define bean for our soccer coach AND inject dependency
	@Bean
	public Coach soccerCoach() {
		return new SoccerCoach(dailyFortuneService());
	}
}
