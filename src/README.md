
# Number Guessing Game with Mediator Pattern

## Assignment Requirements

Your task is to create a game that allows players to try to guess a number that's randomly chosen between 1 and 100.

- When the player starts the game, a random number will be generated. This random number will be the number that the player will try to guess (so don’t tell the player what this number is).
- The player will then be prompted to "Pick a number between 1 and 100". The range from 1 to 100 is inclusive, so the number can be 1, 100, or any number in-between. Also, only generate int values (don’t use floats/doubles).
- If the number chosen is outside of this range, then an error message should be displayed saying "Your guess is not between 1 and 100, please try again." Note: an invalid input should not affect the number of guesses the player has left (so do not remove a guess from the player if they enter a number outside of the 1 - 100 range).
- The player only gets 5 chances to guess the number.
- If they haven’t guessed the correct number after 5 tries, then the game is over and the outputted message should read "You lose! The number to guess was [randomNumber]" (where `[randomNumber]` is the actual value of the variable generated at the beginning of the game).
- Once the user fails to guess the number, or if they correctly guess the number, the game is over, and the application ends.
- (Don’t worry about trying to validate any input other than int values; ie. Don’t worry about decimals or words)

## Mediator Pattern

The Mediator pattern is a behavioral design pattern that promotes loose coupling between components by centralizing communication and coordination between them. It encapsulates the interactions between objects within a separate mediator object, reducing direct dependencies between the components.

## Project Structure

- `GuessingGameMediator`: An interface defining the methods for starting the game and processing the player's guesses.
- `NumberGuessingGame`: A class implementing the `GuessingGameMediator` interface. It serves as the Mediator and encapsulates the game logic, random number generation, and player interaction.
- `GameLauncher`: The main class that starts the Number Guessing Game by creating an instance of `NumberGuessingGame` and invoking its `startGame()` method.

## How Mediator Pattern is Utilized

1. **Encapsulation of Game Logic**: The `NumberGuessingGame` class encapsulates all the game logic, including generating the random number, maintaining the number of remaining guesses, and processing player guesses. Other classes do not need to know the internal details of the game, promoting encapsulation and information hiding.

2. **Communication Centralization**: The `NumberGuessingGame` class acts as the central mediator for the interactions between the player and the game logic. The player communicates with the game only through the `GuessingGameMediator` interface, which keeps the communication channel well-defined and organized.

3. **Loose Coupling**: By using the Mediator pattern, the player (through the `Scanner`) is decoupled from the game logic. The player's input and the game logic are not tightly bound together, allowing for easier maintenance and future changes.

4. **Reusability and Extensibility**: The use of the `GuessingGameMediator` interface allows for future extensions or variations of the game without modifying the player's input and interaction code.

## How to Run the Game

1. Compile the Java files: `javac GameLauncher.java NumberGuessingGame.java`

2. Run the game: `java GameLauncher`

3. The game will prompt you to pick a number between 1 and 100. You have 5 chances to guess the correct number.

4. After 5 incorrect guesses, the game will display "You lose! The number to guess was: [randomNumber]" where `[randomNumber]` is the correct number you were trying to guess.

5. If you guess the correct number, the game will display "You win!" and terminate.

6. The game will automatically close after finishing, or if you manually close it by pressing `Ctrl+C` (or equivalent).

## Note

This implementation of the Number Guessing Game with the Mediator pattern aims to provide a clear separation of concerns and a flexible design. The code can be further enhanced or modified to suit specific requirements or accommodate additional features in the future.