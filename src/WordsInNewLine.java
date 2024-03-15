/**
 Printing each word in a new line

 Write a program that reads five words from the standard input and outputs each word in a new line. The words should be in the same order.

 Sample Input 1:
 This Java platform
 is adaptive

 Sample Output 1:
 This
 Java
 platform
 is
 adaptive
*/

import java.util.Scanner;

public class WordsInNewLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string1 = scanner.next();
        String string2 = scanner.next();
        String string3 = scanner.next();
        String string4 = scanner.next();
        String string5 = scanner.next();

        scanner.close();

        System.out.println(string1);
        System.out.println(string2);
        System.out.println(string3);
        System.out.println(string4);
        System.out.println(string5);
    }
}
