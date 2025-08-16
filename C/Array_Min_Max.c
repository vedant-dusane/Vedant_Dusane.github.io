#include <stdio.h>
void main()
{
    int min,max,n;
    printf("\nEnter the number of elements you want to enter into the array\n");
    scanf("%d",&n);
    int array[n];
    printf("Keep on entering the elements one-by-one\n");
    for(int i=0;i<n;i++)
    {
      scanf("%d",&array[i]);
    }

    min=array[0];
    max=array[0];

    for(int i=0;i<n;i++)
    {
        if(array[i]>max)
        {
            max=array[i];
        }
        if(array[i]<min)
        {
            min=array[i];
        }
    }
    printf("Maximum number element is: %d\nMinimum number element is: %d",max,min);
}