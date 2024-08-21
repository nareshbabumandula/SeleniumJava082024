package com.access.modifiers;

public class DefaultTest {
	
	// default String variable
	String username="alex";
	
	// default method
	void m1() {
		System.out.println("Executing default m1 method..!");
	}
	
	// private constructor
	DefaultTest() {
		System.out.println("This is a default constructor..!");
	}
	
	public static void main(String[] args) {
		DefaultTest pt = new DefaultTest();
		System.out.println(pt.username);
		pt.m1();
	}

}
