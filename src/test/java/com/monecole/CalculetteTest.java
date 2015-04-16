package com.monecole;

import junit.framework.Assert;

import org.junit.Test;

public class CalculetteTest {

	Calculette calculette = new Calculette();

	@Test
	public void testAdditionDoitRenvoyerLeBonResultat() {
		int resultat = calculette.addition(2, 3);
		Assert.assertEquals("Mauvais résultat de l'addition", 5, resultat);

	}

	@Test(expected = RuntimeException.class)
	public void testAdditionNeDoitPasAccepterDeParametre1null() {
		calculette.addition(null, 3);
	}

	@Test(expected = RuntimeException.class)
	public void testAdditionNeDoitPasAccepterDeParametre2null() {
		calculette.addition(3, null);
	}
	
	
	@Test
	public void testSoustractionDoitRenvoyerLeBonResultat() {
		int resultat = calculette.soustraction(2, 3);
		Assert.assertEquals("Mauvais résultat de la soustraction", -1, resultat);	
	}	
		
	@Test(expected = RuntimeException.class)
	public void testSoustractionNeDoitPasAccepterDeParametre1null() {
		calculette.soustraction(null, 2);
	}
	
	@Test(expected = RuntimeException.class)
	public void testSoustractionNeDoitPasAccepterDeParametre2null() {
		calculette.soustraction(2, null);
	}
	
	
	
	@Test
	public void testMultiplicationDoitRenvoyerLeBonResultat() {
		int resultat = calculette.multiplication(2, 3);
		Assert.assertEquals("Mauvais résultat de la multiplication", 6, resultat);
	}	
		
	@Test(expected = RuntimeException.class)
	public void testMultiplicationNeDoitPasAccepterDeParametre1null() {
		calculette.multiplication(null, 2);
	}
	
	@Test(expected = RuntimeException.class)
	public void testMultiplicationNeDoitPasAccepterDeParametre2null() {
		calculette.multiplication(2, null);
	}
	
	
	
	
	@Test
	public void testDivisionDoitRenvoyerLeBonResultat() {
		int resultat = calculette.division(4, 2);
		Assert.assertEquals("Mauvais résultat de la division", 2, resultat);	
	}	
		
	@Test(expected = RuntimeException.class)
	public void testDivisionNeDoitPasAccepterDeParametre1null() {
		calculette.division(null, 2);
	}
	
	@Test(expected = RuntimeException.class)
	public void testDivisionNeDoitPasAccepterDeParametre2null() {
		calculette.division(2, null);
	}
	
	@Test(expected = RuntimeException.class)
	public void TestDivisionNeDoitPasAccepterDeParametre2Zero() {
		calculette.division(2, 0);
	}
	
	
	

	
}
