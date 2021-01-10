package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoachDISetter implements Coach {
	private FortuneService fortuneService;
	
	public TennisCoachDISetter() {
		System.out.println("Inside Default Setter Constructor");
	}
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	@Autowired
	public void setFortuneService(@Qualifier("anotherFortuneServiceImplement") FortuneService fortuneService) {
		System.out.println("TennisCoach: inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}

}
