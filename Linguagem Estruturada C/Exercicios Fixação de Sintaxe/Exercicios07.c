// 7. Contando Ocorrências de um Caractere : Leia uma string e um caractere, e conte quantas vezes o caractere aparece na string.

#include <stdio.h>

int main() {
    char string[35], caractere;
    int i, contador = 0;

    // Solicita a entrada da string
    printf("Digite uma string: ");
    scanf("%s", string);

    // Pergunta qual caractere o usuário quer verificar
    printf("Qual caractere voce quer verificar? \n");
    scanf(" %c", &caractere);

    // Conta quantas vezes o caractere aparece na string
    for (i = 0; string[i] != '\0'; i++) {
        if (string[i] == caractere) {
            contador++; // Incrementa o contador sempre que o caractere for encontrado
        }
    }

    // Exibe o resultado
    printf("O caractere '%c' aparece %d vezes na string\n", caractere, contador);
}
