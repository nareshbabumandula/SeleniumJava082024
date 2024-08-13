package com.oops.practice;

public class HP extends Laptop
{
void CPU()
{
	System.out.println("CPU is 12th Gen 8 cores");
}
void RAM()
{
	System.out.println("RAM Memory is 32GB");
}
void Batterylife()
{
	System.out.println("Battery Life is Upto 17 hours");
}
public static void main(String[] args)
{
HP hp=new HP();
hp.CPU();
hp.RAM();
hp.Batterylife();
hp.mouse();
	}
}

