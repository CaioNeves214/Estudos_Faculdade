// 10. Substituindo um Caractere por Outro : Leia uma string, um caractere a ser substituído e um caractere substituto.Substitua todas as ocorrências do primeiro caractere pelo segundo.


#include <stdio.h>

int main() {
    char string[35], caractere, caractereSubstituto;

    // Solicita a string ao usuário
    printf("Digite uma string: ");
    scanf("%s", string);

    // Solicita o caractere a ser substituído
    printf("Digite o caractere a ser substituido: ");
    scanf("%c", &caractere); // Pode ter problema com o espaço antes de scanf; veja abaixo

    // Solicita o caractere substituto
    printf("Para qual caractere?: ");
    scanf(" %c", &caractereSubstituto); // O espaço antes de %c é para ignorar o caractere de nova linha

    // Percorre a string e substitui os caracteres conforme necessário
    for (int i = 0; string[i] != '\0'; i++) {
        if (string[i] == caractere) { // Se o caractere atual for igual ao que queremos substituir
            string[i] = caractereSubstituto; // Substitui pelo caractere novo
        }
    }

    // Exibe a string após a substituição
    printf("String apos substituicao: %s\n", string);
}
