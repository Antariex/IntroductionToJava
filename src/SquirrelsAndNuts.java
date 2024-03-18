/**
 Squirrels and nuts

 N squirrels found K nuts and decided to divide them equally. Find how many nuts will be left after each of the squirrels
 takes the equal amount of nuts.

 Input data format
 There are two positive integers N and K, each of them is not greater than 10000.

 Sample Input 1:
 3
 14

 Sample Output 1:
 2
 */

import java.util.Scanner;

public class SquirrelsAndNuts {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int N = 3;
            int K = 14;

            N = scanner.nextInt();
            K = scanner.nextInt();

            int nuts = (K%N);
            System.out.println(nuts);
        }
}