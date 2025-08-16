package Array;
import java.util.*;
/**
* Write a Program to accept n Country and their Capital . 
*accept Capital from user and display its country
*/
class Country_capital_binary
{
   public static void main()
    {
        Scanner done=new Scanner(System.in);
        System.out.println("Enter the number of countries you will enter");
        int n=done.nextInt();
        done.nextLine();
        String country[]=new String[n];
        String capital[]=new String[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("\n\nEnter the name of country");
            country[i]=done.next();
            System.out.println("Enter its capital");
            capital[i]=done.next();
        }
        System.out.println("\n\n\nEnter the capital whose country you want to know");
        String check=done.next();
        int start=0,end=n-1,mid=0,count=0;
        while(start<=end)
        {
            mid=(start+end)/2;
            if(country[mid].equalsIgnoreCase(check))
            {
                System.out.println("The capital is: "+ capital[mid]);
                count++;
                break;
            }
            else if(country[mid].equalsIgnoreCase(check))
            {
                end=mid-1;
            }
            else if(country[mid].equalsIgnoreCase(check))
            {
                start=mid+1;
            }
        }
        if (count==0)
        {
            System.out.println("Invalid input");
        }
    }  
}