package Array;
import java.util.*;
/**
*Write a program to accept name and marks of three subject. Calculate the average. Display the name and avg of the students having average>60
*accept the values for n user
*/
class Marks
{
    public static void main()
    {
        Scanner done=new Scanner(System.in);
        System.out.println("Enter the number students you want to enter data of");
        int n=done.nextInt();
        done.nextLine();
        String name[]=new String[n];
        int roll_no[]=new int[n];
        int Physics[]=new int[n];
        int Chemistry[]=new int[n];
        int Biology[]=new int[n];
        double average[]=new double[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("\n\nEnter the name of "+(i+1)+" student");
            name[i]=done.next();
            System.out.println("Enter the roll number");
            roll_no[i]=done.nextInt();
            System.out.println("Enter the marks of Physics ");
            Physics[i]=done.nextInt();
            System.out.println("Enter the marks of Chemistry");
            Chemistry[i]=done.nextInt();
            System.out.println("Enter the marks of Chemistry");
            Biology[i]=done.nextInt();
            average[i]=((Physics[i]+Biology[i]+Chemistry[i])/3);
        }
        for(int i=0;i<n;i++)
        {
            if(average[i]>=60)
            {
                System.out.println("The student with more than average of 60 is: "+name[i]);
            }
        }
      }
}
