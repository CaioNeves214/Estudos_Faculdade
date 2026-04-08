// 14. Implementando um Conversor de Cifras de César: (Desafio)
// Crie um programa que cifra e descriptografa mensagens usando a cifra de César.
#include <stdio.h>

void cifraCesar(char texto[], int chave) {
    int i = 0;
    while (texto[i] != '\0') { // Enquanto não chegar ao fim da string
        if (texto[i] >= 'a' && texto[i] <= 'z') { // Se for letra minúscula
            texto[i] = (texto[i] - 'a' + chave) % 26 + 'a'; // Desloca a letra dentro do alfabeto
        } 
        else if (texto[i] >= 'A' && texto[i] <= 'Z') { // Se for letra maiúscula
            texto[i] = (texto[i] - 'A' + chave) % 26 + 'A'; // Desloca a letra dentro do alfabeto
        }
        i++; // Vai para o próximo caractere
    }
}

void descriptografaCesar(char texto[], int chave) {
    cifraCesar(texto, -chave); // Para descriptografar, basta aplicar a chave negativa
}

int main() {
    char texto[100];
    int chave;
    
    printf("Digite uma mensagem para cifrar: ");
    fgets(texto, sizeof(texto), stdin); // Lê a mensagem inteira, incluindo espaços

    printf("Digite o valor da chave (um número): ");
    scanf("%d", &chave);

    cifraCesar(texto, chave); // Cifra a mensagem
    printf("Mensagem cifrada: %s\n", texto);

    descriptografaCesar(texto, chave); // Descriptografa a mensagem
    printf("Mensagem original (descriptografada): %s\n", texto);

    return 0;
}
