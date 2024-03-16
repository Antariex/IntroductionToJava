/**
 Determine the positivity or negativity of a number

 Create a program in Java which, when given a number as input, will print a string that states whether the number is positive or negative. If the number is zero, print 'Zero'. The input will be a single integer value from -1,000 to 1,000.

 Sample Input 1:
 -1

 Sample Output 1:
 Negative

 Sample Input 2:
 536

 Sample Output 2:
 Positive
 */

import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args) {

        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Take an integer as input from the user
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Negative");
        } else if (number > 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Zero");
        }

        // Close the scanner
        scanner.close();
    }
}