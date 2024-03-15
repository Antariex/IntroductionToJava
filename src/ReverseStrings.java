/**
 Print strings in the reverse order

 Write a program that reads three strings and outputs them in the reverse order, each on a new line.

 Sample Input:
 Java
 Programming
 Language

 Sample Output:
 Language
 Programming
 Java
 */

import java.util.Scanner;
public class ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string1 = scanner.next();
        String string2 = scanner.next();
        String string3 = scanner.next();

        scanner.close();

        System.out.println(string3);
        System.out.println(string2);
        System.out.println(string1);
    }
}