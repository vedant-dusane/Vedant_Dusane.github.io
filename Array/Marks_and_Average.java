package Array;
import java.util.*;
   /**
     * Q: The annual examination results of 50 students in a class is tabulated as follows:
     * Roll no. Subject A  Subject B   Subject C
     *......    .......    .......     .......
     * Write a program to read the data, calculate & display the following:
     * a) Average marks obtained by each student
     * b) Print the roll no. & average marks of the students whose average mark is above 80
     * c) Print the roll no & average marks of the students whose average marks is below 40
     */
class Marks_and_Average
{
    Scanner mas=new Scanner(System.in);
    int Roll_no[]=new int[50];
    double Physics[]=new double[50];
    double Biology[]=new double [50];
    double Chemistry[]=new double [50];
    double Average[]=new double[50];
    void input()
    {
        for(int i=0;i<50;i++)
        {
            System.out.println("\n\nEnter the Roll no");
            Roll_no[i]=mas.nextInt();
            System.out.println("Enter the marks in Physics");
            Physics[i]=mas.nextInt();
            System.out.println("Enter the marks in Biology");
            Biology[i]=mas.nextInt();
            System.out.println("Enter the marks in Chemistry ");
            Chemistry[i]=mas.nextInt();
        }
    }
    void marks()
    {
        System.out.println("\n\nRoll no\t\tMarks of Physics\tMarks of Chemistry\tMarks of Biology");
        for(int i=0;i<50;i++)
        {
            System.out.println(Roll_no[i]+"\t\t"+Physics[i]+"\t\t\t"+Chemistry[i]+"\t\t\t"+Biology[i]);
        }
    }
    void average()
    {
        System.out.println("\n\nRoll no\t\t\tAverage of 3 subject is");
        for(int i=0;i<50;i++)
        {
            Average[i]=((Physics[i]+Biology[i]+Chemistry[i])/3);
            System.out.println(Roll_no[i]+"\t\t\t"+Average[i]);
        }
    }
    void average_80()
    {
        System.out.println("\n\nThe student with average above 80 are");
        System.out.println("Roll no\t\t\tAverage above 80 ");
        for(int i=0;i<50;i++)
        {
            if(Average[i]>80)
            {
               System.out.println(Roll_no[i]+"\t\t\t"+Average[i]);
            }
        }
    }
    void average_40()
    {
        System.out.println("\n\nThe student with average below 40 are");
        System.out.println("Roll no\t\t\tAverage below 40 ");
        for(int i=0;i<50;i++)
        {
            if(Average[i]<40)
            {
               System.out.println(Roll_no[i]+"\t\t\t"+Average[i]);
            }
        }
    }
    public static void main()
    {
        Marks_and_Average mas=new Marks_and_Average();
        mas.input();
        mas.marks();
        mas.average();
        mas.average_80();
        mas.average_40();
        
    }
}