package com.coderscampus.assignment3.recapversion;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class UserService {

	String[] fileReading() throws IOException {

		String[] fileResources = null;

		BufferedReader fileReadingVar = null;
		try {
			fileReadingVar = new BufferedReader(new FileReader("data.txt"));
			int lineCount = 0;

			// Count the number of lines in the file
			while (fileReadingVar.readLine() != null) {
				lineCount++;
				}

			// Initialize the array based on the line count
			fileResources = new String[lineCount];
//			
			

			// Reset the BufferedReader
			fileReadingVar.close();
			fileReadingVar = new BufferedReader(new FileReader("data.txt"));
			
			for(int i = 0; i < fileResources.length; i++) {
				fileResources[i] = fileReadingVar.readLine();
			}
			
			
//			fileResources[0] = fileReadingVar.readLine();
			

		} catch (FileNotFoundException e) {
			System.out.println("Oops, file not found");
			e.printStackTrace();
		}

		return fileResources;

	}

	public User[] createUsers(String[] fileData) {

		User[] users = new User[fileData.length];

		for (int i = 0; i < fileData.length; i++) {
			String[] parsedArray = fileData[i].split(",");

			// Create a new user instance and set its fields
			User newUser = new User();
			newUser.setUsername(parsedArray[0]);
			newUser.setPassword(parsedArray[1]);
			newUser.setName(parsedArray[2]);

			// Add the user to the array of users
			users[i] = newUser;
		}

		return users;

	}

	public User validationMethod(String userInputUserName, String userInputPassword, User[] users) {

		for (User user : users) {
			int numberOfAttempts = 5;
			
			while (numberOfAttempts > 0) {
				if (userInputUserName.equalsIgnoreCase(user.getUsername()) && userInputPassword.equalsIgnoreCase(user.getPassword())) {
					System.out.println("Welcome: " + user.getName());
					break;
				} else {
					System.out.println("Invalid login, please try again");
					numberOfAttempts--;
					break;
				}
			}
			
			if (numberOfAttempts == 0) {
				System.out.println("Too many failed login attempts, you are now locked out.");
				break;
			}
			
		}

		return null;

	}

}
