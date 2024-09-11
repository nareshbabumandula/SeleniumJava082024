package com.control.statements;

public class DoWhileTest {

	public void doWhileExample() {
		int i=0;
		do {
			System.out.println(i);
			i++;
		} while (i<=10);
	}
	
	public static void main(String[] args) {
		DoWhileTest dwt = new DoWhileTest();
		dwt.doWhileExample();
	}

}
