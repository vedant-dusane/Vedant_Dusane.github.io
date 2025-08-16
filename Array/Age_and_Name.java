package Array;

import java.util.*;

/**
 * *Write a Program to accept the size of an array. Accept name and age for
 * *n people
 * *and display name and age of those people whose age is greater then 20.
 */
class Age_and_Name {
    public static void main() {
        Scanner done = new Scanner(System.in);
        System.out.println("Enter the number of people you want to enter the data for");
        int n = done.nextInt();
        done.nextLine();
        String name[] = new String[n];
        int age[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\n\nEnter the name of person");
            name[i] = done.next();
            System.out.println("Enter the age");
            age[i] = done.nextInt();
        }
        System.out.println("The name of the person grater than 20 is: ");
        for (int i = 0; i < n; i++) {
            if (age[i] > 20) {
                System.out.print(name[i] + ",");
            }
        }
        done.close();
    }
}
