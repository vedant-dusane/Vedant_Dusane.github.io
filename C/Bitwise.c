#include <stdio.h>

int main() {
    int num1, num2;
    int and_result, or_result, xor_result, not_num1, not_num2;

    // Accept two numbers from the user
    printf("Enter the first number: ");
    scanf("%d", &num1);
    
    printf("Enter the second number: ");
    scanf("%d", &num2);

    // Calculate Bitwise AND: num1 & num2
    and_result = num1 & num2;
    printf("Bitwise AND: %d & %d = %d\n", num1, num2, and_result);

    // Calculate Bitwise OR: num1 | num2
    or_result = num1 | num2;
    printf("Bitwise OR: %d | %d = %d\n", num1, num2, or_result);

    // Calculate Bitwise XOR: num1 ^ num2
    xor_result = num1 ^ num2;
    printf("Bitwise XOR: %d ^ %d = %d\n", num1, num2, xor_result);
    
    // Calculate Bitwise NOT for num1: ~num1
    not_num1 = ~num1;
    printf("Bitwise NOT of %d: ~%d = %d\n", num1, num1, not_num1);

    // Calculate Bitwise NOT for num2: ~num2
    not_num2 = ~num2;
    printf("Bitwise NOT of %d: ~%d = %d\n", num2, num2, not_num2);

    return 0;
}
