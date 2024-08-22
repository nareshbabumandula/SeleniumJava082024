package com.java.basics;

public class IfElsePrg {

	public static void main(String[] args) {
		
		//Java Program Using if else Statement
				int marks=80;
				if (marks<35)
				{
					System.out.println("Student is Fail");
				}
				else if (marks>=35&&marks<60)
				{
					System.out.println("Student is Pass and got 'D' Grade");
				}
				else if(marks>=60&&marks<70) 
				{
					System.out.println("Student is Pass and got 'C' Grade");
				}
				else if(marks>=70&&marks<80)
				{
					System.out.println("Student is Pass and got 'B' Grade");
				}
				else if(marks>=80&&marks<90)
				{
					System.out.println("Student is Pass and got 'A' Grade");
				}
				else if(marks>=90&&marks<=100)
				{
					System.out.println("Student is Pass and got 'A+' Grade");
				}
				else
				{
				System.out.println("Invalid!");
				}
			}

}
