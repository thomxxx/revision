package com.assurancesio;

public class Voiture extends Vehicule {
	public boolean tatouageVitre;
	
	public Voiture(boolean tatouageVitre) {
		super();
		this.tatouageVitre = tatouageVitre;
	}
	public void tatouerVitre(){
		tatouageVitre = true;
	}
	public void detatouerVitre(){
		tatouageVitre = false;
	}
	

}
