package com.exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedAndUncheckedExceptionsTest {

	/**Exception: In Java an exception is an event which disrupts the normal flow of the program execution.
	 * It is an object which is thrown at runtime.
	 * 
	 * Exception Handling: It's one of the mechanism to handle the runtime errors, so that the normal flow of the 
	 * program/application/code can be maintained. 
	 * 
	 * Types of Java Exceptions:
	 * 
	 * 1. Checked Exception
	 * 2. Unchecked Exception
	 * 3. Error
	 * 
	**/
	
	void noExceptionHandlingExample() {
		int a=100;
		int b=0;
		int c=a/b; // Arithmetic exception at runtime 
		System.out.println("Rest of the code..!");
	}
	
	void exceptionHandlingUsingThrows() throws ArithmeticException{
		int a=100;
		int b=0;
		int c=a/b;
		System.out.println("Rest of the code..!");
	}
	
	void uncheckedExceptionExample() {
			
		try {
			String[] names = {"Sajjad", "Seshu", "Noor", "Preethi", "Gouthami"};
			System.out.println(names.length);
			System.out.println(names[0]);
			System.out.println(names[1]);
			System.out.println(names[2]);
			System.out.println(names[3]);
			System.out.println(names[4]);
			System.out.println(names[5]);
			String str=null;
			System.out.println(str.length());
			int a=100;
			int b=10;
			int c=a/b;
		} 
		catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("Rest of the code in ArithmeticException catch block..!");
		} 
		catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("Rest of the code in IndexOutOfBoundsException catch block..!");
		} 
		catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println("Rest of the code in nullpointeexception catch block..!");
		} 
		catch (RuntimeException e) {
			e.printStackTrace();
			System.out.println("Rest of the code in RuntimeException catch block..!");
		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("Rest of the code in Exception catch block..!");
		}
		catch (Throwable e) {
			e.printStackTrace();
			System.out.println("Rest of the code in Throwable catch block..!");
		}
		finally {
			System.out.println("Executing finally block..!");
		}
	}
	
	void m1() {
		System.out.println("Executing m1 method..!");
	}
	/**
	 * Checked exceptions occur during the code compilation time itself. It means before the code gets executed the java compiler will show an error
	 * at the line of code where the exception needs to be handled. 
	 * @throws FileNotFoundException 
	 * 
	 */
	void checkedExceptionExample() {
		try {
			FileReader fr = new FileReader("./Data.txt");
			BufferedReader br = new BufferedReader(fr);
			String str;
			while ((str=br.readLine())!=null) {
				System.out.println(str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		
	public static void main(String[] args) {
		CheckedAndUncheckedExceptionsTest cet = new CheckedAndUncheckedExceptionsTest();
		//cet.noExceptionHandlingExample();
		//cet.exceptionHandlingUsingThrows();
		cet.checkedExceptionExample();
		cet.uncheckedExceptionExample();
		cet.m1();
	}

}
