/**
 Check a number is positive

 Write a program that reads a number and prints YES if it is positive. Otherwise, the program should print NO.
 Do not forget that zero is not a positive number.

 Sample Input 1:
 7

 Sample Output 1:
 YES
 */

import java.util.Scanner;

public class PositiveNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        // Check if the number is positive
        if (number > 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

