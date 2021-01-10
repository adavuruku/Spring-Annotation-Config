package com.luv2code.springdemo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


// learning scope

@Component
@Scope("prototype")
public class TennisCoachScope implements Coach {

	
	@Override
	public String getDailyWorkout() {
		return "Practice your Scope volley";
	}

	@Override
	public String getDailyFortune() {
		return null;
	}

}
