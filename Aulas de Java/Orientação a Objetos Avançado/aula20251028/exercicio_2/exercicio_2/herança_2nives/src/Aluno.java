public class Aluno extends Pessoa {
    private String matricula;
    private String curso;

    public Aluno(String nome, int idade, String rg, String matricula, String curso) {
        super(nome, idade, rg);
        this.matricula = matricula;
        this.curso = curso;
    }

    public void entregarTrabalho() {
        System.out.println(getNome() + " entregou o trabalho da disciplina do curso " + curso + ".");
    }

    @Override
    public String obterDetalhes() {
        return "Aluno: " + getNome() + ", Idade: " + getIdade() + ", Matrícula: " + matricula;
    }
}
