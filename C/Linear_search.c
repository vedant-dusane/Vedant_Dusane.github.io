#include <stdio.h>
int search(int check, int number[], int n)
{
    int flag=0;
    for(int i=0;i<n;i++)
    {
        if(check==number[i])
        {
            printf("\nFound the number at %d place",i+1);
            flag++;
        }
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