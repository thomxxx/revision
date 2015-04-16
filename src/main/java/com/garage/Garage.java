package com.garage;

public class Garage {
	Voiture voiture1 = new Voiture();
	Voiture voiture2 = new Voiture();
	Vehicule moto1 = new Moto();
	Vehicule moto2 = new Moto();
    Vehicule camion1 = new Camion();
    Vehicule camion2 = new Camion();
	
	public void creerVoiture(String marque){
	
	voiture1.marque="Opel";
	voiture2.marque="Audi";
	}
	
	public void creerMoto(String couleur){
	
	moto1.couleur="Noir";
	moto2.couleur="Blanc";
	}
	
	public void creerCamion(String nbrRoue){
	
	camion1.nbrRoue="6";
	camion2.nbrRoue="8";
	}
	
}
