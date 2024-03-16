/**
 Converting words to uppercase and displaying with a prefix

 Write a program that can uniformly print to the console a given input message. The input will be a single word without
 spaces or punctuation, and the output should be a consistent formatted presentation of the input message showing
 'Watch:' followed by the input message in uppercase.

 Sample Input 1:
 hello

 Sample Output 1:
 Watch: HELLO

 Sample Input 2:
 coding

 Sample Output 2:
 Watch: CODING
*/

import java.util.Scanner;

public class ConvertingWords {
    public static void printFormattedMessage(String input) {
        // Transform the input to upper case
        String uppercased = input.toUpperCase();

        // Print the desired output
        System.out.println("Watch: " + uppercased);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the input word from the user
        String userInput = sc.next();

        // Call the function to print formatted message
        printFormattedMessage(userInput);
    }
}