#include <stdio.h>
#include <math.h>

int main() {
    int number, copy, count = 0, armstrong = 0;

    printf("\nEnter a number\n");
    scanf("%d", &number);

    copy = number;

    // Count digits
    for (int i = 1; copy > 0; i++) {
        copy = copy / 10;
        count++;
    }

    copy = number;
    printf("\nNumber of digits in the number is: %d\n", count);

    // Calculate Armstrong value
    for (int i = 0; copy > 0; i++) {
        int store = copy % 10;
        armstrong = armstrong + (int)(pow(store, count) + 0.5); // Rounding fix
        copy = copy / 10;
    }

    if (armstrong == number)
        printf("Entered number %d is an Armstrong number", number);
    else
        printf("Entered number %d is not an Armstrong number", number);

    return 0;
}
