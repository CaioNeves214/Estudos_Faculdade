public class PilhaDinamica {
    public int dado;
    public FilaDinamica proximo; // Aponta para o nó que está "embaixo" dele na fila

    public FilaDinamica(int dado) {
        this.dado = dado;
        this.proximo = null;
    }

    // Método para inverter a fila
    public void inverterFila() {
        PilhaDinamica anterior = null;
        PilhaDinamica atual = this;
        PilhaDinamica proximo = null;

        while (atual != null) {
            proximo = atual.proximo; // Armazena o próximo nó
            atual.proximo = anterior; // Inverte o ponteiro do nó atual
            anterior = atual; // Move o ponteiro anterior para o nó atual
            atual = proximo; // Move para o próximo nó
        }
    }

    public void int contarOcorrencias(int valor) {
        int contador = 0;
        PilhaDinamica atual = this;

        while (atual != null) {
            if (atual.dado == valor) {
                contador++;
            }
            atual = atual.proximo; // Move para o próximo nó
        }

        return contador;
    }

    public boolean validarExpressao(String expressao) {
        PilhaDinamica pilha = new PilhaDinamica(0); // Criar uma pilha para armazenar os parênteses

        for (char c : expressao.toCharArray()) {
            if (c == '(') {
                pilha.push(0); // Empilha um valor qualquer para representar um parêntese aberto
            } else if (c == ')') {
                if (pilha.isEmpty()) {
                    return false; // Se a pilha estiver vazia, há um parêntese fechado sem correspondente aberto
                }
                pilha.pop(); // Desempilha o parêntese aberto correspondente
            }
        }

        return pilha.isEmpty(); // A expressão é válida se a pilha estiver vazia no final
    }

    public void removerZeros() {
        PilhaDinamica atual = this;
        PilhaDinamica anterior = null;

        while (atual != null) {
            if (atual.dado == 0) {
                if (anterior == null) {
                    // Se o nó a ser removido é o primeiro da pilha
                    this.dado = atual.proximo != null ? atual.proximo.dado : 0; // Atualiza o dado do nó atual
                    this.proximo = atual.proximo != null ? atual.proximo.proximo : null; // Atualiza o próximo do nó atual
                } else {
                    // Se o nó a ser removido não é o primeiro da pilha
                    anterior.proximo = atual.proximo; // Pula o nó atual
                }
            } else {
                anterior = atual; // Move o ponteiro anterior para o nó atual
            }
            atual = atual.proximo; // Move para o próximo nó
        }
    }

    public void concatenar(ListaDinamica outraLista) {
        PilhaDinamica atual = this;

        // Move para o final da pilha atual
        while (atual.proximo != null) {
            atual = atual.proximo;
        }

        // Concatena a outra lista à pilha atual
        atual.proximo = outraLista.getHead(); // Supondo que ListaDinamica tenha um método getHead() que retorna o primeiro nó
    }

    public boolean isPalindromo(String palavra) {
        PilhaDinamica pilha = new PilhaDinamica(0); // Criar uma pilha para armazenar os caracteres

        // Empilha os caracteres da palavra
        for (char c : palavra.toCharArray()) {
            pilha.push(c); // Empilha o caractere
        }

        // Verifica se a palavra é um palíndromo
        for (char c : palavra.toCharArray()) {
            if (pilha.pop() != c) { // Desempilha e compara com o caractere atual
                return false; // Se houver uma diferença, não é um palíndromo
            }
        }

        return true; // Se todos os caracteres corresponderem, é um palíndromo
    }

    public int batataQuente(FilaDinamica roda, int pases) {
        for (int i = 0; i < pases; i++) {
            int jogador = roda.dequeue(); // Remove o jogador da frente da fila
            roda.enqueue(jogador); // Adiciona o jogador de volta no final da fila
        }
        return roda.dequeue(); // O jogador que ficar na frente após os pases é o perdedor
    }

    public void inverterLista() {
        PilhaDinamica anterior = null;
        PilhaDinamica atual = this;
        PilhaDinamica proximo = null;

        while (atual != null) {
            proximo = atual.proximo; // Armazena o próximo nó
            atual.proximo = anterior; // Inverte o ponteiro do nó atual
            anterior = atual; // Move o ponteiro anterior para o nó atual
            atual = proximo; // Move para o próximo nó
        }
    }
    
}
