// 6. Invertendo uma String : 
//Leia uma string e inverta a ordem de seus caracteres.

#include <stdio.h>

int main() {
    char str[30];
    int i, j, tamanhoString;

    // Solicita ao usuário para digitar uma string
    printf("Digite uma string: ");
    scanf("%s", str);

    // Conta o tamanho da string
    for (tamanhoString = 0; str[tamanhoString] != '\0'; tamanhoString++);

    // Inverte a string: i vai da esquerda para a direita e j da direita para a esquerda
    for (i = 0, j = tamanhoString - 1; i < j; i++, j--) { 
        char hold = str[i]; // Guarda o valor de str[i] temporariamente
        str[i] = str[j];    // Troca o valor de str[i] com o de str[j]
        str[j] = hold;      // Coloca o valor guardado de str[i] em str[j]
    }

    // Exibe a string invertida
    printf("String invertida: %s\n", str);
}
