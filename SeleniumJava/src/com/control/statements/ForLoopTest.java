package com.control.statements;

public class ForLoopTest {
	
	void forLoopExample() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Iteration is : " + i);
		}
	}
	
	void forLoopReverseExample() {
		System.out.println("Executing for loop in reverse order..!");
		for (int i = 10; i>=1; i--) {
			System.out.println("Iteration is : " + i);
		}
	}
	
	void evenOddExample() {
		for (int i = 1; i < 100; i++) {
			if (i%2==0) {
				System.out.println(i + " : is an even number");
			} else {
				System.out.println(i + " : is an odd number");
			}
		}
	}
	
	void primeCheck() {
		
		for (int i = 1; i <= 100; i++) {
			int counter=0;// This counter will be used to count the number of divisors of the current number i 
			for (int num = i; num>=1; num--) {
				if (i%num==0) {
					counter=counter+1;
				} 
			}
			if (counter==2) {
				System.out.println(i + " : is an prime number");
			}
		}
	}
	
	void forLoopWaysExample() {
		System.out.println("Different types of syntax in for loop..!");
		for (int i = 0; i<10;) {
			System.out.println("Value is : " + i);
			i++;
		}
	}

	public static void main(String[] args) {
		ForLoopTest flt = new ForLoopTest();
		flt.forLoopExample();
		flt.forLoopReverseExample();
		flt.evenOddExample();
		flt.primeCheck();
		flt.forLoopWaysExample();
	}

}
