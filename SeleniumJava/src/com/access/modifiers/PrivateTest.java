package com.access.modifiers;

public class PrivateTest {
	
	// private String variable
	private String username="alex";
	
	// private method
	private void m1() {
		System.out.println("Executing private m1 method..!");
	}
	
	// private constructor
	private PrivateTest() {
		System.out.println("This is a private constructor..!");
	}
		
	public static void main(String[] args) {
		PrivateTest pt = new PrivateTest();
		System.out.println(pt.username);
		pt.m1();
	}

}
