import java.util.Scanner;
class SortData
{
    void asec(int[] array)
    {
        System.out.print("\nArray in ascending order is: ");
        int n = array.length;
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n-i-1 ; j++) 
            {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        for(int i=0;i<n;i++)
        System.out.print(array[i]+",");

        SortData run=new SortData();
        run.desc(array);

    }

    
    void desc(int[] array)
    {
        int n=array.length;
        System.out.print("\nArray in decending order is: ");
        for(int i=n-1;i>=0;i--)
        System.out.print(array[i]+",");
    }

    public static void main(String[] args) 
    {
        SortData run=new SortData();
        Scanner input=new Scanner(System.in);

        System.out.println("\nEnter the number of elements for the array you want to sort");
        int n=input.nextInt();
        System.out.println("\nEnter the elements of the array");

        int[] array=new int[n];
        for(int i=0;i<n;i++)
        array[i]=input.nextInt();

        run.asec(array);
        input.close();
    }
}