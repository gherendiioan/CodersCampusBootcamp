package com.coderscampus.assignment2.recapversion;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame implements GuessingGameMediator {

	private int randomNumber;
	private int remainingGuesses;
	private Scanner scanner;

	public NumberGuessingGame() {
		Random rNo = new Random();
		randomNumber = rNo.nextInt(100) + 1;
		remainingGuesses = 5;
		scanner = new Scanner(System.in);
	}

	public void startGame() {

		System.out.print("Pick a number between 1 and 100: ");
		boolean hasWon = false;
		while (remainingGuesses > 0) {
			int guess = getValidInput(scanner);
			if (guess == -1) {
				continue;
			}

			hasWon = guessLogic(guess);
			remainingGuesses--;

			if (hasWon) {
				break;
			}
		}

			if (!hasWon) {
				System.out.println("You lose! The number to guess was: " + randomNumber);
				scanner.close();
		}
	}

	private int getValidInput(Scanner scanner) {
		int guess = scanner.nextInt();
		if (guess < 1 || guess > 100) {
			System.out.print("Your guess is not between 1 and 100, please try again");
			return -1;
		}
		return guess;
	}

	public boolean guessLogic(int guess) {

		if (guess < randomNumber) {
			System.out.print("Please pick a higher number: ");

		} else if (guess > randomNumber) {
			System.out.print("Please pick a lower number: ");

		} else {
			System.out.println("You win!");
			return true;
		}
		return false;
	}

}
