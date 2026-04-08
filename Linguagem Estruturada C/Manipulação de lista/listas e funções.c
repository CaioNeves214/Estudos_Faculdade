#include <stdio.h>

// VARIAVEIS A SEREM UTILIZADAS
int idades[20];
int idade_lida = 0;
int cont_de_idades = 0;
int soma = 0;
float media = 0.0;
int maior = 0;

// FUNÇÃO PARA EXIBIR DADOS
void mostrarDados(int vetor_de_idades[], int quantidade_total){
    for(int i = 0; i < cont_de_idades; i++){
        printf("Idade lida: %d\n", vetor_de_idades[i]);
    }
}

// FUNÇÃO PARA OBTER MAIOR VALOR DE IDADE
int obtemMaiorValor(int vetor_de_idades[], int quantidade_total){
    for(int i = 0; i < quantidade_total; i++){
        if(vetor_de_idades[i] > maior){
            maior = vetor_de_idades[i];
        }
    }

    return maior;
}

int main(){
    for(int i = 0; i < 20; i++){
        printf("Digite uma idade: \n");
        scanf("%d", &idade_lida);

        if(idade_lida < 0){
            break;
        }else{
            idades[i] = idade_lida;
            cont_de_idades++;
        }
    }

    mostrarDados(idades, cont_de_idades);

    maior = obtemMaiorValor(idades, cont_de_idades);
    printf("A maior idade eh: %d\n", maior);

    media = soma / cont_de_idades;
    
    printf("Media das idades: %f.2\n", media);

    int maior = 0;

    for(int i = 0; i < cont_de_idades; i++){
        if(idades[i] > maior){
            maior = idades[i];
        }
    }

    int menor = idades[0];

    for(int i = 0; i < cont_de_idades; i++){
        if(idades[i] < menor){
            menor = idades[i];
        }
    }

    printf("A menor idade eh: %d\n", menor);

    printf("A diferenca entre o mais velho e o mais novo eh de: %d", maior-menor);

    float somatorio_desvios = 0.0;
    float desvio_padrao = 0.0;

    for(int i = 0; i < cont_de_idades; i++){
        float media_dif = 0.0;

        media_dif = media - idades[i];

        if(media_dif < 0){
            media_dif = media_dif * -1;
        }

        somatorio_desvios = somatorio_desvios + media_dif;
    }

    desvio_padrao = somatorio_desvios / cont_de_idades;

    printf("O desvio padrao eh de: %.2f", desvio_padrao);
}
