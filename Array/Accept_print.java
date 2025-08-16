package Array;
import java.util.*;
class Accept_print
{
    public static void main()
    {
        Scanner done=new Scanner(System.in);
        System.out.println("Enter total number of people");
        int n=done.nextInt();
        done.nextLine();
        String name[]=new String[n];
        int Roll_no[]=new int[n];
        
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the name");
            name[i]=done.next();
            System.out.println("Enter the Roll_no");
            Roll_no[i]=done.nextInt();
        }
        System.out.println("Name\tRoll_no");
        for(int i=0;i<n;i++)
        {
            System.out.println(name[i]+"\t"+Roll_no[i]);
        }
        done.close();
    }
}
