public class SistemaUniversidade {
    public static void main(String[] args) {
        Professor prof = new Professor("Carlos", 45, "1234567", 5000.00, "POO");
        Aluno aluno = new Aluno("Ana", 20, "7654321", "2023101", "Engenharia");
        Bolsista bolsista = new Bolsista("João", 22, "9988776", "2023123", "Computação", 800.00);

        prof.darAula();
        aluno.entregarTrabalho();
        bolsista.entregarTrabalho();

        Pessoa p1 = prof;
        Pessoa p2 = aluno;
        Pessoa p3 = bolsista;

        System.out.println("\nDetalhes das Pessoas:");
        System.out.println(p1.obterDetalhes());
        System.out.println(p2.obterDetalhes());
        System.out.println(p3.obterDetalhes());

        System.out.println("\nTestando método final identificarBiometria():");
        prof.identificarBiometria();
        aluno.identificarBiometria();
        bolsista.identificarBiometria();
    }
}
