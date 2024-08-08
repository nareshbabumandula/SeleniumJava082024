package com.java.oops;

public class InorbitM extends Theatre
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
InorbitM inorbitM=new InorbitM();
inorbitM.telugushows();
inorbitM.hindishows();
inorbitM.agelimit();
inorbitM.screentypes();
		
	}
void telugushows() 
{
	System.out.println("KALKI,RRR,PUSHPA2");
}
void hindishows()
{
	System.out.println("KALKI,SULTAN,JAVAAN");
}
void agelimit()
{
	System.out.println("G-General Audience,PG=Parental Guidance,PG-13:Age group Under 13 not allowed,R:Restricted");
}
void screentypes()
{
	System.out.println("2D,3D");
}
}
