#include <stdio.h>

int main(){
    int numeros[10];    
    int numero_lido = 0;
    int contador = 10;

    for(int i = 0; i < contador; i++){
        printf("Digite um numero: ");
        scanf("%d", &numero_lido);

        numeros[i] = numero_lido;
    }

    for(int i = 0; i < contador; i++){
        printf("%d  ", numeros[i]);
    }
    

    
}


