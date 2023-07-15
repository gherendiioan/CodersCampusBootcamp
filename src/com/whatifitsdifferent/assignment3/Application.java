package com.whatifitsdifferent.assignment3;

import java.io.IOException;

public class Application {

	public static void main(String[] args) throws IOException {

		FileReaderClass fileInputData = new FileReaderClass();

		UserInputScanner userInputData = new UserInputScanner();

		UserService userCreation = new UserService();

		String[] fileReadingInput = fileInputData.fileReadingMethod();

		String[] userParse1 = userCreation.parseText(fileReadingInput[0]);
		String[] userParse2 = userCreation.parseText(fileReadingInput[1]);
		String[] userParse3 = userCreation.parseText(fileReadingInput[2]);
		String[] userParse4 = userCreation.parseText(fileReadingInput[3]);

		User user1 = userCreation.createUser(userParse1);

		User user2 = userCreation.createUser(userParse2);

		User user3 = userCreation.createUser(userParse3);

		User user4 = userCreation.createUser(userParse4);

		int numOfTrials = 4;

		while (numOfTrials >= 0) {

			System.out.println("Enter your email: ");

			String usernameInput = userInputData.userInputMethod();

			System.out.println("Enter your password: ");

			String passwordInput = userInputData.userInputMethod();

			if (usernameInput.equalsIgnoreCase(user1.getUsername()) == true
					&& (passwordInput.equals(user1.getPassword()))) {
				System.out.println("Welcome " + user1.getName());
				break;

			} else {

				if (usernameInput.equalsIgnoreCase(user2.getUsername()) == true
						&& (passwordInput.equals(user2.getPassword()))) {
					System.out.println("Welcome " + user2.getName());
					break;

				} else {

					if ((usernameInput.equalsIgnoreCase(user3.getUsername()) == true
							&& (passwordInput.equals(user3.getPassword())))) {
						System.out.println("Welcome " + user3.getName());
						break;

					} else {

						if (usernameInput.equalsIgnoreCase(user4.getUsername()) == true
								&& (passwordInput.equals(user4.getPassword()))) {
							System.out.println("Welcome " + user4.getName());
							break;
						}

						if (numOfTrials == 0) {
							System.out.println("Too many failed login attempts, you are now locked out.");
							break;

						} else {
							numOfTrials--;
							System.out.println("Invalid login, please try again");

						}

					}
				}
			}
		}
	}
}
