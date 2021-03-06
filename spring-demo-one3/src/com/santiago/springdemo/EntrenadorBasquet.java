package com.santiago.springdemo;

public class EntrenadorBasquet implements Entrenador {

	private FortuneService fortuneService;
	
	public EntrenadorBasquet(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Picar la pelota por media hora";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}

}
