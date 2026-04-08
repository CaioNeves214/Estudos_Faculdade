// 11. Quebrando uma String em Palavras : Leia uma frase e quebre - a em palavras, armazenando cada palavra em um vetor de strings.

#include <stdio.h>

int main() {
    char string[60], palavra[60][60];
    int j = 0, k = 0;

    // Solicita ao usuário para digitar uma frase
    printf("Digite uma frase: ");
    fgets(string, 60, stdin); // fgets lê uma linha inteira, permitindo espaços na frase

    // Percorre a string e divide as palavras
    for (int i = 0; string[i] != '\0'; i++) { 
        if (string[i] == ' ') { // Se o caractere atual for um espaço
            palavra[j][k] = '\0'; // Adiciona o caractere nulo no final da palavra
            j++; // Aumenta o índice da palavra
            k = 0; // Reinicia o índice da palavra
        } else { // Se não for um espaço
            palavra[j][k] = string[i]; // Adiciona o caractere atual à palavra
            k++; // Aumenta o índice da palavra
        }
    }

    // Exibe as palavras separadas da string
    printf("Palavras da string:\n");
    for (int i = 0; i <= j; i++) { 
        printf("%s\n", palavra[i]); // Imprime cada palavra
    }
}
