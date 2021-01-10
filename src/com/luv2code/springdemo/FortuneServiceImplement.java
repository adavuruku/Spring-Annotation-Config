package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class FortuneServiceImplement implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is your lucky day!";
	}
}
