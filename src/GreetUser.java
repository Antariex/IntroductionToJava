/**
 Greet user with their name and age

 Create a program that accepts a user's name and age as input and prints out a welcome message to the user, referencing their name and age. If the user's name is 'John' and their age is '22', the program should print 'Welcome, John! You are 22 years old.'

 Sample Input 1:
 John
 22

 Sample Output 1:
 Welcome, John! You are 22 years old.

 Sample Input 2:
 Alice
 30

 Sample Output 2:
 Welcome, Alice! You are 30 years old.
*/

import java.util.Scanner;

public class GreetUser {
    public static void main(String[] args) {
        // Initialize the Scanner object to receive user input
        Scanner sc = new Scanner(System.in);

        // Write your code for receiving user's name and age here.
        String userName = sc.next();
        int userAge = sc.nextInt();

        // Print the message using the user's name and age.
        System.out.println("Welcome, " + userName + "! You are " + userAge + " years old.");

    }
}
