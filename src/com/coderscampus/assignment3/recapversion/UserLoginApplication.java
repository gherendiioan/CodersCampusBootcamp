package com.coderscampus.assignment3.recapversion;

import java.io.IOException;
import java.util.Scanner;

public class UserLoginApplication {

	public static void main(String[] args) throws IOException {
	
		User user = new User();
		UserService userService = new UserService();
		String[] filedata = userService.fileReading();
		userService.createUsers(filedata);
//		initial place for initializing the scanner
//		Scanner userInputScanner = new Scanner(System.in);
//		String userInputScannerString = userInputScanner.nextLine();
		
		String userInputEmail = null;
		String userInputPassword = null;
		
		Scanner userInputScanner = new Scanner(System.in);
//		String userInputString = userInputScanner.nextLine();
		
		System.out.println("Enter your email: ");
//		String userInputScannerEmail = userInputScanner.nextLine();
		userInputEmail = userInputScanner.nextLine();
		System.out.println("Enter your password: ");
		userInputPassword = userInputScanner.nextLine();
		
		if(userService.validationMethod(userInputEmail, userInputPassword, userService.createUsers(filedata)) != null) {
//			Scanner userInputScanner = new Scanner(System.in);
//			String userInputString = userInputScanner.nextLine();
//			
//			System.out.println("Enter your email: ");
//			String userInputScannerEmail = userInputScanner.nextLine();
//			userInputEmail = userInputScanner.nextLine();
//			System.out.println("Enter your password: ");
//			userInputPassword = userInputScanner.nextLine();
			
			userService.validationMethod(userInputEmail, userInputPassword, userService.createUsers(filedata));
		
		}
		
		
		

	}

}
