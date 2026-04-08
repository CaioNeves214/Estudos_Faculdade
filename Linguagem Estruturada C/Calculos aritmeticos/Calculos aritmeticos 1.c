#include <stdio.h>

int main() {
	int num1 = 20, num2 = 5;
    int subt = num1 - num2;
    int mult = num1*num2;
    int restDiv = num1%num2;
	int soma = num1+num2;
    float divi = num1/num2;

	printf("%d + %d = %d\n", num1, num2, soma);
	printf("%d - %d = %d\n", num1, num2, subt);
	printf("%d * %d = %d\n", num1, num2, mult);
	printf("%d / %d = %.2f\n", num1, num2, divi);
	printf("%d %% %d = %d\n", num1, num2, restDiv);
}
