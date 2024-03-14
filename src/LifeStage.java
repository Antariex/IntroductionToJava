/*
Determining life stage based on age
Your task is to write a complete Java program that takes in a single line with an integer between 0-100 (inclusive) as input. This integer represents a person's age. The program should then print a message that tells the person which life stage they are in based on the following conditions: If the person's age is less than 13, print 'Child'; If the age is between 13 and 19 (inclusive), print 'Teenager'. If the age is between 20 and 59 (inclusive), print 'Adult'. Lastly, if the person's age is 60 or above, print 'Senior Citizen'.

Sample Input 1:
12

Sample Output 1:
Child

Sample Input 2:
16

Sample Output 2:
Teenager
*/

import java.util.Scanner;
public class LifeStage {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Ask for an age
        System.out.println("Please enter an age (from 0 to 100) to determine the life stage:");

        // Read the integer
        int age = scanner.nextInt();

        // Write your code here to determine the life stage based on the input age
        // You should use if...else if...else statement
        // Then, print out the appropriate message
        if (age <= 12) {
            System.out.println("Child");
        } else if (age <= 19) {
            System.out.println("Teenager");
        } else if (age <= 59) {
            System.out.println("Adult");
        }
        else System.out.println("Senior Citizen");

    }
}
