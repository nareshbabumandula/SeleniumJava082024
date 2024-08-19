package com.java.practice;

public class Bike {

	public static void main(String[] args) {
		Bike bike=new Bike();
		bike.startEngine();
		bike.stopEngine();

	}
void startEngine() {
	System.out.println("Bike engine started.");
}
void stopEngine() {
	System.out.println("Bike engine stopped.");
}
}
