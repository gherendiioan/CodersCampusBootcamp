package com.coderscampus.assignment2.recapversion;

public class GuessingGameLauncher {

	public static void main(String[] args) {
		GuessingGameMediator mediator = new NumberGuessingGame();
		mediator.startGame();

	}

}
