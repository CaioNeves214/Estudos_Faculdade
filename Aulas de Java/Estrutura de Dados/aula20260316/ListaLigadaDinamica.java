public class ListaLigadaDinamica {
    public No inicio;

    public void inserirNoFim(int valor){
        No novoNo = new No(valor);
        if(inicio == null){
            inicio = novoNo;
            return;
        }
        No atual = inicio;
        while(atual.proximo != null){
            atual = atual.proximo;
        }
        atual.proximo = novoNo;
    }
    
}
