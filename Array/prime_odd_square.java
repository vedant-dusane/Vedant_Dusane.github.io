package Array;
import java.util.*;
/**
 * Accept n numbers from the user store it in an array 
 * than display the odd number and there square 
 * also display the prime number if any by the user.
 */
class prime_odd_square
{
    public static void main()
    {
        Scanner pos=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n=pos.nextInt();
        int array[]=new int[n];
        int prime[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the elements");
            array[i]=pos.nextInt();
        }
        System.out.println("The odd number\t\tThe square");
        for(int odd=0;odd<n;odd++)
        {
            if(array[odd]%2==1)
            {
                System.out.println(array[odd]+"\t\t\t"+(array[odd]*array[odd]));
            }
        }
        int count=0;      
        for(int i=0;i<n;i++)
        {
            int j=1;
            while(j<=array[i])
            {
                    if(array[i]%j==0)
                {
                    count++;
                }
                j++;
            }
            if(count==2)
            {
                prime[i]=array[i];
            }
            count=0;
        }
        System.out.print("The prime numbers are ");
        for(int i=0;i<n;i++)
        {
            if(prime[i]==0)
            continue;
            else
            System.out.print(prime[i]+",");
        }
    }
}