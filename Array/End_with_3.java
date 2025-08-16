package Array;
import java.util.*;
 /**
  * Accept n integer values from the user and Display all the numbers ending with 3. also display total number of values ending with 3.
  */
class End_with_3
{
    public static void main()
    {
        Scanner done=new Scanner(System.in);
        System.out.println("Enter the number of integers you want to enter");
        int n=done.nextInt();
        done.nextLine();
        int numbers[]=new int[n];
        System.out.println("Start entering integers");
        for(int i=0;i<n;i++)
        {
            numbers[i]=done.nextInt();
        }
        int count=0;
        System.out.print("Numbers ");
        for(int i =0;i<n;i++)
        {
            if(numbers[i]%10==3)
            {
                System.out.print(numbers[i]+",");
                count ++;
            }
        }
        if(count>0)
        {
          System.out.println(" is/are ending with 3\nThe values ending with 3 are: "+count);
        }
        if(count==0)
        {
            System.out.println("with end 3 arent there");
        }
    }
}
