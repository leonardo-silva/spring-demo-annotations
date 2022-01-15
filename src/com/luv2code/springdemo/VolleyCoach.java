package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class VolleyCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;

	public VolleyCoach() {
		System.out.println("VolleyCoach - inside default constructor");
	}
	
	/*
	@Autowired
	public VolleyCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	// define a method with @Autowired annotation
	@Autowired
	public void doSomeCrazyStuff(FortuneService fortuneService) {
		System.out.println("VolleyCoach - inside doSomeCrazyStuff()");
		this.fortuneService = fortuneService;
	}
	*/

	@Override
	public String getDailyWorkout() {
		return "Volleyball - Practice serve and block!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
