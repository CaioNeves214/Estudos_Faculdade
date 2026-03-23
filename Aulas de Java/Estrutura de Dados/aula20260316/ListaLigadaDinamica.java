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

    public int contarOcorrencias(int valor) {
        int contador = 0;
        No atual = inicio;

        while (atual != null) {
            if (atual.dado == valor) {
                contador++;
            }
            atual = atual.proximo;
        }

        return contador;
    }

    public void concatenar(ListaLigadaDinamica outraLista) {
        if (outraLista == null || outraLista.inicio == null) {
            return;
        }

        if (inicio == null) {
            inicio = outraLista.inicio;
            return;
        }

        No atual = inicio;
        while (atual.proximo != null) {
            atual = atual.proximo;
        }

        atual.proximo = outraLista.inicio;
    }

    public void removerZeros() {
        while (inicio != null && inicio.dado == 0) {
            inicio = inicio.proximo;
        }

        No atual = inicio;
        No anterior = null;

        while (atual != null) {
            if (atual.dado == 0) {
                anterior.proximo = atual.proximo;
            } else {
                anterior = atual;
            }
            atual = atual.proximo;
        }
    }

    public void inverterLista() {
        No anterior = null;
        No atual = inicio;
        No proximo = null;

        while (atual != null) {
            proximo = atual.proximo;
            atual.proximo = anterior;
            anterior = atual;
            atual = proximo;
        }

        inicio = anterior;
    }

    public No getHead() {
        return inicio;
    }
    
}
