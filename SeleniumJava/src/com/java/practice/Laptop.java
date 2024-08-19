package com.java.practice;

public abstract class Laptop {
	abstract void powerOn();
	abstract void powerOff();

	 void chargeBattery() {
		System.out.println("Charging battery.");
	}

	 void increaseVolume() {
		System.out.println("Increasing volume.");
	}

	 void showBatteryStatus() {
		System.out.println("Showing battery status.");
	}

		public static void main(String[] args) {
			//Laptop Ltp=new Laptop;
		}

	}
