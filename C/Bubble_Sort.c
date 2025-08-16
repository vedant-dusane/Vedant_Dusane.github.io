#include <stdio.h>
int sort(int number[],int n)
{
    int swap;
    for(int i=0;i<=n;i++)
    {
        swap=0;
        for (int j=0;j<=n;j++)
        {
            if (number[j]>number[j+1])
            {
                swap=number[j];
                number[j]=number[j+1];
                number[j+1]=swap;
            }
        }
    }
    for(int i=0;i<n;i++)
    printf("%d\t",number[i]);
}
void main()
{
    int n;
    printf("Enter number of elements to be entered\n");
    scanf("%d",&n);
    int number[n];

    printf("\nEnter the numbers\n");
    for(int i=0;i<n;i++)
    {
        scanf("%d",&number[i]);
    }

    sort(number,n);
}