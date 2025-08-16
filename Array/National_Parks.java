package Array;
import java.util.*;
/**
 *Program: Create a String Array TR[] and a numeric array NT[] of size n, to store the names of n Indian National Park and approximate 
 *number of tourists visiting them in a year. Print name of those national park where most and least number of tourist went. Also print
 *total number of tourist visiting the National Park
 */
class National_Parks
{
    public static void main()
    {
        Scanner done=new Scanner(System.in);
        System.out.println("Enter the number National park's names you are going to enter");
        int n=done.nextInt();
        done.nextLine();
        String TR[]=new String[n];
        int NT[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("\n\nEnter the name of the park");
            TR[i]=done.next();
            System.out.println("Enter the number of tourist per year");
            NT[i]=done.nextInt();
        }
        int largest=0,smallest=NT[0];
        int sum=0;
        String L_name="",S_name="";
        for(int i=0;i<n;i++)
        {
            if(NT[i]>largest)
            {
               largest=NT[i];
               L_name=TR[i];
            }
             if(NT[i]<smallest)
            {
                smallest=NT[i];
                S_name=TR[i];
            }
            sum=sum+NT[i];
        }
        System.out.println("The National Parks with most number of people is: "+L_name);
        System.out.println("The National Parks with least number of people is: "+S_name);
        System.out.println("Total number of people visiting national park in india is: "+sum);
    }
}
