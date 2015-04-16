package com.monecole;

public class Calculette implements Icalculette{

	public Integer addition(Integer nombre1, Integer nombre2) {
		if (nombre1 == null || nombre2 ==null){
			throw new RuntimeException("impossible de faire une addition si au moins un nombre est null");
		}
		return nombre1 + nombre2;
	}

	public Integer soustraction(Integer nombre1, Integer nombre2) {
		if (nombre1 == null || nombre2 ==null){
			throw new RuntimeException("impossible de faire une soustraction si au moins un nombre est null");
		}	
		return nombre1 - nombre2;
	}

	public Integer multiplication(Integer nombre1, Integer nombre2) {
		if (nombre1 == null || nombre2 ==null){
			throw new RuntimeException("impossible de faire une multiplication si au moins un nombre est null");
		}	
		return nombre1 * nombre2;
	}

	public Integer division(Integer nombre1, Integer nombre2) {
		if (nombre1 == null || nombre2 ==null){
			throw new RuntimeException("impossible de faire une division si au moins un nombre est nulle");
		}	
		else if (nombre2 == 0){
			throw new RuntimeException("impossible de faire une division si le 2eme nombre est égale a zero");
		}
		return nombre1 / nombre2;
	}

	
}
