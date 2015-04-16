package com.assu2;

public class Moto extends Vehicule {
	public boolean antivol;
	
	
	public void setAntivol(){
		antivol=true;
	}
	public void removeAntivol(){
		antivol=false;
	}
	
	public boolean hasAntivol(){
		return antivol;
	}

}
