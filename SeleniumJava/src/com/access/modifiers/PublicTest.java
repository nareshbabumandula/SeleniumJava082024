package com.access.modifiers;

public class PublicTest {
	
	// public variable
	public String username="alex";
	
	// public method
	public void m1() {
		System.out.println("Executing public m1 method..!");
	}
	
	// public constructor
	public PublicTest() {
		System.out.println("This is a public constructor..!");
	}
	
	public static void main(String[] args) {
		PublicTest pt = new PublicTest();
		System.out.println(pt.username);
		pt.m1();
	}

}
