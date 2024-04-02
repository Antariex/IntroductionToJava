/**
 The largest element of a sequence

 Given a sequence of positive integer numbers (which ends with the number 0). Find the largest element of the sequence.
 The number 0 itself is not included in the sequence but serves only as a sign of the sequence’s end.

 Sample Input 1:
 1
 7
 9
 0

 Sample Output 1:
 9
 */

import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxNumber = 0;
        int input;

        do {
            input = scanner.nextInt();
            if (input > maxNumber) {
                maxNumber = input;
            }
        } while (input != 0);
        System.out.println(maxNumber);
    }
}