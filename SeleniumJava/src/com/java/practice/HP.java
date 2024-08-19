package com.java.practice;

public class HP extends Laptop{
	void powerOn() {
		System.out.println("HP laptop is powering on... ");
	}
	void powerOff() {
		System.out.println("HP laptop is powering off...");
	}
	
public static void main (String args[]) {
	HP hp=new HP();
	hp.chargeBattery();
	hp.increaseVolume();
	hp.powerOff();
	hp.powerOn();
	hp.showBatteryStatus();
}
}
