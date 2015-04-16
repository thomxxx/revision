package com.assurancesio;

public class Moto extends Vehicule {
      public boolean antivol;
      
      
      public Moto(boolean antivol) {
		super();
		this.antivol = antivol;
	}
	public void setAntivol(){
    	  antivol = true;
      }
      public void removeAntivol(){
    	  antivol = false;
      }
      public boolean hasAntivol(){
    	  return antivol;
      }



}
