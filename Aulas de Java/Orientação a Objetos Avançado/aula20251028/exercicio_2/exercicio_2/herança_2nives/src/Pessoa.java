public abstract class Pessoa {
    private String nome;
    private int idade;
    private String rg;

    public Pessoa(String nome, int idade, String rg) {
        this.nome = nome;
        this.idade = idade;
        this.rg = rg;
    }

    public abstract String obterDetalhes();

    public final void identificarBiometria() {
        System.out.println(nome + " foi identificado via biometria.");
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getRg() {
        return rg;
    }
}
