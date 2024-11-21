package com.oops.practice;

public class Samsung implements Mobile{

	public void storage(){
		System.out.println("Storage Capacity is 512GB");
	}

	public static void main(String[] args) {
		Samsung samsung=new Samsung();
		samsung.storage();
		System.out.println(Mobile.Mtype);
		Mobile.processor();
		samsung.frontCam();
	}
	
}
