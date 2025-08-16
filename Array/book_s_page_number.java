package Array;

import java.util.*;

/**
 * Accept the number of page number in a book by the user and binary search any
 * page numbered is present or not
 */
class book_s_page_number {
    public static void main() {
        Scanner done = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = done.nextInt();
        done.next();
        int book[] = new int[n];
        System.out.println("\n\nEnter the Page numbers ");
        for (int i = 0; i < n; i++) {
            book[i] = done.nextInt();
        }
        int start = 0, end = n - 1, mid = 0, flag = 0;
        System.out.println("Enter the value to be searched");
        int check = done.nextInt();
        while (start <= end) {
            mid = (start + end) / 2;
            if (book[mid] == check) {
                System.out.println("The value is present");
                flag++;
                break;
            } else if (book[mid] > check) {
                end = mid - 1;
            } else if (book[mid] < check) {
                start = mid + 1;
            }
        }
        if (flag == 0) {
            System.out.println("The value is not present");
        }
        done.close();
    }
}
