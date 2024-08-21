package com.access.modifiers;

public class PublicOutsideTest {

	public static void main(String[] args) {
		PublicTest pt = new PublicTest();
		System.out.println(pt.username);
		pt.m1();
	}

}
