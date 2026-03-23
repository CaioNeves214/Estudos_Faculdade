public class PilhaDinamica {
    public int dado;
    public PilhaDinamica proximo; // Corrigido o tipo

    // Construtor corrigido
    public PilhaDinamica(int dado) {
        this.dado = dado;
        this.proximo = null;
    }

    // Métodos básicos de pilha (necessários para compilar)
    public void push(int valor) {
        PilhaDinamica novo = new PilhaDinamica(valor);
        novo.proximo = this.proximo;
        this.proximo = novo;
    }

    public int pop() {
        if (this.proximo == null) {
            return -1;
        }
        int valor = this.proximo.dado;
        this.proximo = this.proximo.proximo;
        return valor;
    }

    public boolean isEmpty() {
        return this.proximo == null;
    }

    public boolean validarExpressao(String expressao) {
        PilhaDinamica pilha = new PilhaDinamica(0);

        for (char c : expressao.toCharArray()) {
            if (c == '(') {
                pilha.push(0);
            } else if (c == ')') {
                if (pilha.isEmpty()) {
                    return false;
                }
                pilha.pop();
            }
        }

        return pilha.isEmpty();
    }

    public boolean isPalindromo(String palavra) {
        PilhaDinamica pilha = new PilhaDinamica(0);

        for (char c : palavra.toCharArray()) {
            pilha.push(c);
        }

        for (char c : palavra.toCharArray()) {
            if (pilha.pop() != c) {
                return false;
            }
        }

        return true;
    }

    public void inverterLista() {
        PilhaDinamica anterior = null;
        PilhaDinamica atual = this;
        PilhaDinamica proximo = null;

        while (atual != null) {
            proximo = atual.proximo;
            atual.proximo = anterior;
            anterior = atual;
            atual = proximo;
        }
    }
}