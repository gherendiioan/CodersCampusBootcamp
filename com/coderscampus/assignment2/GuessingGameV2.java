package com.coderscampus.assignment2;

import java.util.Random;
import java.util.Scanner;

public class GuessingGameV2 {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);

		Random generatedRandom = new Random();
		int numberToGuess = generatedRandom.nextInt(100) + 1;
		
	
		int numberOfChances = 5;

		while (numberOfChances > 0) {
			
			System.out.print("Please insert a number between 1 and 100: ");

			int usersNumber = userInput.nextInt();

			if (usersNumber < 1 || usersNumber > 100) {

				System.out.println("Your guess is not between 1 and 100, please try again");

			} else if (usersNumber < numberToGuess) {
				
				numberOfChances--;
				
				if(numberOfChances == 0) {
					break;	
				}
				
				System.out.println("Please pick a higher number");
				
				
			} else if (usersNumber > numberToGuess) {
				
				numberOfChances--;
				
				if(numberOfChances == 0) {
					break;
				}
				
				System.out.println("Please pick a lower number");
				
				
			} else if (usersNumber == numberToGuess) {
				System.out.println("You win!");
				break;
			}

		}

		if (numberOfChances == 0) {
			System.out.println("You lose!");
			System.out.println("The number to guess was : " + numberToGuess);
		}

		userInput.close();
	}

}
