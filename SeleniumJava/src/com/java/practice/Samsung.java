package com.java.practice;

public class Samsung implements Mobile {

	public static void main(String[] args) {
		Samsung smg=new Samsung();

		smg.makecall();
		smg.sendmessage();
		smg.browseInternet();
		smg.takephoto();
		smg.playmusic();
		
		smg.enableBluetooth();
		smg.enableGPS();
	}

	@Override
	public void makecall() {
		System.out.println("Making a call from the Samsung...");

	}

	@Override
	public void sendmessage() {
		System.out.println("Sending a message from the Samsung...");

	}

	@Override
	public void browseInternet() {
		System.out.println("Browsing the internet on the  Samsung..");

	}

	@Override
	public void takephoto() {
		System.out.println("Taking the photo from the Samsung...");
	}

	@Override
	public void playmusic() {
		System.out.println("Playing the music on the Samsung...");

	}
    
}
