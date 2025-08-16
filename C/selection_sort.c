#include <stdio.h>
int sort(int number[], int n)
{
    for (int i = 0; i < n - 1; i++)
    {
        int minIndex = i;

        for (int j = i + 1; j < n; j++)
        {
            if (number[j] < number[minIndex])
                minIndex = j;
        }

        if (minIndex != i)
        {
            int temp = number[i];
            number[i] = number[minIndex];
            number[minIndex] = temp;
        }
    }

    for (int i = 0; i < n; i++)
        printf("%d\t", number[i]);
}
void main()
{
    int n;
    printf("Enter number of elements to be entered\n");
    scanf("%d", &n);
    int number[n];

    printf("\nEnter the numbers\n");
    for (int i = 0; i < n; i++)
    {
        scanf("%d", &number[i]);
    }
    sort(number, n);
}