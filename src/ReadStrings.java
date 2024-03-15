/**
 Printing strings in the same order

 Write a program that reads four words and outputs them in the same order, each in a new line.

 Sample Input 1:
 Hello
 Java
 Future programmer

 Sample Output 1:
 Hello
 Java
 Future
 programmer
*/

import java.util.Scanner;

public class ReadStrings {
    public static void main(String[] args) {
        // Assuming you're running this in an environment that supports input correctly
        Scanner scanner = new Scanner(System.in);

        // Read four lines (words or phrases)
        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();
        String line3 = scanner.next();
        String line4 = scanner.next();

        // Output them in the same order
        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
        System.out.print(line4);

        // Close the scanner
        scanner.close();
    }
}