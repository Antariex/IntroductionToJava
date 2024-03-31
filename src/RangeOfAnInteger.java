/**
 Determining range of an integer: low, mid or high

 Given an input integer 'n', your program must output a string. If 'n' is less than 5, output 'LOW'. If 'n' is exactly
 5, output 'MID'. If 'n' is greater than 5, output 'HIGH'.

 Sample Input 1:
 3

 Sample Output 1:
 LOW

 Sample Input 2:
 5

 Sample Output 2:
 MID
 */

import java.util.Scanner;

public class RangeOfAnInteger {
    public static void main(String[] args) {
        // Create a Scanner object to read the user input
        Scanner scanner = new Scanner(System.in);

        // Read an integer from the user
        int number = scanner.nextInt();

        // Logic
        if (number < 5) {
            System.out.println("LOW");
        } else if (number == 5) {
            System.out.println("MID");
        }
        else {
            System.out.println("HIGH");
        }
    }
}
