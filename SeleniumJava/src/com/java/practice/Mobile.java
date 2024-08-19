package com.java.practice;

public interface Mobile {
	//Abstract methods
	void makecall();
	void sendmessage();
	void browseInternet();
	void takephoto();
	void playmusic();

	//static methods
	static void showbatterystatus() {
		System.out.println("Mobile battery status is :75");
	}

	static void displayNetworkInfo() {
		System.out.println("Network: 4G LTE");
	}

	// Default methods
	default void enableBluetooth() {
		System.out.println("Bluetooth enabled.");
	}

	default void enableGPS() {
		System.out.println("GPS enabled.");
	}
	public static void main (String []args) {
		//Mobile mobile=new Mobile();
		Mobile.showbatterystatus();
		Mobile.displayNetworkInfo();
	
	}
}
