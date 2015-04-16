package com.monecole;

public class power {
	
	Calculette calculette = new Calculette();
	
	/**
	 * @param nombre 
	 * @return nombre * nombre pour calculer le carré d'un nombre
	 */
	public Integer NombreAuCarré(Integer nombre) {
		if (nombre == null){
			throw new RuntimeException("impossible ");
	    }
	return calculette.multiplication(nombre, nombre);
	}
}
