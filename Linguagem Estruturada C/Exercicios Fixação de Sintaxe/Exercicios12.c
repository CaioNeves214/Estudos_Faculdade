//  12. Implementando a Função strstr: (Desafio)
//  Implemente sua própria versão da função strstr, que encontra a primeira ocorrência de uma substring em uma string.
#include <stdio.h>

char* minhaStrstr(char* str, char* sub) {
    int i, j;
    
    // Se a substring for vazia, retorna a string inteira
    if (*sub == '\0') {
        return str;
    }

    // Percorre a string principal
    for (i = 0; str[i] != '\0'; i++) {
        // Quando encontramos o primeiro caractere que coincide com o começo da substring
        if (str[i] == sub[0]) {
            // Verifica se a substring inteira coincide
            for (j = 0; sub[j] != '\0'; j++) {
                if (str[i + j] != sub[j]) {
                    break;  // Se algum caractere não for igual, sai do loop
                }
            }
            
            // Se conseguimos comparar toda a substring, retornamos o endereço de onde encontramos
            if (sub[j] == '\0') {
                return &str[i];  // Encontramos a substring, então retornamos o endereço
            }
        }
    }
    
    // Se não encontramos a substring, retorna NULL
    return NULL;
}

int main() {
    char str[100], sub[100];
    
    // Lê a string principal e a substring
    printf("Digite a string principal: ");
    fgets(str, sizeof(str), stdin);
    
    printf("Digite a substring a ser procurada: ");
    fgets(sub, sizeof(sub), stdin);
    
    // Chamamos nossa função personalizada para encontrar a substring
    char* resultado = minhaStrstr(str, sub);
    
    if (resultado != NULL) {
        printf("Substring encontrada: %s", resultado);
    } else {
        printf("Substring nao encontrada.\n");
    }

}
