public class ListaLigadaDinamica {
    public No inicio;

    public void inserirNoInicio(int valor){
        No novoNo = new No(valor);
        novoNo.proximo = inicio;
        inicio = novoNo;
    }

    public void imprimir(){
        System.out.print("[");
        No atual = inicio;
        while(atual != null){
            System.out.print(atual.dado);
            atual = atual.proximo;
            if(atual != null){
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }

    public void excluir(int valor){
        No atual = inicio;
        No anterior = null;
        
        if(atual == null){
            System.out.println("Lista vazia");
            return;
        }
        while(atual.dado != valor){
            anterior = atual;
            atual = atual.proximo;
            if (atual == null) {
                System.out.println("O valor não existe na lista");
                return;
            }
        }
        anterior.proximo = atual.proximo;
    }
}
