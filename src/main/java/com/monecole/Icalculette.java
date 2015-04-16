package com.monecole;

public interface Icalculette {
	
	/**
	 * @param nombre1 Le nombre 1
	 * @param nombre2 Le nombre 2
	 * @return Le résultat de l'addition entre les deux nombres
	 */
	Integer addition(Integer nombre1,Integer nombre2);
	
	/**
	* @param nombre1 Le nombre 1
	 * @param nombre2 Le nombre 2
	 * @return Le résultat de la soustraction entre les deux nombres
	 */
	Integer soustraction(Integer nombre1,Integer nombre2);
	
	/**
	* @param nombre1 Le nombre 1
	 * @param nombre2 Le nombre 2
	 * @return Le résultat de la multiplication entre les deux nombres
	 */
	Integer multiplication(Integer nombre1,Integer nombre2);
	
	/**
	* @param nombre1 Le nombre 1
	 * @param nombre2 Le nombre 2
	 * @return Le résultat de la division entre les deux nombres
	 */
	Integer division(Integer nombre1,Integer nombre2);

}
