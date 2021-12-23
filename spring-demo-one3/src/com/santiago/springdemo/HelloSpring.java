package com.santiago.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new
				ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		EntrenadorFutbol entrenadorFutbol = context.getBean("entrenadorFutbol", EntrenadorFutbol.class);
		EntrenadorBasquet entrenadorBasquet = context.getBean("entrenadorBasquet", EntrenadorBasquet.class);
		
		System.out.println("FUTBOL: "+entrenadorFutbol.getDailyWorkout());
		System.out.println("FUTBOL: "+entrenadorFutbol.getDailyFortune());
		
		System.out.println("BASQUET: "+entrenadorBasquet.getDailyFortune());
		System.out.println("BASQUET: "+entrenadorBasquet.getDailyWorkout());
	
	}

}
