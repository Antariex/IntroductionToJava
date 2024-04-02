/**
 The length of the sequence

 For its input, the program gets a sequence of non-negative integers; each integer is written on a separate line.
 The sequence ends with an integer 0; when the program reads 0, it should end its work and output the length of the
 sequence (not counting the final 0).

 Don’t read numbers following the number 0.

 Sample Input 1:
 1
 7
 9
 0
 5

 Sample Output 1:
 3
 */

import java.util.Scanner;

public class LengthOfTheSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        while (scanner.nextInt() != 0) {
            count++;
        }
        System.out.println(count);
    }
}