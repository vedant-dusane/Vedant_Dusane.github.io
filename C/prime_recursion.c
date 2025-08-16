# include <stdio.h>
int check(int n,int d);
void main()
{
    int number,divisor=2;
    printf("\nEnter a number\n");
    scanf("%d",number);
    if((check(number,divisor))==1)
    printf("Enterd number is not prime");
    else
    printf("Entered number is prime");
}

int check(int n,int d)
{
    if(n%d==0)
    {
        return 0;
    }
    if(d<=n)
    {
     check(n,d++);
     return 1;
    } 
}