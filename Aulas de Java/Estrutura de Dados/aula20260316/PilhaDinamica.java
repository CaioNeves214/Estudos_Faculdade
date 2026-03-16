public class PilhaDinamica {
    public int dado;
    public PilhaDinamica proximo; // Aponta para o nó que está "embaixo" dele na pilha

    public PilhaDinamica(int dado) {
        this.dado = dado;
        this.proximo = null;
    }
}
