package com.java.oops;

public class Airtel implements SIM{
 
	public static void main(String[] args) {
		Airtel airtel = new Airtel();
		airtel.SIMNumber();
		airtel.getSIMType("Nano");
		SIM.getManufacturer("Airtel");
		//airtel.price=200; // Doesn't allow because price variable is final
		System.out.println(airtel.price);
	}

	@Override
	public void SIMNumber() {
		// implementation or logic
		System.out.println("SIM has a number");
	}

	@Override
	public void name() {
		System.out.println("SIM name is Airtel");
	}

}
