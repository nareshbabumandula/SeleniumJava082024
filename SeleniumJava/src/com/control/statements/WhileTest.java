package com.control.statements;

public class WhileTest {
	
	void whileExample() {
		int a=10;
		
		while (a<10) {
			System.out.println(a);
			a++;
		}
	}

	public static void main(String[] args) {
		WhileTest wt = new WhileTest();
		wt.whileExample();
	}

}
