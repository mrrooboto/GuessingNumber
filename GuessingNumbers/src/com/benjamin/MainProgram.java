package com.benjamin;
import java.util.Scanner;

public class MainProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String playAgain = "";
		do {
			//create a random number for the user to guess
			int theNumber = (int)(Math.random() * 100 + 1);
			int guess = 0;
			int numOfTries = 0;
			while (guess != theNumber) {
				System.out.println("Guess a number between 1 and 100:");
				guess = sc.nextInt();
				System.out.println("You entered " + guess + ".");
				if (guess < theNumber) {
					System.out.println(guess + " is too low. Try again.");
				} else if (guess > theNumber) {
					System.out.println(guess + " is too high. Try again.");
				} else {
					System.out.println(guess + " is correct. You win!");
				} 
				numOfTries++;
			}	// end of the loop 
			System.out.println("It only took you " + numOfTries + " tries! Good work!");
			System.out.println("Would you like to play again ? (y/n)?");
			playAgain = sc.next();
		} while (playAgain.equalsIgnoreCase("y"));
		System.out.println("Thank you for playing! Goodbye.");
		sc.close();
		
	}
}
