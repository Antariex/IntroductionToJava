/**
 Calculating square, cube and fourth power of a number

 You have to find out the square, cube and fourth power of a given positive integer. The input will be a single line containing a single positive integer (n). The output should be three lines, first line prints the square of n, next line prints the cube of n and third line prints the fourth power of n.

 Sample Input 1:
 5

 Sample Output 1:
 25
 125
 625

 Sample Input 2:
 2

 Sample Output 2:
 4
 8
 16
 */

import java.util.Scanner;

public class PowersWithIntegers {
    public static void main(String args[]) {
        // Create a Scanner object to read input
        Scanner in = new Scanner(System.in);

        // Read the next integer
        int n = in.nextInt();

        // Compute and print the square of n
        System.out.println(n * n);

        // Compute and print the cube of n
        System.out.println(n * n * n);

        // Compute and print the fourth power of n
        System.out.println(n * n * n * n);
    }
}
