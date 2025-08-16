# include<stdio.h>
void main()
{
    int row; char alphabet;
    printf("\nEnter number of rows\n");
    scanf("%d",&row);
    printf("\n");
    for(int i=1;i<=row;i++)
    {
     for(int j=1;j<=i;j++)
      {
        printf("*");
      }
     printf("\n");
    }


    printf("\n");
    for(int i=1;i<=row;i++)
    {
     alphabet='A';
     for(int j=1;j<=i;j++)
      {
        printf("%d",j);
      }
     printf("\n");
    }

    printf("\n");
    for(int i=1;i<=row;i++)
    {
     alphabet='A';
     for(int j=1;j<=i;j++)
      {
        printf("%c",alphabet);
        alphabet++;
      }
     printf("\n");
    }

    printf("\n");
    for(int i=row;i>=1;i--)
    {
     for(int j=1;j<=i;j++)
      {
        printf("*");
      }
     printf("\n");
    }
}