//8. Removendo Espaços em Branco:
///Leia uma string e remova todos os espaços em branco no início e no final.

#include <stdio.h>

void removeEspacos(char str[]) {
    int i = 0, j = 0;
    
    // Remove os espaços do começo da string
    while (str[i] == ' ') {
        i++;
    }

    // Move os caracteres para o início da string
    while (str[i] != '\0') {
        str[j++] = str[i++];
    }

    // Agora remove os espaços do final da string
    j--;  // Ajusta j para a última posição de caracteres válidos
    while (str[j] == ' ') {
        j--;
    }

    // Adiciona o caractere nulo para marcar o final da string
    str[j + 1] = '\0';
}

int main() {
    char str[100];
    
    // Lê a string
    printf("Digite uma string: ");
    fgets(str, sizeof(str), stdin);  // usa fgets para incluir espaços

    // Chama a função para remover espaços no início e no fim
    removeEspacos(str);

    // Exibe a string sem os espaços no começo e no final
    printf("String sem espaços no início e no final: '%s'\n", str);

    return 0;
}
