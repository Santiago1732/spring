package com.santiago.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new
				ClassPathXmlApplicationContext("applicationContext.xml");
		
		Santi santi = context.getBean("santi", com.santiago.springdemo.Santi.class);
		Fede fede = context.getBean("fede", com.santiago.springdemo.Fede.class);
		Oli oli = context.getBean("oli", com.santiago.springdemo.Oli.class);
		
		
		System.out.println("SANTI "+santi.cargarHoras());
		System.out.println("SANTI "+santi.compremosComida());
		System.out.println("FEDE "+fede.cargarHoras());
		System.out.println("FEDE "+fede.compremosComida());
		System.out.println("OLI "+oli.cargarHoras());
		System.out.println("OLI "+oli.compremosComida());
	}
	
	

	
}
