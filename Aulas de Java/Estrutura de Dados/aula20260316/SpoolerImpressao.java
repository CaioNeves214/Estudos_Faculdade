public class SpoolerImpressao {
    public FilaDinamica inicio;
    public FilaDinamica fim;

    public void adicionarTrabalho(String nomeArquivo) {
        FilaDinamica novoTrabalho = new FilaDinamica(nomeArquivo);
        if (inicio == null) {
            inicio = novoTrabalho;
            fim = novoTrabalho;
        } else {
            fim.proximo = novoTrabalho;
            fim = novoTrabalho;
        }
    }

    public void imprimirProximo() {
        if (inicio != null) {
            System.out.println("Imprimindo: " + inicio.dado);
            inicio = inicio.proximo;
            if (inicio == null) {
                fim = null;
            }
        } else {
            System.out.println("Nenhum trabalho para imprimir.");
        }
    }
}
