package com.luv2code.springdemo;

public class DailyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Fortune service of the day: be yourself!";
	}

}
