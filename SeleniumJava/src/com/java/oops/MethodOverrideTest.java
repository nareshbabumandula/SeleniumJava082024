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
public class MethodOverrideTest extends MethodOverloadTest{
	
	int a=40;
	int b=60;
	
	void addition() {
		int c=a+b;
		System.out.println("Addition of a and b in subclass is : " +c);
	}
	
	void m1() {
		super.addition();
		System.out.println(super.a);
		System.out.println(super.b);
		this.addition();
		System.out.println(this.a);
		System.out.println(this.b);
	}
	
	public static void main(String[] args) {
		MethodOverrideTest mot = new MethodOverrideTest();
		mot.addition();
		mot.m1();
	}

}
