package com.assusio;

public class Vehicule {
	public int prix;
	public String nom;
	public Option option1 = new Option();
	public Option option2 = new Option();
	
	public int CalculerPrix(){
		return prix+option1.prix+option2.prix;
		
	}
	
	
			

}
