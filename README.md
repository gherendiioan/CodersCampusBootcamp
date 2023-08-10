# User Validation Console Application

This readme provides instructions and guidelines for implementing a Java console application that validates user logins based on a CSV file.

## Assignment Overview

The assignment entails creating a Java console application that simulates user logins. Users are prompted to enter a username and password, which will then be validated against user data stored in a CSV file named "data.txt". The application employs a User POJO (Plain Old Java Object) to store user information, and a UserService class to manage user-related operations.

## User POJO (User.java)

The `User` class represents the structure of user data and has the following properties:

1. `username`: The username of the user.
2. `password`: The password associated with the username.
3. `name`: The name of the user.

## UserService (UserService.java)

The `UserService` class is responsible for:

1. Reading data from the "data.txt" file and creating an array of `User` objects.
2. Validating user inputs against the array of `User` objects.

## UserLoginApplication (UserLoginApplication.java)

The `UserLoginApplication` class contains the main method and is responsible for:

1. Initializing and using the `UserService` to read data and validate user logins.
2. Utilizing the Java `Scanner` class to collect user input.
3. Providing user feedback based on successful or failed login attempts.

## Program Workflow

1. The program reads data from "data.txt" and populates an array of `User` objects using the `UserService`.
2. The program prompts the user for a username and password using the `Scanner`.
3. The program iterates through the array of `User` objects to validate the user input.
4. If a valid match is found, a welcome message is displayed with the user's name.
5. If the user fails to log in within 5 attempts, they are locked out.

## Sample Output

### Use Case #1: User attempts too many failed logins and is locked out

```
Enter your email:
test@test.com
Enter your password:
asdfasdf
Invalid login, please try again

Enter your email:
test@test.com
Enter your password:
asdfasdf
Invalid login, please try again

Enter your email:
test@test.com
Enter your password:
asdfasdf
Invalid login, please try again

Enter your email:
test@test.com
Enter your password:
asdfasdf
Too many failed login attempts, you are now locked out.
```

### Use Case #2: User successfully logs in

```
Enter your email:
test@test.com
Enter your password:
asdfasdf
Invalid login, please try again

Enter your email:
john.doe@mydomain.net
Enter your password:
Hdk398jf!
Welcome: John Doe
```

