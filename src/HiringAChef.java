/**
 Hiring a chef

 Imagine that you are an HR manager at a restaurant and you need to hire a chef. To do that, you need to collect some preliminary data about the candidates.
 You have a special form for the candidates that includes 3 fields: first name, years of experience and cuisine preference.
 Your program should read all the words (or numbers) from the three lines and output "The form for first name is completed. We will contact you if we need a chef who cooks cuisine preference dishes and has years of experience years of experience."
 Pay attention to the output format, you need to match the spacing.

 Sample Input 1:
 Eugene
 8
 fusion

 Sample Output 1:
 The form for Eugene is completed. We will contact you if we need a chef who cooks fusion dishes and has 8 years of experience.
 */

import java.util.Scanner;

public class HiringAChef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String chefName = scanner.next();
        int chefYears = scanner.nextInt();
        String chefPreference = scanner.next();

        System.out.println("The form for " + chefName + " is completed. We will contact you if we need a chef who cooks " + chefPreference + " dishes and has " + chefYears + " years of experience.");
    }
}
