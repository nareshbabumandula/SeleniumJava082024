package com.java.collections;

import java.util.ArrayList;

public class ArrayListTest {

	/**
	 * ArrayList: The ArrayList class implements the List interface. 
	 * It uses a dynamic array to store the duplicate element of different data types. 
	 * The ArrayList class maintains the insertion order and is non-synchronized. 
	 * The elements stored in the ArrayList class can be randomly accessed. 
	 * Consider the following example.
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList alist = new ArrayList<>();
		alist.add("Seshu");
		alist.add("Noor");
		alist.add("Sajjad");
		alist.add("Gouthami");
		alist.add("Preethi");
		alist.add("Noor");
		
		System.out.println(alist.get(0));
		System.out.println(alist.size());
		System.out.println(alist);
	}

}
