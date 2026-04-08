// 5. Convertendo para Maiúsculas / Minúsculas : Leia uma string e converta todas as letras para maiúsculas ou minúsculas.

#include <stdio.h>

int main()
{
    char string[40];
    int i;

    // Solicita a string do usuário
    printf("Digite uma string: ");
    scanf("%s", string);

    // Verifica se a primeira letra da string é minúscula
    if (string[0] >= 'a' && string[0] <= 'z') 
    {
        // Se for minúscula, converte toda a string para maiúscula
        for (i = 0; string[i] != '\0'; i++)
        {
            string[i] = string[i] - 32; // Converte para maiúscula (diferença entre minúscula e maiúscula é 32 na tabela ASCII)
        }
        printf("String em maiusculas: %s\n", string);
    }
    else
    { 
        // Se for maiúscula, converte toda a string para minúscula
        for (i = 0; string[i] != '\0'; i++)
        {
            if (string[i] >= 'A' && string[i] <= 'Z')
            {
                string[i] = string[i] + 32; // Converte para minúscula (diferença entre maiúscula e minúscula é 32 na tabela ASCII)
            }
        }
        printf("String em minusculas: %s\n", string);
    }
}
