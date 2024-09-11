package com.java.oops;

public abstract class RBI {
	
	/**
	 * Abstraction : Showing only the functionality to the end user by hiding it internal details
	 * e.g. messaging, calling feature, whatsapp call, facebook posts, bluetooth etc
	 * 1. An abstract class can have abstract methods as well as non abstract methods
	 * 2. To achieve 0 to 100% abstraction we can go for abstract class
	 * 3. We cannot create an object reference for an abstract class because abstract class has partial implementation
	 * 4. We can't instantiate an abstract class directly because it might contain abstract methods that lack implementation
	 */
	// abstract method or unimplemented methods or bodyless methods
	abstract void loans();
	abstract void accountOpening();
	abstract void accountClosing();
	abstract void KYC();
		
	// User defined non-abstract method or concrete java method or method with body
	void creditcard() {
		// method body or code implementation
		System.out.println("Creditcard facility may or may not be there.!");
	}
	
	
	public static void main(String[] args) {
		// RBI rbi = new RBI(); // Cannot instantiate the type RBI
	}

}
