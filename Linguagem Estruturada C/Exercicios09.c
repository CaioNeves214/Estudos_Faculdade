// 9. Verificando se uma String é Palíndromo : Leia uma string e verifique se ela é um palíndromo(lê - se da mesma forma de trás para frente).
#include <stdio.h>
#include <string.h>

int main()
{
    char str[30];
    printf("Digite uma string: ");
    scanf("%s", str); // Solicita a string ao usuário

    // i percorre a string da esquerda para a direita e j da direita para a esquerda
    for (int i = 0, j = strlen(str) - 1; j > i; i++, j--) 
    {
        // Se os caracteres em i e j não forem iguais, a string não é um palíndromo
        if (str[i] != str[j]) 
        {
            printf("A string nao eh um palindromo.\n"); // Exibe mensagem se não for palíndromo
            return 0; // Encerra o programa
        }
    }

    // Se a condição anterior não for atendida, significa que a string é um palíndromo
    printf("A string eh um palindromo.\n"); 
}
