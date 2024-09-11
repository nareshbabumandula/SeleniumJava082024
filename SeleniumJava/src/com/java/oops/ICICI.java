package com.java.oops;

public class ICICI extends RBI{


	public static void main(String[] args) {
		ICICI icici = new ICICI();
		icici.loans();
		icici.accountClosing();
		icici.accountOpening();
		icici.KYC();
		icici.creditcard();
	}
		
	@Override
	void loans() {
		System.out.println("Loans facility is available..!");
	}

	@Override
	void accountOpening() {
		System.out.println("Account Opening facility is available..!");
	}

	@Override
	void accountClosing() {
		System.out.println("Account closing facility is available..!");
	}

	@Override
	void KYC() {
		System.out.println("KYC facility is available..!");
	}

}
