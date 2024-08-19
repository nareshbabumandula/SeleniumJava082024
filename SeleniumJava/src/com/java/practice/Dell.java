package com.java.practice;

public class Dell extends Laptop {
	void powerOn() {
        System.out.println("Dell laptop is powering on...");
    }

    void powerOff() {
        System.out.println("Dell laptop is powering off...");
    }

	public static void main(String[] args) {
		Dell dell =new Dell();
		dell.powerOn();
		dell.powerOff();
		dell.increaseVolume();
		dell.showBatteryStatus();
		dell.chargeBattery();
		
		
	}

}
