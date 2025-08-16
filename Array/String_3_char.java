/**
 * Write a program to accept n tring form the user
 * and dislpay the first three character of each element
 */
package Array;
import java.util.*;
class String_3_char
{
    public static void main()
    {
        Scanner s3c=new Scanner(System.in);
        System.out.println("Enter the number of terms you will enter");
        int n=s3c.nextInt();
        s3c.nextLine();
        String array[]=new String[n];
        
        for(int i=0;i<n;i++)
        {
            System.out.println("\nEnter the elements");
            array[i]=s3c.nextLine();
            if((array[i].length())>=3)
            {
                continue;
            }
            else
            {
                System.out.println("\nEnter any another word with more than 3 letters");
                i--;
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.println((array[i]).substring(0,3));
        }
    }
}