package Array;
import java.util.*;
/**
 * item    quantity     rate    amount
 * 
 * 
 * 
 *                   net amount       
 */
class Shop
{
    public static void main()
    {
        Scanner done=new Scanner(System.in);
        System.out.println("Enter the number of items you buyed");
        int n=done.nextInt();
        done.nextLine();
        String item[]=new String[n];
        int quantity[]=new int[n];
        int rate[]=new int[n];
        int amount[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the "+(i+1)+" item name");
            item[i]=done.next();
            System.out.println("Enter the quantity");
            quantity[i]=done.nextInt();
            System.out.println("Enter the rate");
            rate[i]=done.nextInt();
            amount[i]=rate[i]*quantity[i];
        }
        int net_amount=0;
        System.out.println("Item\tQuantity\tRate\tAmount");
        for(int i=0;i<n;i++)
        {
            System.out.println(item[i]+"\t"+quantity[i]+"\t"+rate[i]+"\t"+amount[i]);
            net_amount=net_amount+amount[i];
        }
        System.out.println("\n\nNet amount is: "+net_amount); 
    }
}
