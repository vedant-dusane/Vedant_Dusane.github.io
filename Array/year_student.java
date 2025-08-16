package Array;
import java.util.*;
/**
 *Write the program to accept Graduation year and total number of student graduated that year.
 *Accept the year and display the strength of the student graduated for that particular year.
 */
 class year_student
{
    public static void main()
    {
        Scanner done=new Scanner(System.in);
        System.out.println("Enter the number of years");
        int n=done.nextInt();
        done.nextLine();
        int year[]=new int[n];
        int student[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("\n\nEnter the year ");
            year[i]=done.nextInt();
            System.out.println("Enter the number of students ");
            student[i]=done.nextInt();
        }
        int start=0,end=n-1,mid=0,flag=0;
        System.out.println("\n\nEnter the year");
        int check=done.nextInt();
        while(start<=end)
        {
            mid=(start+end)/2;
            if(year[mid]==check)
            {
                System.out.println("The number of students are"+student[mid]);
                flag++;
                break;
            }
            else if(year[mid]<check)
            {
                end=mid-1;
            }
            else if(year[mid]>check)
            {
                start=mid+1;
            }
        }
        if(flag==0)
        System.out.println("college was close due to corona");
    }
}
