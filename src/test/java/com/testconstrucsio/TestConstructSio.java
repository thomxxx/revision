package com.testconstrucsio;

import org.junit.Assert;
import org.junit.Test;

import com.constructsio.Batiments;
import com.constructsio.Immeuble;
import com.constructsio.Maison;
import com.constructsio.Option;

public class TestConstructSio {
	
	
	@Test  // Test afin de calculer le prix du batiment + le prix d'une option 1 et 2 que je définis
	public void testCalculerPrixAvecPrixValeurParDefaut(){
		Batiments batiment1 = new Batiments();
		batiment1.option1.prix=2500;
		batiment1.option2.prix=5000;
		Assert.assertEquals(7500,batiment1.calculerPrix()); // On s'apercois bien que le prix de base d'un batiment est de 0
	}
	
		
	@Test(expected = RuntimeException.class)  // test afin de montrer qu'il me renvoit bien une exception de if prix < 0 
	public void testCalculerPrixNegatif(){
		Batiments batiment2 = new Batiments();
		batiment2.prix=-10;
		batiment2.calculerPrix();
	}
	
	@Test // Afin de montrer que la valeur par defaut est bien de 150 000 euros
	public void testCalculerValeurPrixMaison(){
		Maison maison1 = new Maison();
		Assert.assertEquals(150000,maison1.prix);
		}
	
	@Test // Afin de montrer que la valeur par defaut est bien de 1M pour l'immeuble
	public void testCalculerValeurPrixImmeuble(){
		Immeuble immeuble1 = new Immeuble();
		Assert.assertEquals(1000000, immeuble1.prix);
	}
	
	@Test // Afin de montrer la valeur par defaut d'un prix d'une option
	public void testCalculerValeurPrixOption(){
		Option option3 = new Option();
		Assert.assertEquals(0,option3.prix);
	}
	
	@Test // Afin de montrer la valeur par defaut de la description
	public void testDescriptifOption(){
		Option option4 = new Option();
		Assert.assertEquals("option non defini", option4.description);
	}
	
	@Test // Afin de pouvoir modifier le nombre d'etage d'un immeuble
	public void testNombreEtageImmeuble(){
		Immeuble immeuble2 = new Immeuble();
		immeuble2.nombreEtage=4;
		Assert.assertEquals(4,immeuble2.nombreEtage);
	}
	
	@Test  // test afin de verifier si construction retourne bien true que on est en construction
	public void testEnconstruction(){
		Batiments batiment3 = new Batiments();
		batiment3.enConstruction();
		Assert.assertEquals(true,batiment3.construction);
	}
	@Test // test afin de verifier si construction retourne bien false quand il n'est pas en construction
	public void testPasEnConstruction(){
		Batiments batiment4 = new Batiments();
		batiment4.pasEnConstruction();
		Assert.assertEquals(false,batiment4.construction);
	}
	
	@Test // test afin de verifier si le paiement retourne bien true quand le paiement est effectué
	public void testBatimentPaiementEffectue(){
		Batiments batiment5 = new Batiments();
		batiment5.paiementEffectue();
		Assert.assertEquals(true,batiment5.paiement);
	}
	
	@Test // test afin de verifier si le paiement retourne bien false quand le paiement n'est pas effectué
	public void testBatimentPaiementPasEffectue(){
		Batiments batiment6 = new Batiments();
		batiment6.paiementNonEffectue();
		Assert.assertEquals(false,batiment6.paiement);
	}
		



}
