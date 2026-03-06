public class Bolsista extends Aluno {
    private double valorBolsa;

    public Bolsista(String nome, int idade, String rg, String matricula, String curso, double valorBolsa) {
        super(nome, idade, rg, matricula, curso);
        this.valorBolsa = valorBolsa;
    }

    @Override
    public void entregarTrabalho() {
        System.out.println(getNome() + " entregou o trabalho e obterá nota bônus por ser bolsista!");
    }

    public double getValorBolsa() {
        return valorBolsa;
    }
}
