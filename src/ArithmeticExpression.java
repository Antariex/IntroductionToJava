/**
 Arithmetic expression

 Write a program that reads an integer value n from the standard input and outputs the result of the following arithmetic expression:

 ((n + 1) * n + 2) * n + 3

 Sample Input 1:
 3

 Sample Output 1:
 45
 */

import java.util.Scanner;
public class ArithmeticExpression {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int expression = ((number + 1) * number + 2) * number + 3;
        System.out.println(expression);
    }
}
