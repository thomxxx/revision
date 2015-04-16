package com.assurancesio;

import org.junit.Assert;
import org.junit.Test;


public class TestVehicule {
	
	
	@Test
	public void testCalculerPrix(){
		Vehicule vehicule1 = new Vehicule();
		vehicule1.option1.prix=150;
		vehicule1.option2.prix=200;
		Assert.assertEquals(1350,vehicule1.calculerPrix());
	}
	
	@Test
	public void testCalculerPrix2(){
		Vehicule vehicule1 = new Vehicule(500);
		vehicule1.option1.prix=150;
		vehicule1.option2.prix=200;
		Assert.assertEquals(850,vehicule1.calculerPrix());
	}
	
	@Test(expected=RuntimeException.class)
	public void testRetourneException(){
		Vehicule vehicule1 = new Vehicule(-5);
		vehicule1.calculerPrix();
		//Assert.assertEquals(345,vehicule1.calculerPrix());
		
	}
	

}
