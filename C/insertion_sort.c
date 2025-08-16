#include <stdio.h>
int sort(int number[], int n)
{
    for (int i = 1; i < n; i++)
    {
        int key = number[i];
        int j = i - 1;

        while (j >= 0 && number[j] > key)
        {
            number[j + 1] = number[j];
            j--;
        }
        number[j + 1] = key;
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