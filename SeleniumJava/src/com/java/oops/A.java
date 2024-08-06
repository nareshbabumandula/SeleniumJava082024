package com.java.oops;

public class A {
	// Instance variables
	int a=10;
	int b=20;
		
	void addition() {
		int c=a+b;
		System.out.println("Addition of a and b is : "+c);
	}
	
	void division() {
		int c=b/a;
		System.out.println("Division result of a and b is : "+c);
	}

	static void modulus() {
		int a=40; // local variables
		int b=20;
		int c=a%b;
		System.out.println("Modulus result of b and a is : "+c);
	}

	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.a);
		System.out.println(a.b);
		a.addition();
		a.division();
		A.modulus(); // static methods can be called using the class reference
		modulus(); // Also static methods can be directly called inside the main method directly without using the object  reference
		
	}

}
