import java.util.Scanner;

/**
 Healthy sleep

 Ann watched a health TV program and learned that oversleeping is as bad for your health as not getting enough sleep.
 She decided to follow TV recommendations and keep track of how many hours she spends sleeping.
 You are given three numbers: A, B and H. According to TV, one should sleep at least A hours per day, but no more than
 B hours. H is how many hours Ann sleeps.
 Task: If Ann sleeps less than A hours, print "Deficiency". If she sleeps more than B hours, print "Excess". If her
 sleep fits the recommendations, print "Normal".
 Input format: three numbers A, B, H, where A is always less than or equal to B

 Sample Input 1:
 6
 10
 8

 Sample Output 1:
 Normal

 Sample Input 2:
 7
 9
 10

 Sample Output 2:
 Excess

 Sample Input 3:
 7
 9
 2

 Sample Output 3:
 Deficiency
 */

public class Healthysleep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int recommendedHours = scanner.nextInt(); // Recommended hours
        int limitHours = scanner.nextInt(); // Limit hours
        int actualHours = scanner.nextInt(); // Actual hours

        if (actualHours < recommendedHours) {
            System.out.println("Deficiency");
        } else if (actualHours > limitHours) {
            System.out.println("Excess");
        } else {
            System.out.println("Normal");
        }
    }
}