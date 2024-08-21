package com.access.modifiers;

public class ProtectedOutsideTest {

	public static void main(String[] args) {
		ProtectedTest pt = new ProtectedTest();
		System.out.println(pt.username);
		pt.m1();
	}

}
