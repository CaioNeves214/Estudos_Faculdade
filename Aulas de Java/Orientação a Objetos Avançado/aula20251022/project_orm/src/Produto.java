public class Produto {
 private int cod;
 private String nome;
 private int categoria;

 public Produto(){}
 
 public Produto(int cod, String nome, int categoria){
    this.cod = cod;
    this.nome = nome;
    this.categoria = categoria;
}

 public void setCod(Integer newCod){
    this.cod = newCod;
 }

 public void setNome(String newNome){
    this.nome = newNome;
 }

 public void setCategoria(Integer newCategoria) {
    this.categoria = newCategoria;
 }

 public Integer getCod() {
    return this.cod;
 }
 
 public String getNome() {
    return this.nome;
 }

 public Integer getCategoria() {
    return this.categoria;
 }

 @Override
 public String toString() {
    return "Produto: "+nome;
 }

}
