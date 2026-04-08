#include <stdio.h>

int main(){
    int num, i = 1, j = 1;
    printf("Digite um numero:");
    scanf("%d", &num);

    while (i<=num){
        int contador = 0;
        j = 1;
        while (j<=i){
            if(i%j==0){
            contador++;
            }
            j++;
        }
        if(contador == 2){
            printf("%d\n",i);
        }

    i++;
        }
}
