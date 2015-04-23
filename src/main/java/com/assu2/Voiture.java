package com.assu2;

public class Voiture extends Vehicule {
	public boolean tatouageVitre;
	
	
	public Voiture() {
		super();
	}
	public void tatouerVitre(){
		tatouageVitre=true;
	}
	public void detatouerVitre(){
		tatouageVitre=false;
	}

}
