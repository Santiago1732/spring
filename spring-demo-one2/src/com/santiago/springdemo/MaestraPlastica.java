package com.santiago.springdemo;

public class MaestraPlastica implements Director {

	@Override
	public String comunicarProgramaMaterias() {
		return "Se daran clases de 8 a 12";
	}

	@Override
	public String recibosSueldo() {
		return "Los recibos llegaran el dia 01 por www.recibosdesueldo.com";
	}

}
