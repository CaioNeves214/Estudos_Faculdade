#include <stdio.h>
#include <conio.h>
#include <stdlib.h>

int main(){

    // VARIAVEIS
    int num_random = rand() % 11;
    int chute;
    int cont;

    //Tentativa numero 1
    cont = 1;
    printf("JOGO DE ADVINHACAO\n");
    printf("voce possui 3 tentativas\n");
    printf("o numero esperado eh de 0 a 10\n");
    scanf("%d", &chute);

    //Validação da tentativa numero 1
    if(chute == num_random && cont<=3){
        cont = 4;
        printf("Parabens, voce acertou !\n");
    }else if(chute > num_random && cont<=3){
        cont = 2;
        printf("O numero escolhido eh maior do que o esperado\n");
    }else if(chute < num_random && cont<=3){
        cont = 2;
        printf("O numero escolhido eh menor do que o esperado\n");
    }

    //Tentativa numero 2
    if(cont<=3){
        printf("o numero esperado eh de 0 a 10\n");
        scanf("%d", &chute);
    }

    //Validação da tentativa numero 2
    if(chute == num_random && cont<=3){
        cont = 4;
        printf("Parabens, voce acertou !\n");
    }else if(chute > num_random && cont<=3){
        cont = 3;
        printf("O numero escolhido eh maior do que o esperado\n");
    }else if(chute < num_random && cont<=3){
        cont = 3;
        printf("O numero escolhido eh menor do que o esperado\n");
    }

    //Ultima tentativa
    if(cont<=3){
        printf("o numero esperado eh de 0 a 10\n");
        scanf("%d", &chute);
    }

    //Validação da ultima tentativa
    if(chute == num_random && cont<=3){
        cont = 4;
        printf("Parabens, voce acertou !\n");
    }else if(chute > num_random && cont<=3){
        cont = 4;
        printf("O numero escolhido eh maior do que o esperado\n");
    }else if(chute < num_random && cont<=3){
        cont = 4;
        printf("O numero escolhido eh menor do que o esperado\n");
    }

    printf("\n O numero correto eh: %d", num_random);

}
