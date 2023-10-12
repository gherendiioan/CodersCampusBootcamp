package com.coderscampus.assignment3.recapversion;

import java.io.IOException;
import java.util.Scanner;

public class UserLoginApplication {

	public static void main(String[] args) throws IOException {

		UserService userService = new UserService();
		String[] filedata = userService.fileReading();
		userService.createUsers(filedata);

		String userInputEmail = null;
		String userInputPassword = null;

		Scanner userInputScanner = new Scanner(System.in);

		int numberOFAttempts = 4;
		while (numberOFAttempts >= 0) {

			userInputEmail = emailInput(userInputScanner);
			userInputPassword = passwordInput(userInputScanner);

			if (userService.validationMethod(userInputEmail, userInputPassword,
					userService.createUsers(filedata)) != null) {
				break;
			}

			if (numberOFAttempts < 1) {
				System.out.println("Too many failed login attempts, you are now locked out.");
				break;
			}

			if (userService.validationMethod(userInputEmail, userInputPassword,
					userService.createUsers(filedata)) == null) {
				numberOFAttempts--;
				System.out.println("Invalid login, please try again");
			}
		}
	}

	private static String passwordInput(Scanner userInputScanner) {
		String userInputPassword;
		System.out.println("Enter your password: ");
		userInputPassword = userInputScanner.nextLine();
		return userInputPassword;
	}

	private static String emailInput(Scanner userInputScanner) {
		String userInputEmail;
		System.out.println("Enter your email: ");
		userInputEmail = userInputScanner.nextLine();
		return userInputEmail;
	}

}
