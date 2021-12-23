package com.santiago.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
	
	public static void main(String[] args) {
		
//		importar el ClassPathXmlApplicationContext y cargar el archivo de configuracion
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");

//		Recuperar el bean del contenedor
		//										 Bean ID       Interface
		Entrenador entrenador = context.getBean("entrenador", Entrenador.class);
		
//		Llamar al metodo con el bean
		System.out.println(entrenador.getEntrenamientoDiario());
		
//		cerrar el contexto
		context.close();
		
	}

}
