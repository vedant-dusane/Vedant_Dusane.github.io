# include <stdio.h>
float factorial(float num);
void main()
{
    float number,fact;
    printf("\nEnter a number\n");
    scanf("%f",&number);
    fact=factorial(number);
    printf("The factorial for %.2f is %.2f",number,fact);
}

float factorial(float num)
{
    float factorial=1;
    for(int i=1;i<=num;i++)
    {
        factorial=factorial*i;
    }
    return factorial;
}