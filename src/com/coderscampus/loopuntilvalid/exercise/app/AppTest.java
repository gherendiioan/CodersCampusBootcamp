package com.coderscampus.loopuntilvalid.exercise.app;

import java.util.Scanner;

import com.coderscampus.loopuntilvalid.exercise.user.User;

public class AppTest {

	public static void main(String[] args) {
		
			Scanner scanner = new Scanner(System.in);
			
			User testUser = new User();
			
			System.out.println("Please insert a number between 50 and 300");
			
			testUser.setGuess(Integer.parseInt(scanner.next()));
					
			System.out.println(testUser.toString());
			
			if((testUser.getGuess() < 50) || (testUser.getGuess() > 300)) {
				
				System.out.println("Sorry you're out of bounds");
				System.out.println("Would you like to try again? (Y or N) ");
				
				testUser.setOption(scanner.next());
				System.out.println(testUser.toString());
				
				while(testUser.getOption().equals("Y") || testUser.getOption().equals("y")) {
					
					System.out.println("Please insert a number between 50 and 300");
					testUser.setGuess(Integer.parseInt(scanner.next()));
					
					if((testUser.getGuess() < 50) || (testUser.getGuess() > 300)) {
						System.out.println("Sorry you're out of bounds");
						System.out.println("Would you like to try again? (Y or N) ");
						
						testUser.setOption(scanner.next());
						System.out.println(testUser.toString());
					}else{
						System.out.println("I think you got it!");
						break;
					}
					
				}
				 
			
	}else {
		System.out.println("Yey, I made it!");
	}

}
}
