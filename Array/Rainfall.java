package Array;
import java.util.*;
/** accept n city names and total rainfall in that city.
* Display the following:
* 1) name of city where there was highest rainfall
* 2) name of city where there was least rainfall
* 3) display city name and the rainfall for all those cities whose rainfall >= value entered by the user
*/
class Rainfall
{
    public static void main()
    {
        Scanner done=new Scanner(System.in);
        System.out.println("Enter the number Cities which data you want to enter");
        int n=done.nextInt();
        done.nextLine();
        String City_name[]=new String[n];
        int rainfall_amt[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("\n\nEnter the name of the city");
            City_name[i]=done.next();
            System.out.println("Enter the amount of rain");
            rainfall_amt[i]=done.nextInt();
        }
        int largest=0,smallest=rainfall_amt[0];
        String L_name="",S_name="";
        System.out.println("\n\nEnter the amount of rainfall above which you want the cities");
        int check=done.nextInt();
        System.out.print("\nCities more than rainfall "+check+" are: ");
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(rainfall_amt[i]>largest)
            {
               largest=rainfall_amt[i];
               L_name=City_name[i];
            }
             if(rainfall_amt[i]<smallest)
            {
                smallest=rainfall_amt[i];
                S_name=City_name[i];
            }
            if(check<=rainfall_amt[i])
            {
                System.out.print(City_name[i]+",");
                count++;
            }
        }
        if(count==0)
        {
            System.out.println("No city is more than the value");
        }
        System.out.println("\n\nThe city with max rainfall is: "+L_name);
        System.out.println("The city with least rainfall is: "+S_name);
    }
}
