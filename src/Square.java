/**
 Square a user-inputted integer

 Write a Java program that takes an integer from the user and squares it. This program should print the square of the input number.

 Sample Input 1:
 5

 Sample Output 1:
 25

 Sample Input 2:
 -3

 Sample Output 2:
 9
*/

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        // Create a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        // TODO: Get an integer input from the user
        int input = scanner.nextInt();

        // TODO: Calculate the square of the input
        int square = input * input;

        // TODO: Print the result out
        System.out.println(square);

        // Important to close the scanner!
        scanner.close();
    }
}
