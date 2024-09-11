package com.java.oops;

public class JIO implements SIM{

	public static void main(String[] args) {
		JIO jio = new JIO();
		jio.SIMNumber();
	}

	@Override
	public void SIMNumber() {
	  System.out.println("SIM number is printed on every JIO sim");
	}

	@Override
	public void name() {
		System.out.println("SIM name is JIO");
	}

	

}
