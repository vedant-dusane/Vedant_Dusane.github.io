package Array;
import java.util.*;
/**
 * *Write a Program to accept the size of an array. Accept name and age for
 * *n people
 * *and display name and of entred roll no by linear search.
 */
class Name_and_Roll_no_linear
{
    public static void main()
    {
        Scanner narn=new Scanner(System.in);
        System.out.println("Enter the number of Student you want to enter the data for");
        int n=narn.nextInt();
        narn.nextLine();
        String name[]=new String[n];
        int Roll_no[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("\n\nEnter the name of person");
            name[i]=narn.next();
            System.out.println("Enter the Roll no");
            Roll_no[i]=narn.nextInt();
        }
        System.out.println("\n\nEnter Roll no u want the name of");
        int check=narn.nextInt();
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(check==Roll_no[i])
            {
               System.out.println("\nThe name is:" +name[i]);
                count++;
            }
        }
        if (count==0)
        {
            System.out.println("No such student");
        }
    }
}
