package com.benjamin;

public class MainProgram {
	public static void main(String[] args) {
		//create a random number for the user to guess
		int theNumber = (int)(Math.random() * 100 + 1);
		System.out.println(theNumber);
	}
}
