package Array;
import java.util.*;
/**
* Write a Program to accept n Country and their Capital . 
*accept Capital from user and display its country
*/
class Country_capital
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
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(check.equalsIgnoreCase(capital[i]))
            {
                System.out.println("The country of the capital is: "+country[i]);
                count++;
            }
        }
        if(count==0)
        {
          System.out.println("Country doesnt exist");
        }
}  
}