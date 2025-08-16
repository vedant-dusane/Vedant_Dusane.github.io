package Array;
/**
 * Accept n integer values from the user
 *and print the sum of all even values
 *Sample Input:
 *Enter the size of an array:
 *5
 *Enter 5 values:
 *2 4 3 7 4
 *Sample Output:
 *Sum of Even Number: 10
 *that is addition of 2,4,4 */
import java.util.*;
class Even_sum_average
{
    public static void main()
    {
        Scanner esa=new Scanner(System.in);
        System.out.println("Enter the number of terms you will enter");
        int n=esa.nextInt();
        esa.nextLine();
        int array[]=new int[n];
        double sum=0.0,average=0.0,count=0.0;
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the number");
            array[i]=esa.nextInt();
        }
        System.out.print("The even numbers are:");
        for(int i=0;i<n;i++)
        {
            if(array[i]%2==0)
            {
               sum=sum+array[i];
               count++;
               System.out.print(array[i]+",");
            }
        }
        average=sum/count;
        System.out.println("\nThe sum is: "+sum+"\nThe average is:"+average);
    }
}