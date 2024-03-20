/**
 Check the sum

 Write a program that reads the numbers a, b, c and checks if there's a pair of them that adds up to exactly 20.
 The program must output true or false.

 Sample Input 1:
 1 2 3

 Sample Output 1:
 false

 Sample Input 2:
 4 16 7

 Sample Output 2:
 true
 */

import java.util.Scanner;

public class CheckTheSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberA = scanner.nextInt();
        int numberB = scanner.nextInt();
        int numberC = scanner.nextInt();

        if ((numberA + numberB == 20) || numberA + numberC == 20 || numberB + numberC == 20) {
            System.out.println("true");
        }
        else System.out.println("false");
    }
}