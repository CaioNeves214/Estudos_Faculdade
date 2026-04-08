// 4. Comparando Strings : Leia duas strings e compare - as, indicando se são iguais ou diferentes.

#include <stdio.h>

int main(){
    char str1[30], str2[30];  // Declaração de dois arrays de caracteres para armazenar as strings
    int i = 0, j = 0, flag = 0;  // Inicialização dos índices i e j, e a flag para verificar se as strings são iguais
    printf("Digite a primeira string: ");
    scanf("%s", str1);  // Lê a primeira string do usuário
    printf("Digite a segunda string: ");
    scanf("%s", str2);  // Lê a segunda string do usuário

    // Laço que percorre ambas as strings até o final de uma delas
    while (str1[i] != '\0' && str2[j] != '\0'){  
        if (str1[i] != str2[j]){  // Verifica se os caracteres na posição i e j são diferentes
            flag = 1;  // Se forem diferentes, coloca 1 na flag para indicar que as strings são diferentes
            break;  // Sai do laço, pois já sabemos que as strings não são iguais
        }
        i++;  // Avança para o próximo caractere da primeira string
        j++;  // Avança para o próximo caractere da segunda string
    }

    // Verifica se a flag foi alterada para 1 (strings diferentes) ou não (strings iguais)
    if (flag == 0){
        printf("As strings sao iguais.");  // Se flag for 0, as strings são iguais
    } else {
        printf("As strings sao diferentes.");  // Se flag for 1, as strings são diferentes
    }
}
