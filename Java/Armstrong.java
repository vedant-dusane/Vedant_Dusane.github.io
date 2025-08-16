import java.util.Scanner;
public class Armstrong
{
    public static void main(String[] args) 
    {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        int number, store, copy, count = 0;
        double armstrong = 0;
        System.out.println("Enter a number:");
        number = input.nextInt();
        for (copy = number; copy > 0; copy /= 10) 
            count++;
        
        copy = number;

        for (; copy > 0; copy /= 10)
        {
            store = copy % 10;
            armstrong += Math.pow(store, count);
        }

        if (armstrong == number) 
            System.out.println("Entered number " + number + " is an Armstrong number.");
        else 
        
            System.out.println("Entered number " + number + " is not an Armstrong number.");
        input.close();
    }
}
