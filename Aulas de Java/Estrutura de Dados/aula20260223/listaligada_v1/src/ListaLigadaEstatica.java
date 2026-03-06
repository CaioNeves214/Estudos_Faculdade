public class ListaLigadaEstatica {
    // Array que armazena os nós (estrutura estática).
    private final Elemento[] vetorDeNos;
    // Índice do primeiro elemento lógico da lista.
    private int inicio;
    // Índice do primeiro espaço livre na lista de disponíveis.
    private int disponivel;

    ListaLigadaEstatica(int capacidade) {
        if (capacidade <= 0) {
            throw new IllegalArgumentException("Capacidade deve ser positiva.");
        }
        // Cria o array de nós com a capacidade definida.
        this.vetorDeNos = new Elemento[capacidade];
        this.inicio = -1; // Lista começa vazia
        // Prepara a lista de espaços livres.
        inicializarListaLivre();
    }

    private void inicializarListaLivre() {
        for (int i = 0; i < vetorDeNos.length; i++) {
            int proximo;
            
            // Se for o último índice, aponta para -1 (fim da lista)
             if (i == vetorDeNos.length - 1) {
                proximo = -1;
            } else {
                // Caso contrário, aponta para a próxima posição do array
                proximo = i + 1;
            }
            
            vetorDeNos[i] = new Elemento(0, proximo);
        }
        disponivel = 0; // O primeiro espaço livre é o índice 0
    }

    // Remove o primeiro índice da lista de disponíveis.
    private int obterNoLivre() {
        if (disponivel == -1) {
            throw new IllegalStateException("Lista cheia.");
        }
        // Retira o primeiro índice disponível.
        int indice = disponivel;
        // Atualiza a cabeça da lista de disponíveis.
        disponivel = vetorDeNos[indice].proximo;
        return indice;
    }

    // Devolve um índice para a lista de disponíveis.
    private void devolverNoLivre(int indice) {
        // Encadeia o índice devolvido no início da lista de disponíveis.
        vetorDeNos[indice].proximo = disponivel;
        disponivel = indice;
    }

    public boolean estaVazia() {
        // Lista vazia quando não há cabeça definida.
        return inicio == -1;
    }

    // Conta quantos nós estão na lista.
    public int tamanho() {
        int count = 0;
        int atual = inicio;
        // Conta nós até o fim da lista.
        while (atual != -1) {
            count++;
            atual = vetorDeNos[atual].proximo;
        }
        return count;
    }

    // Exibe a lista no formato [a, b, c].
    public void imprimir() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        int atual = inicio;
        // Monta a saída na ordem lógica.
        while (atual != -1) {
            sb.append(vetorDeNos[atual].dado);
            atual = vetorDeNos[atual].proximo;
            if (atual != -1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        System.out.println(sb.toString());
    }

    public boolean deletar_dado(int dado){
        int anterior = -1;
        int atual = inicio;

        while (atual != -1 && vetorDeNos[atual].dado != dado) {
            anterior = atual;
            atual = vetorDeNos[atual].proximo;
        }
        if(atual == -1){
            return false;
        }
        if(anterior == -1){
            inicio = vetorDeNos[atual].proximo;
        }else{
            vetorDeNos[anterior].proximo = vetorDeNos[atual].proximo;
        }
        return false;
    }
}

