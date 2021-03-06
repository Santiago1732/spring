package com.santiago.springdemo;

public class EntrenadorFutbol implements Entrenador {
//
//	Definir el constructor para los services
//	1) Definimos un campo privado llamando al service
	private FortuneService fortuneService;
	
	//2) Creamos el constructor:
	public EntrenadorFutbol(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Entrenamiento de pases por 20 minutos";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}
	
	

}
