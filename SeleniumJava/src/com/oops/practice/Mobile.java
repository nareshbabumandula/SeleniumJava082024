package com.oops.practice;

public interface Mobile {

	String Mtype="smart phone";
	static void processor()
	{
		System.out.println("Qualcomm Snapdrop 7s Gen2");
	}
	default void rearCam()
	{
		System.out.println("50MP+50MP+8MP");
	}
	default void frontCam()
	{
		System.out.println("32MP");
	}
	void storage();
}
