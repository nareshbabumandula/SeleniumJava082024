package com.java.practice;

public class CreditCardPayment extends  PaymentMethod {
	
	@Override
	     void processPayment() {
	        System.out.println("Processing credit card payment of " + amount + " " + currency);
	    }
	    void refund(double amount) {
	        System.out.println("Refunding " + amount + " " + currency + " to credit card.");
	    }
	 

	public static void main(String[] args) {
	 
		CreditCardPayment CCP=new CreditCardPayment ();
		CCP.processPayment();
		CCP.refund(0);
		
	}

}
