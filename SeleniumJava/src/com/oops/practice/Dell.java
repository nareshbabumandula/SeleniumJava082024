package com.oops.practice;

public class Dell extends Laptop {
	
	void CPU()
	{
System.out.println("12th Gen core i7");
	}
	void RAM()
	{
		System.out.println("32GB");
	}
	void Batterylife()
	{
		System.out.println("Upto 7hrs");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Dell dell=new Dell();
dell.CPU();
dell.RAM();
dell.Batterylife();
dell.mouse();
	}

}
