import java.util.Scanner;

public class MinMaxArray {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);

        int n;
        System.out.println("Enter the number of elements you want to enter into the array:");
        n = input.nextInt();

        int[] array = new int[n];
        System.out.println("Keep on entering the elements one-by-one:");
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }

        // Initialize min and max to the first element
        int min = array[0];
        int max = array[0];

        // Find min and max in the array
        for (int i = 0; i < n; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println("Maximum number element is: " + max);
        System.out.println("Minimum number element is: " + min);
    }
}
