package Array;
import java.util.*;
/**
 * Write a program to accept n intereger values form the user 
 * and calculate the sum of the values/elements of the array
 * and the avrage of the array display sum and avrage int the output
 */
class sum_average
{
    public static void main()
    {
        Scanner sa=new Scanner(System.in);
        System.out.println("Please enter the limit of the array");
        int n=sa.nextInt();
        double sum=0.0,average=0.0;
        int array[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the value of the array");
            array[i]=sa.nextInt();
            sum=sum+array[i];
        }
        average=sum/n;
        System.out.println("sum:"+sum+"\nAverage:"+average);
    }
}
