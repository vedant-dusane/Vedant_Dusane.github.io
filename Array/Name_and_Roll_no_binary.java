package Array;
import java.util.*;
/**
 * *Write a Program to accept the size of an array. Accept name and age for
 * *n people
 * *and display name and of entred roll no by binary search.
 */
class Name_and_Roll_no_binary
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
        int start=0;
        int end=n-1;
        int mid=0;
        while(start<=end)
        {
           mid=(start+end)/2;
           if(check==Roll_no[mid])
             { 
               System.out.println("The Student is "+name[mid]);
               count++;
               break;
             }
            else if(check<Roll_no[mid])
             {
               end=mid-1;
             }
            else
             {
               start=mid+1;
             }
       }
       if(count==0)
       {
           System.out.println("Value not found");
       }
    }
}
