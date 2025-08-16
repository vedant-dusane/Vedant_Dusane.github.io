import java.util.Scanner;
public class Square 
{
public static void main(String[] args) 
   {
    Scanner input = new Scanner(System.in); 
    
        System.out.println("Enter a number for squaring");
          int number=input.nextInt();
          int square=number*number;
          System.out.println("The square of the "+number+" is "+square);
    input.close();
   }   
}
