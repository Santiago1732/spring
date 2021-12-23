package com.santiago.springdemo;

public class ImpFortuneService implements FortuneService{

	@Override
	public String getDailyFortune() {
		return "Today is your lucky day!!";
	}

}
