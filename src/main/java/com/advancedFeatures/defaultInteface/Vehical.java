package com.advancedFeatures.defaultInteface;

public interface Vehical {
	
	String getBrand();
	String speedUp();
	
	default int calculateRent(int km, int ratePerKm) {
		
		return km*ratePerKm;
	}

}
