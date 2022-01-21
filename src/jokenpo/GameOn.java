package jokenpo;

import java.util.Random;

import java.util.Scanner;

public class GameOn {

	public static void main(String[] args) {

		// Declare variables for user and computer
		int rock = 1;
		int paper = 2;
		int seizure = 3;
		int userOption;
		
		String userName;
		String userAnswer1 = "yes";

		
		// Read user keyboard 
		Scanner reader = new Scanner(System.in);
		
		// Greetings
		
		System.out.println("\nType your name:");
		userName = reader.nextLine();
		
		System.out.println("\nHello " + userName + " do you want to play a game?");
		userAnswer1 = reader.nextLine();
		
		
		System.out.println("-------------------------");
		System.out.println("Choose one option among " + "Rock " + rock + ", " + "Paper " + paper + " , " + "Seizure " + seizure + ".");
		userOption = reader.nextInt();
		
		// Creating a random number generator
		
		Random rand = new Random(); //instance of Random class;
		int computerAnswer = rand.nextInt((3 - 1) + 1) + 1; // generate Random number by computer
		System.out.println("Computer answer is " + computerAnswer + ".");
		
		if (computerAnswer == userOption) {
			System.out.println("That's a Tie!");
		} else if (computerAnswer == 1 || userOption == 2) {
			System.out.println("User Wins!");
		} else if (computerAnswer == 1 || userOption == 3) {
			System.out.println("Computer Wins");
		} else if (userOption == 1 || computerAnswer == 2) {
			System.out.println("Computer Wins");
		} else {
			System.out.println("User Wins");
		}
			
	}
	
}

