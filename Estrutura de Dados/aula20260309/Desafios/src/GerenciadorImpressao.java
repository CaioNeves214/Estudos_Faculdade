public class GerenciadorImpressao {
    public FilaDinamica filaChamadoo;
    
    public GerenciadorImpressao(){
        this.filaChamadoo = new FilaDinamica();
    }

     public boolean filaVazia(){
        return filaChamadoo.isEmpty();
    }

    public void enviarDocumento(int numero_documento){
        filaChamadoo.enfileirar(numero_documento);
    }

    public void processarImpressao(){
        filaChamadoo.desenfileirar();
    }

    public void exibirFilaPendente(){
        filaChamadoo.imprimir();
    }
}
