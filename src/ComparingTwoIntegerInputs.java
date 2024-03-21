/**
 Comparing two integer inputs

 Write a java program that scans two integer inputs, compares them and prints if the first is less than, equal to or
 greater than the second one. For comparison use these statements 'less than', 'equal to' and 'greater than'.

 Sample Input 1:
 3
 7

 Sample Output 1:
 less than

 Sample Input 2:
 5
 5

 Sample Output 2:
 equal to
 */

import java.util.Scanner;

public class ComparingTwoIntegerInputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the first integer from user input
        int num1 = scanner.nextInt();

        // Get the second integer from user input
        int num2 = scanner.nextInt();

        // Compare num1 and num2. Then print 'less than', 'equal to' or 'greater than' according to the result
        if (num1 < num2) {
            System.out.println("less than");
        } else if (num1 == num2) {
            System.out.println("equal to");
        } else {
            System.out.println("greater than");
        }
    }
}