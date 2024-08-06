package com.java.basics;

public class WrapperClassesTest {

	/**
	 * Wrapper classes: Wrapper classes are used to convert primitive data types into objects.
	 * Each primitive data type has a corresponding wrapper class as shown below.
	 * 
	 * byte --> Byte
	 * short --> Short
	 * int --> Integer
	 * long --> Long
	 * float --> Float
	 * double --> Double
	 * char --> Character
	 * boolean --> Boolean
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Autoboxing:Automatic conversion of primitive data type into its corresponding wrapper class is called 
		byte b = 106;
		Byte b1 = Byte.valueOf(b); // Converting byte into Byte explicitly
		Byte b2=b; // implicit autoboxing, now the compiler will write Integer.valueOf(b) internally
		System.out.println(b + " " + b1  + " " +b2);
		
		System.out.println(b1.MIN_VALUE + " " + b1.MAX_VALUE);
		
		// Unboxing: The automatic conversion of object type into its corresponding primitive type
		Byte b3 = new Byte(b);
		byte b4=b3.byteValue();
		byte b5=b3; // Here b3 is a object type and b5 is a primitive type
		System.out.println(b3 + " " + b4  + " " +b5);
	}

}
