/**
 Adding a comment before printing user's input

 Your task is to write a Java program that takes a single line of text as input, adds a comment indicating the input was received and then prints the input text as output. Please remember that in Java, any line of code starting with '//' is considered as a comment. For example, if the input is 'Hello World', your code should add a comment like '// User input received' before printing the text.

 Sample Input 1:
 Hello

 Sample Output 1:
 // User input received
 Hello

 Sample Input 2:
 Java is fun

 Sample Output 2:
 // User input received
 Java is fun
 */

import java.util.Scanner;

public class Comments {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // This creates a Scanner object to get the user's input
        String input = sc.nextLine();
        // User input received
        System.out.println("// User input received");
        System.out.println(input);
    }
}
