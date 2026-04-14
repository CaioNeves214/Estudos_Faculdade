public class GerenciadorAtendimento {
    public FilaDinamica filaChamado;

    public GerenciadorAtendimento(){
        filaChamado = new FilaDinamica();
    }

    public void abrirChamado(int idChamado){
        filaChamado.enfileirar(idChamado);
    }

    public void verificarProximoChamado(){
        filaChamado.observar();
    }

    public void atenderChamado(){
        filaChamado.desenfileirar();
    }

    public void exibirPainel(){
        filaChamado.imprimir();
    }
}
