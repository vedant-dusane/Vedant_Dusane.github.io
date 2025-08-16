package Array;
import java.util.*;
/**
 *WAP to accept name of the employees and store them in the Array 
 *also accept the name to be searched in an array and display the 
 *actual position of the value found else display an appropriate message. 
 *Make use of Binary Search 
 */
class Employees
{
    public static void main()
    {
        Scanner e=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=e.nextInt();
        e.nextLine();
        String array[]=new String[n];
         for(int i=0;i<n;i++)
         {
             System.out.println("Enter the Name");
             array[i]=e.nextLine();
         } 
         System.out.println("Enter the Name to be searched");
         String user=e.nextLine();
         int count=0,start=0 ,end=n-1,mid=0;
         while(start<=end)
         {
             int check=user.compareTo(array[mid]);
             mid=(start+end)/2;
             if(check==0)
             {
                 System.out.println("Name "+array[mid]+" is present at:"+(mid+1)+" position");
                 count++;
                 break;
                }
                else if(check>0)
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
