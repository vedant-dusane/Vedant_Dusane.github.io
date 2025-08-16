    package Array;
import java.util.*;
/**
 * Write a program to Accept n integer values from the user and print the greatest and smallest of the array element.
 */
class Greatest_Smallest
{
 public static void main()
    {
        Scanner done=new Scanner(System.in);
        System.out.println("Enter the number of terms you will enter");
        int n=done.nextInt();
        done.nextLine();
        int array[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the number");
            array[i]=done.nextInt();
        }
        int Largest=0,Smallest=array[0];
        for(int i=0;i<n;i++)
        {
            if(array[i]>Largest)
            {
               Largest=array[i];
            }
            
            if(array[i]<Smallest)
            {
                Smallest=array[i];
            }
        }
        System.out.println("Largest number is: "+Largest+"\nSmallest number is: "+Smallest);
   }
}
