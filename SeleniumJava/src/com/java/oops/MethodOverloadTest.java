package com.java.oops;
/**
 * Polymorphism: Poly - many and morphism - forms --> Same thing existing in different forms (e.g Tooth paste 50g, 100g, 150g etc)
 * 
 * Polymorphism can be achieved in 2 ways
 * 
 * 1. Method Overloading - To achieve method overloading we must have more than one method in a class with same name and different signatures
 * 2. Method Overriding - To achieve method overriding we must have alteast one method between the classes with IS-A relationship with same name and same signature
 * 
 *
 */
public class MethodOverloadTest {
	
	int a=10;
	int b=20;
	
	void m2() {
		System.out.println("Executing m2 method in MethodOverloadTest class");
	}
	
	void addition() {
		int c=a+b;
		System.out.println("Addition of a and b is : " +c);
	}
	
	void addition(int a, int b) {
		int c=a+b;
		System.out.println("Addition of a and b with parameters is : " +c);
	}
	
	void addition(double a, double b) {
		double c=a+b;
		System.out.println("Addition of double a and b with parameters is : " +c);
	}

	public static void main(String[] args) {
		MethodOverloadTest mot = new MethodOverloadTest();
		mot.addition();
		mot.addition(100, 200);
		mot.addition(124.677, 578.985);
	}

}
