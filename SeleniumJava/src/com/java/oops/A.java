package com.java.oops;

public class A {
	
	int a=10;
	int b=20;
	
	void addition() {
		int c=a+b;
		System.out.println("Addition of a and b is : "+c);
	}
	
	void division() {
		int c=b/a;
		System.out.println("Division of a and b is : "+c);
	}


	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.a);
		System.out.println(a.b);
		a.addition();
		a.division();
	}

}
