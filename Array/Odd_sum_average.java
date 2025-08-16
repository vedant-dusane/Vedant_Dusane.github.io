package Array;
import java.util.*;
/**
 *Accept n integer values from the user and print the sum of all odd values, along with its avg. Also print Odd number.
*Sample Input:
*Enter the size of an array:
*5
*Enter 5 values:
*2 4 3 7 4
*Sample Output:
*Sum of Odd Number: 10
*Avg: 5
*Odd numbers are:
*3 7
 */
class Odd_sum_average
{
    public static void main()
    {
        Scanner done=new Scanner(System.in);
        System.out.println("Enter the number of terms you will enter");
        int n=done.nextInt();
        done.nextLine();
        int array[]=new int[n];
        int sumodd=0;
        double count=0.0;
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the number");
            array[i]=done.nextInt();
            if(array[i]%2==1)
            {
               sumodd=sumodd+array[i];
               count++;
            }
        }
        System.out.print("The odd numbers are: ");
        for(int i=0;i<n;i++)
        {
            if(array[i]%2==1)
            System.out.print(array[i]+",");
        }
        System.out.println("\nSum of odd number is "+sumodd+"\nAverage of odd number is: "+(sumodd/count));
    }
}