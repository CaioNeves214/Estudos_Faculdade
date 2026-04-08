#include <stdio.h>

int main(){
    int num;
    printf("Digite um numero:");
    scanf("%d", &num);

    for (int i=1;i<=num;i=i+1){
        int contador = 0;
        for(int j=1;j<=i;j=j+1){
            if(i%j==0){
                contador = contador+1;
                
            }
        }
        if(contador== 2){
            printf("%d \n",i);
        }
        
    }
}