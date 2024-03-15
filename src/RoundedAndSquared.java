/**
 Rounding down and squaring a floating point number

 Write a Java program that takes the input of a floating point number, rounds it down to the nearest integer and then prints the square of that integer.
 For example, if the number is 4.8, you will round it down to 4, then square it to get 16. If the number is -3.2, you will round it down to -4 and then square it to get 16.

 Sample Input 1:
 4.8

 Sample Output 1:
 16

 Sample Input 2:
 -3.2

 Sample Output 2:
 16
*/

import java.util.Scanner;

public class RoundedAndSquared {
    public static void main(String[] args) {

        // Create new Scanner object for reading the input
        Scanner scanner = new Scanner(System.in);

        // Read a floating point number
        float userInput = scanner.nextFloat();

        // Round it down and square it. Make it an int
        int rounded = (int) Math.floor(userInput);
        int squared = rounded * rounded;

        // Print the result
        System.out.println(squared);

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
