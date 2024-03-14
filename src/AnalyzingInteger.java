/*
Analyzing an integer for parity and absolute value

In Java, your task is to create a program that will analyze a given integer and produce two values: Whether the given number is EVEN or ODD, followed by its absolute value. Your program should take a single integer n (-10^3 <= n <= 10^3) as input and print two lines of output: The first line should be either 'EVEN' or 'ODD', depending on the input number, and the second line should be the absolute value of the input number.

Sample Input 1:
12

Sample Output 1:
EVEN
12

Sample Input 2:
-5

Sample Output 2:
ODD
5
*/

import java.util.Scanner;

public class AnalyzingInteger {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // 1. Read an integer from the standard input
        int number = scanner.nextInt();

        // 2. Find out if the number is EVEN or ODD and print it.
        if (number % 2 == 0) {
            System.out.println("EVEN");
        }
        else {
            System.out.println("ODD");
        }

        // 3. Calculate and print the absolute value of the input number.
        System.out.println(Math.abs(number));
    }
}
