package Array;
import java.util.*;
/**
 *q: Write a program to accept n integer value from the user.
 *Also accept a number and check whether the numbers/ elements in the array are divisible by that number or not.
 *display all the numbers which are divisible by the number entered
 */
class divisible_by
{
    public static void main()
    {
        Scanner db=new Scanner(System.in);
        System.out.println("Enter the range of the array");
        int n=db.nextInt();
        int array[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("\nEnter the numbers");
            array[i]=db.nextInt();
            db.nextLine();
        }
        System.out.println("\n\nEnter the number to divide by");
        int check=db.nextInt();
        System.out.println("\nThe number divisible by "+check+" is/are");
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(array[i]%check==0)
            {
                System.out.print(array[i]+",");
                count++;
            }
        }
        if(count==0)
        {
            System.out.println("none");
        }
    }
}