/**
 Check if a given number is equal to 10

 Given a number, write a program in Java to determine whether this number is equal to 10 or not.
 Your program should take a single integer as input and print "Equal" if the number is 10, or "Not Equal" otherwise.

 Sample Input 1:
 10

 Sample Output 1:
 Equal

 Sample Input 2:
 20

 Sample Output 2:
 Not Equal
 */

import java.util.Scanner;

public class EqualTo10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        System.out.println(num == 10 ? "Equal" : "Not Equal");
    }
}