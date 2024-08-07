package com.java.oops;

public abstract class RBI {
	
	/**
	 * Abstraction : Showing only the functionality to the end user by hiding it internal details
	 * e.g. messaging, whatsapp call, facebook posts, bluetooth etc
	 */
	// abstract method or unimplemented methods or bodyless methods
	abstract void loans();
	abstract void accountOpening();
	abstract void accountClosing();
	abstract void KYC();
		
	// User defined abstract method or concrete java method 
	void creditcard() {
		// method body or code implementation
		System.out.println("Creditcard facility may or may not be there.!");
	}
	

	public static void main(String[] args) {
		
	}

}
