package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class VolleyCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Volleyball - Practice serve and block!";
	}

}
