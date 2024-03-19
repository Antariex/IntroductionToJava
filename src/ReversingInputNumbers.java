/**
 Reversing input numbers

 Write a program that reads two integer numbers from the standard input and outputs them in the reverse order
 separated by one space.
 */

import java.util.Scanner;

public class ReversingInputNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1 = input.nextInt();
        int number2 = input.nextInt();

        System.out.println(number2 + " " + number1);

        input.close();
    }
}

