package com.monecole;

import org.junit.Test;

import junit.framework.Assert;

public class PowerTest {
	
    power power = new power();	
	
    @Test
	public void testNbAuCarréDoitRenvoyerLeBonResultat() {
		int resultat = power.NombreAuCarré(2);
		Assert.assertEquals("Mauvais résultat", 4, resultat);
	}

    
    @Test(expected = RuntimeException.class)
	public void testNbAuCarreNeDoitPasAccepterDeNombrenull() {
		power.NombreAuCarré(null);
    }	
}
