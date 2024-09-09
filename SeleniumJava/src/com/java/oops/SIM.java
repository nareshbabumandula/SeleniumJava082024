package com.java.oops;

/**
 * interface: To achieve 100% abstraction we go for interface
 * 1. Interface will not allow non-abstract concrete methods(method with body)
 * 2. By default all the methods and variables are abstract and final in an interface
 * 3. 4. We can't instantiate an interface because it only defines method signatures, not the implementation
 * 
 * Note: In object oriented programming, an abstract class or an interface is a blueprint/contract/template that
 * cannot be instantiated directly. The reason for this is that these constructs are designed to define
 * a common structure or contract without providing a complete implementation.
 *  
 * @author naresh
 *
 */
public interface SIM extends Mobile,Network {
	
	String size = "0.75mm";
	String model="";
	int price=100;
	
	void SIMNumber();
	
	static void getManufacturer(String manufacturer) {
		System.out.println("Manufacturer is : " + manufacturer);
	}
	
	default void getSIMType(String simType) {
		System.out.println("SIM type is : " + simType);
	}
	
	public static void main(String[] args) {
		//SIM s = new SIM();  // Cannot instantiate the type SIM
	}
	

}
