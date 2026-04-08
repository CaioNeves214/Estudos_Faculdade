// 1. Leitura e Impressão:
// Leia uma string e a imprima na tela.
// Leia duas strings e as imprima em linhas separadas.

#include <stdio.h>

int main()
{
    char str1[30];
    char str2[30], str3[30];

    // Solicita ao usuário para digitar a primeira string
    printf("Digite uma string: ");
    scanf("%29s", str1);  // Limita a entrada para evitar estouro de buffer (30 - 1 para o \0)
    printf("String digitada: %s\n\n\n", str1);

    // Solicita ao usuário para digitar a segunda e terceira string
    printf("Digite a segunda string: ");
    scanf(" %29s", str2);  // O espaço antes de %s remove qualquer caractere de nova linha anterior
    printf("Digite a terceira string: ");
    scanf(" %29s", str3);  // O espaço antes de %s remove qualquer caractere de nova linha anterior

    // Exibe as strings 2 e 3 digitadas
    printf("String 2: %s\nString 3: %s", str2, str3);
}
