/**
 Determining if an integer is odd or even

 Write a program that receives an integer as input, if the integer is even return 'even' else return 'odd'.

 Sample Input 1:
 2

 Sample Output 1:
 even

 Sample Input 2:
 3

 Sample Output 2:
 odd
 */

import java.util.Scanner;

public class EvenOrOdd2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        System.out.println(number % 2 == 0 ? "even" : "odd");
    }
}
