/**
 Reversing

 Write a program that reads a three-digit number, calculates the new number by reversing its digits, and outputs a new number.

 Sample Input 1:
 320

 Sample Output 1:
 23

 Sample Input 2:
 976

 Sample Output 2:
 679
 */

import java.util.Scanner;

public class Reversing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int lastDigit = number % 10;
        int secondDigit = number / 10 % 10;
        int firstDigit = number / 100;

        System.out.println(lastDigit * 100 + secondDigit * 10 + firstDigit);

        input.close();
    }
}

