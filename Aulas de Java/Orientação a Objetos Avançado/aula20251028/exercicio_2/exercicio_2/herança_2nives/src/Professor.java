public class Professor extends Pessoa {
    private double salario;
    private String disciplina;

    public Professor(String nome, int idade, String rg, double salario, String disciplina) {
        super(nome, idade, rg);
        this.salario = salario;
        this.disciplina = disciplina;
    }

    public void darAula() {
        System.out.println(getNome() + " está dando aula de " + disciplina + ".");
    }

    @Override
    public String obterDetalhes() {
        return "Professor: " + getNome() + ", Idade: " + getIdade() + ", Disciplina: " + disciplina;
    }
}
