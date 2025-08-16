package Array;

import java.util.*;

/**
 * Write a Program to accept n Words from the user and store them in an array in
 * Upper Case.
 * Accept an alphabet and count total number of words starting with that
 * alphabet.
 */
class Alphabet_Start {
    public static void main() {
        Scanner as = new Scanner(System.in);
        System.out.println("Enter the range of array");
        int n = as.nextInt();
        as.nextLine();
        String array[] = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter the Word");
            array[i] = (as.nextLine()).toUpperCase();
        }
        System.out.println("\n\nEnter the alphabet you want to check");
        char check = as.next().charAt(0);
        check = Character.toUpperCase(check);
        int count = 0;
        System.out.println("\n\nThe words starting with " + check + " is/are");
        for (int i = 0; i < n; i++) {
            if (check == array[i].charAt(0)) {
                System.out.print(array[i] + ",");
                count++;
            }
        }
        if (count == 0) {
            System.out.println("non");
        }
        as.close();
    }
}