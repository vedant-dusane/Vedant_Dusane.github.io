package Array;
import java.util.*;
class number_search
/**
 * Q: Write a program to accept and store n integer values in an array.A
 * Also accept a value from the user and search whether that value is present 
 * in the array or not. if present display the actually position 
 * of the number else display an appropriate message of not found.
 */
{
    public static void main()
    {
        Scanner ns=new Scanner(System.in);
        System.out.println("Pls enter the size of the array");
        int n=ns.nextInt();
        int array[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the numbers");
            array[i]=ns.nextInt();
        }
        System.out.println("Enter the number to search");
        int check=ns.nextInt();
        int count=0;
        for(int i=0;i<n;i++)
        {
            if (check==array[i])
            {
                System.out.println("The position of the element is:" +(i+1));
                count++;
            }
        }
        if(count==0)
        {
            System.out.println("No such number");
        }
    }
}