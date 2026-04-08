// 13. Criando um Programa Simples de Busca e Substituição: (Desafio)
// Leia um texto, uma palavra a ser buscada e uma palavra para substituição. Substitua todas as ocorrências da primeira palavra pela segunda.

#include <stdio.h>
#include <string.h>

int main()
{
    char string[100], palavra[20], palavraSubstituta[20], resultado[120];
    int i = 0, j, k = 0, encontrada;

    printf("Digite uma string: ");
    fgets(string, 100, stdin); // fgets pega a string com espaços, passando o tamanho da string e o stdin

    printf("Digite a palavra a ser substituida: ");
    scanf("%s", palavra);

    printf("Para qual palavra?: ");
    scanf("%s", palavraSubstituta);

    while (string[i] != '\0') // Enquanto não chegar ao final da string
    {
        j = 0; // Reinicia o índice da palavra
        encontrada = 0;

        // Verifica se a palavra na string corresponde à palavra a ser substituída
        while (string[i + j] == palavra[j] && palavra[j] != '\0') 
        {
            j++;
        }

        // Se a palavra foi encontrada
        if (palavra[j] == '\0') 
        {
            encontrada = 1;
            // Substitui pela palavra substituta
            for (j = 0; palavraSubstituta[j] != '\0'; j++, k++)
            {
                resultado[k] = palavraSubstituta[j];
            }
            i += strlen(palavra); // Avança o índice da string pela quantidade de caracteres da palavra encontrada
        }

        // Se não encontrou a palavra, copia o caractere atual da string para o resultado
        if (encontrada == 0) 
        {
            resultado[k] = string[i];
            i++;
            k++;
        }
    }

    resultado[k] = '\0'; // Finaliza a string resultado

    printf("String nova: %s\n", resultado); // Exibe a string após a substituição
}
