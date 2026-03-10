import java.util.ArrayList;

public class ConversorBinario {
    public PilhaDinamica novaPilha;

    public void novaPilhaDinamica(){
        novaPilha = new PilhaDinamica();
    }

    public static String converter(int numero){
        ArrayList<Integer> listaNumeros = new ArrayList<Integer>();
        while (numero != 0) {
            int result = numero/2;
            numero = result;
            listaNumeros.add(result%2);
        }
        return listaNumeros;
    }

}
