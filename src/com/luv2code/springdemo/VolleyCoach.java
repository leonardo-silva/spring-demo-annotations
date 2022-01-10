package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VolleyCoach implements Coach {

	private FortuneService fortuneService;

	public VolleyCoach() {
		System.out.println("VolleyCoach - inside default constructor");
	}
	
	/*
	@Autowired
	public VolleyCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	*/

	// define a setter method
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("VolleyCoach - inside setFortuneService()");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Volleyball - Practice serve and block!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
