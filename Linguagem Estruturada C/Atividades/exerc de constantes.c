#include <stdio.h>

#define MAIOR_VALOR 15
#define ELEMENTO_PARADA -1
#define MENOR_VALOR 5

int main(){
    int lista[MAIOR_VALOR];
    int numero_lido, qtd_valores_lidos = 0;

    printf("Numero maximo: %d    Numero minimo: %d\n", MAIOR_VALOR, MENOR_VALOR);
    printf("Digite um numero para acresentar a lista, digite %d caso queira parar de inserir na lista !\n", ELEMENTO_PARADA);

    while(qtd_valores_lidos < MAIOR_VALOR){
        printf("Digite um numero: ");
        scanf("%d", &numero_lido);

        if(numero_lido != ELEMENTO_PARADA){
            lista[qtd_valores_lidos] = numero_lido;
            qtd_valores_lidos++;
        }else{
            if(qtd_valores_lidos < MENOR_VALOR){
                printf("A quantidade de valores minima ainda não foi obtida !\n\n");
            }else{
                break;
            }
        }
    }

    printf("Lista de numeros digitados: ");
    for(int i=0; i < qtd_valores_lidos; i++){
        printf("%d ", lista[i]);
    }

}
