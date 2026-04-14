public class FilaDinamica {
    private No inicio;
    private No fim;

    public FilaDinamica() {
        inicio = null;
        fim = null;
    }
    
    public void enqueue(int valor) {
        No novo = new No(valor);

        if (isEmpty()) {
            inicio = novo;
            fim = novo;
        } else {
            fim.proximo = novo;
            fim = novo;
        }
    }
    
    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Fila vazia");
        }

        int valor = inicio.dado;
        inicio = inicio.proximo;

        
        if (inicio == null) {
            fim = null;
        }

        return valor;
    }

    public void inverterFila() {
        if (isEmpty()) {
            return;
        }

        No anterior = null;
        No atual = inicio;
        No proximo;

        fim = inicio; 

        while (atual != null) {
            proximo = atual.proximo;
            atual.proximo = anterior;
            anterior = atual;
            atual = proximo;
        }

        inicio = anterior;
    }

    public int batataQuente(FilaDinamica roda, int pases) {
        if (roda == null || roda.isEmpty()) {
            System.out.println("Fila vazia: não há jogadores para batata quente.");
            return -1;
        }

        for (int i = 0; i < pases; i++) {
            int jogador = roda.dequeue();
            roda.enqueue(jogador);
        }
        return roda.dequeue();
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Fila vazia");
        }
        return inicio.dado;
    }

    public boolean isEmpty() {
        return inicio == null;
    }
}