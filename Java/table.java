import java.util.Scanner;
public class table 
{
  public static void main(String[] args) 
  {
    Scanner input=new Scanner(System.in);
    System.out.println("Enter The Number For Table");
    int number=input.nextInt();
    System.out.println("The table for "+number);

    for(int i=1;i<=10;i++)
    {
        System.out.println(number+" X "+i+" = "+number*i);
    }
    input.close();
  }  
}
  