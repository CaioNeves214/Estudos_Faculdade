public class App {
    public static void main(String[] args) {
        FilaDinamica novaFila = new FilaDinamica();
        PilhaDinamica novaPilha = new PilhaDinamica(0);
        ListaLigadaDinamica novaLista = new ListaLigadaDinamica();
        SpoolerImpressao newSpooler = new SpoolerImpressao();

        // Questão 15
        novaFila.inverterFila();

        // Questão 16
        novaLista.inserirNoFim(1);

        // Questão 17
        newSpooler.adicionarTrabalho(null);
        newSpooler.imprimirProximo();

        // Questão 18
        novaLista.contarOcorrencias(1);

        // Questão 19
        novaPilha.validarExpressao("((()))");

        // Questão 20
        novaLista.removerZeros();

        // Questão 21
        ListaLigadaDinamica outraLista = new ListaLigadaDinamica();
        outraLista.inserirNoFim(5);
        outraLista.inserirNoFim(10);
        novaLista.concatenar(outraLista);

        System.out.println("Ocorrências de 10: " + novaLista.contarOcorrencias(10));

        // Questão 22
        novaPilha.isPalindromo("radar");

        // Questão 23
        // garantia de fila não vazia antes do jogo
        novaFila.enqueue(1);
        novaFila.enqueue(2);
        novaFila.enqueue(3);
        int eliminado = novaFila.batataQuente(novaFila, 0);
        System.out.println("Eliminado: " + eliminado);

        // Questão 24
        novaLista.inverterLista();
    }
}
