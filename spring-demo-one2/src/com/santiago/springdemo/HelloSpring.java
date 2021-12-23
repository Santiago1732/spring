package com.santiago.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {
	
	public static void main(String[] args) {
		
//		Establecemos la config xml del IoC
		ClassPathXmlApplicationContext context = new
				ClassPathXmlApplicationContext("applicationContext.xml");
		
//		Recuperamos los beans del contenedor
//		Director director = context.getBean("director", Director.class);
		MaestraLengua maestraLengua = context.getBean("maestraLengua", MaestraLengua.class);
		MaestraPlastica maestraPlastica = context.getBean("maestraPlastica", MaestraPlastica.class);
		MaestroMatematica maestroMatematica = context.getBean("maestroMatematica", MaestroMatematica.class);
		
//		ahora podemos usar nuestros objetos generados en el IoC y usar los metodos
		
//		System.out.println("Comunicado del director a las maestras:"+director.comunicarProgramaMaterias());
		System.out.println("Comunicaodo de maestra lengua a sus compañeras"+maestraLengua.recibosSueldo());
		System.out.println("Comunicaodo de maestra plastica a los alumnos"+maestraPlastica.comunicarProgramaMaterias());
	}

}
