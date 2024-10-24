package com.java.oops;

public class InorbitM implements Theatre
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
InorbitM inorbitM=new InorbitM();
inorbitM.telugushows();
inorbitM.hindishows();
inorbitM.agelimit();
inorbitM.screentypes();
inorbitM.carParking(100);
inorbitM.bikeParking(150);
inorbitM.soundSystem(true);
inorbitM.emergencyExit(5);
inorbitM.canteen(20);
inorbitM.fireandSafety("entire buiding");
inorbitM.displayTheatreName("PVR");

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
@Override
public void carParking(int numberOfCars) {
	System.out.println("Number of cars parked: " + numberOfCars);
	
}
@Override
public void bikeParking(int numberOfBikes) {
	System.out.println("Number of bikes parked: " + numberOfBikes);
	
}
@Override
public void soundSystem(boolean isSoundSytemOn) {
	if (isSoundSytemOn) {
		System.out.println("The sound system is ON");
	} else {
		System.out.println("The sound system is OFF");
	}
}
@Override
public void emergencyExit(int numberOfExits) {
	System.out.println("Number of emergency exits available : "+ numberOfExits);
}
@Override
public void fireandSafety(String safetyProtocol) {
	System.out.println("Fire and Safety protocol being followed for the : " + safetyProtocol);
}
@Override
public void canteen(int availbleItems) {
	System.out.println("Number of items available in the canteen : " +availbleItems);
}
@Override
public void seatingCategories(String categoryType, int numberOfSeats) {
	System.out.println("Seating Category : " + categoryType + "| number of seats avaiable : " + numberOfSeats);
	
}
}
