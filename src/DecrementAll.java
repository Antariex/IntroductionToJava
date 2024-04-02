/**
 Decrement all

 Write a program that reads four numbers and decrements each of them.
 The program must output the results in the same order separated by spaces.

 Sample Input 1:
 10 11 -2 -3

 Sample Output 1:
 9 10 -3 -4
 */

import java.util.Scanner;

public class DecrementAll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        int number4 = scanner.nextInt();

        System.out.println(--number1 + " " + --number2 + " " + --number3 + " " + --number4);
    }
}