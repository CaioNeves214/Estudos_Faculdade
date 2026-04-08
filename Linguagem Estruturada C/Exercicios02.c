// 2. Concatenando Strings : Leia duas strings e concatene - as, imprimindo o resultado.Crie uma função para concatenar duas strings.

#include <stdio.h>
#include <string.h>


char* concatenaString(char str1[], char str2[]) {
    static char stringConcatenada[60];  // Retorna uma string estática concatenada
    // Copia str1 para stringConcatenada
    strcpy(stringConcatenada, str1);
    // Concatena str2 a stringConcatenada
    strcat(stringConcatenada, str2);
    return stringConcatenada;
}

int main() {
    char str1[30], str2[30];
    
    // Solicita ao usuário as duas strings
    printf("Digite a primeira string: ");
    fgets(str1, sizeof(str1), stdin);  // Lê a primeira string, incluindo espaços
    str1[strcspn(str1, "\n")] = '\0';  // Remove o caractere de nova linha da string

    printf("Digite a segunda string: ");
    fgets(str2, sizeof(str2), stdin);  // Lê a segunda string, incluindo espaços
    str2[strcspn(str2, "\n")] = '\0';  // Remove o caractere de nova linha da string

    // Chama a função de concatenação e exibe o resultado
    printf("Strings concatenadas: %s\n", concatenaString(str1, str2));
}
