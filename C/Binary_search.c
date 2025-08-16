#include <stdio.h>
int search(int check,int number[],int n)
{
     int start=0,end=(n-1),mid,flag=0;

    while(start<=end)
    {
        mid=((start+end)/2);
        if(check==number[mid])
        {
            printf("Found the number at %d Position",mid);
            flag++;
            break;
        }
        else if(number[mid]<check)
            start=mid+1;
        else
            end=mid-1;
    }
    return flag;
}
void main()
{
    int n;
    printf("\nEnter number of elements to be enterd\n");
    scanf("%d",&n);

    int number[n];
    printf("\nEnter the numbers\n");
    for(int i=0;i<n;i++)
    {
        scanf("%d",&number[i]);
    }

    int check;
    printf("\nEnter the number to be found: ");
    scanf("%d",&check);
    int flag=search(check,number,n);
    
    if(flag==0)
    printf("Not found");
 
}