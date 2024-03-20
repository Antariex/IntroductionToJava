/**
 Evaluating the conjunction of two booleans

 Write a Java program that reads two booleans. Print 'true' if their logical conjunction (AND operation) is true, else print 'false'.

 Sample Input 1:
 true
 true

 Sample Output 1:
 true

 Sample Input 2:
 true
 false

 Sample Output 2:
 false
 */

import java.util.Scanner;

public class EvaluatingBooleans {
    public static void main(String[] args) {
        // Initialize Scanner object to read the input
        Scanner in = new Scanner(System.in);

        // Read two boolean inputs
        boolean bool1 = in.nextBoolean();
        boolean bool2 = in.nextBoolean();

        // Logic to find the AND operation of 2 booleans
        if (bool1 && bool2) {
            System.out.println("true");
        }
        else System.out.println("false");

        // Close the scanner
        in.close();
    }
}