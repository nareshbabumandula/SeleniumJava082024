package com.exceptions;

public class TestCustomException {
	
	public static void castVote(int age) throws InvalidAgeException {
		if (age<18) {
			throw new InvalidAgeException("Age should be greater than or equal to 18 to cast vote");
		} else {
			System.out.println("Casted vote..!");
		}
	}

	public static void main(String[] args) throws InvalidAgeException {
		castVote(17);
	}

}
