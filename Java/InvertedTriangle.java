import java.util.Scanner;

public class InvertedTriangle {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int row;
        System.out.println("Enter the number of rows:");
        row = input.nextInt();

        System.out.println();
        for (int i = row; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
