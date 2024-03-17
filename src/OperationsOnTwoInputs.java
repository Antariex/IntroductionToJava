/**
 Performing operations on two user-input integers

 Given two integers, perform the following operations in sequence and return the result: Multiply the two numbers, then subtract the second number from the product, then add the first number to the result. Your application should scan two integer values from the user as input correctly and print the final output.

 Sample Input 1:
 5
 3

 Sample Output 1:
 17

 Sample Input 2:
 0
 4

 Sample Output 2:
 -4
 */

public class OperationsOnTwoInputs {
    public class Expressions {
        public static void main(String[] args) {
            int a = 5, b = 11;
            System.out.println(b + a); // Prints

            System.out.println(b - a); // Prints

            System.out.println(b * a); // Prints

            System.out.println(b / a); // Prints

            System.out.println(b % a); // Prints

            System.out.println((a - b) + a * (b - a) - a % b); // Prints

        }
    }
}
