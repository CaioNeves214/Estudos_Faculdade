public class SpoolerImpressao {
    private static class Trabalho {
        String nomeArquivo;
        Trabalho proximo;

        Trabalho(String nomeArquivo) {
            this.nomeArquivo = nomeArquivo;
            this.proximo = null;
        }
    }

    private Trabalho inicio;
    private Trabalho fim;

    public boolean isEmpty() {
        return inicio == null;
    }

    public void adicionarTrabalho(String nomeArquivo) {
        Trabalho novoTrabalho = new Trabalho(nomeArquivo);
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
            System.out.println("Imprimindo: " + inicio.nomeArquivo);
            inicio = inicio.proximo;
            if (inicio == null) {
                fim = null;
            }
        } else {
            System.out.println("Nenhum trabalho para imprimir.");
        }
    }
}
