// 3. Calculando o Comprimento : Leia uma string e calcule o seu comprimento, sem usar a função strlen.

#include <stdio.h>

int main() {
    char str[30];
    int i = 0;

    // Solicita ao usuário para digitar uma string
    printf("Digite uma string: ");
    fgets(str, sizeof(str), stdin); // Lê a string incluindo espaços

    // Remove o caractere de nova linha, se presente
    str[strcspn(str, "\n")] = '\0';

    // Calcula o comprimento da string
    while (str[i] != '\0') {
        i++;
    }

    // Exibe o comprimento da string
    printf("Comprimento da string: %d\n", i);
}
