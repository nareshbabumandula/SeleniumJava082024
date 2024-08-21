package com.access.modifiers;

public class ProtectedTest {
	
	// protected variable
	protected String username="alex";
	
	// protected method
	protected void m1() {
		System.out.println("Executing protected m1 method..!");
	}
	
	// protected constructor
	protected ProtectedTest() {
		System.out.println("This is a protected constructor..!");
	}
	
	public static void main(String[] args) {
		ProtectedTest pt = new ProtectedTest();
		System.out.println(pt.username);
		pt.m1();
	}

}
