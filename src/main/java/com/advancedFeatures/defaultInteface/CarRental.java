package com.advancedFeatures.defaultInteface;

public class CarRental implements Vehical {

	@Override
	public String getBrand() {
		
		return "SwiftDesire";
	}

	@Override
	public String speedUp() {
		
		return "40KM per hour";
	}

}
