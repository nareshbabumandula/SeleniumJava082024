package com.java.practice;

public class Iphone implements Mobile {

	public static void main(String[] args) {
		Iphone IP=new Iphone();

		IP.makecall();
		IP.sendmessage();
		IP.browseInternet();
		IP.takephoto();
		IP.browseInternet();
		
		IP.enableBluetooth();
		IP.enableGPS();
	}

	@Override
	public void makecall() {
		System.out.println("Making a call from the Iphone...");

	}

	@Override
	public void sendmessage() {
		System.out.println("Sending a message from the Iphone...");

	}

	@Override
	public void browseInternet() {
		System.out.println("Browsing the internet on the  Iphone..");

	}

	@Override
	public void takephoto() {
		System.out.println("Taking the photo from the Iphone...");
	}

	@Override
	public void playmusic() {
		System.out.println("Playing the music on the Iphone...");

	}

}
