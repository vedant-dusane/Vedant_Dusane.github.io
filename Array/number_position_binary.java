package Array;
import java.util.*;
/**
* Write a program to accept and store n integer values in an array.
Also accept a value from the user and search(Binary Search) whether that value is
present in the array or not.
if present display the actually position of the number
else display an appropriate message of not found.
*/
public class number_position_binary
{

    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        sc.nextLine();
        int num[]=new int[n];//array to store the values accepted by user
         //Accepting the value from the user
         for(int i=0;i<n;i++)
         {
             System.out.println("Enter the value");
             num[i]=sc.nextInt();
         } 
         System.out.println("Enter the value to be searched");
         int s=sc.nextInt();
         int c=0;// flag
         // logic for binary search
         int start=0;
         int end=n-1;
         int mid=0;
         while(start<=end)
         {
             mid=(start+end)/2;
             if(s==num[mid])
             {
                 System.out.println("Value is present:"+(mid+1)+" position");
                 c++;
                 break;
                }
                else if(s<num[mid])
                {
                    end=mid-1;
                }
                else
                {
                    start=mid+1;
                }
            }
         if(c==0)
            {
                System.out.println("Value not found");
            }

    }
}