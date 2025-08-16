package Array;
import java.util.*;
/**
 *Q; Create an Array to store n number of integer values.
 *Shift all the non zero number in another array.
 */
class non_0
{
  public static void main()
  {
      Scanner n0=new Scanner(System.in);
      System.out.println("Enter the limit of array");
      int n=n0.nextInt();
      int array[]=new int[n];
      int not0[]=new int[n];
      for(int i=0;i<n;i++)
      {
          System.out.println("\n\nEnter the number");
          array[i]=n0.nextInt();
          if(array[i]!=0)
          {
              not0[i]=array[i];
          }
      }
      System.out.print("The non 0 number are");
      for(int i=0;i<n;i++)
      {
          if(not0[i]==0)
          continue;
          else
          System.out.print(not0[i]+",");
      }
  }
}
