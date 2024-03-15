/**
 Guest list of a hotel

 There is a hotel that may accommodate 4 guests. Each line of the input contains the name or the names of the guests arriving at the hotel on a certain day.
 Read the names of the guests from the input and output each name on a separate line and in reverse order starting with the last arrived guest. Note that the order of the arriving guests and the number of days are not pre-defined.

 Sample Input 1:
 Jane Kate
 John
 Mary

 Sample Output 1:
 Mary
 John
 Kate
 Jane

 Sample Input 2:
 Joseph
 Piotr Eugene
 Jack

 Sample Output 2:
 Jack
 Eugene
 Piotr
 Joseph
*/

import java.util.Scanner;

public class GuestList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name1 = scanner.next();
        String name2 = scanner.next();
        String name3 = scanner.next();
        String name4 = scanner.next();

        scanner.close();

        System.out.println(name4);
        System.out.println(name3);
        System.out.println(name2);
        System.out.println(name1);
    }
}