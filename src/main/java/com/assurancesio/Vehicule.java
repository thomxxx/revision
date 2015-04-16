package com.assurancesio;

public class Vehicule {
	public int prix=1000;
	public String nom;
	public Option option1 = new Option();
	public Option option2 = new Option();
	
	public Vehicule() {
		super();
	}



	public Vehicule(int prix) {
		super();
		this.prix = prix;
	}


    public int calculerPrix(){
		if (prix < 0){
			throw new RuntimeException("prix non valide");
		}
		return prix+option1.prix+option2.prix;
	}

}
