package com.java.practice;

public class PayPalPayment extends  PaymentMethod{
	
	@Override
    void processPayment() {
       System.out.println("Processing PayPalPayment of " + amount + " " + currency);
   }
	
	void refund(double amount) {
        System.out.println("Refunding " + amount + " " + currency + " to PayPal account.");
    }

	public static void main(String[] args) {
		PayPalPayment PPP=new PayPalPayment();
		 PPP.processPayment();
		 PPP.refund(0);
		 
		 
	}

}
