import modelo.*;
import util.ManipuladorArquivos;
import java.util.Date;
import java.util.List;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        System.out.println("--- Gerenciamento de Pacientes ---");
        // 1. Cria uma lista vazia para armazenar os pacientes
        List<Paciente> pacientes = new ArrayList<>();
        // 2. Carrega todos os pacientes do arquivo para a lista
        pacientes = ManipuladorArquivos.lerPacientes();
        System.out.println("Pacientes carregados do arquivo: " + pacientes.size());
        // 3. Cria um novo paciente e gera um ID único para ele
        int novoId = ManipuladorArquivos.proximoId("Paciente");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date dataNascimento = null;
        try {
            dataNascimento = sdf.parse("15/05/1990");
        } catch (java.text.ParseException e) {
            System.out.println("Erro ao converter data de nascimento: " + e.getMessage());
            return;
        }
        Paciente novoPaciente = new Paciente(novoId, "Pedro Silva", dataNascimento, "(35) 99123-4567", "pedro.s@email.com");
        // 4. Salva o novo paciente no arquivo
        ManipuladorArquivos.salvarObjeto("Paciente", novoPaciente, 5);
        System.out.println("Novo paciente salvo: " + novoPaciente.getNome());
        // 5. Adiciona o novo paciente à nossa lista em memória
        pacientes.add(novoPaciente);
        System.out.println("\n--- Lista Completa de Pacientes ---");
        // 6. Percorre a lista e imprime todos os pacientes
        for (Paciente p : pacientes) {
            System.out.println(p.toString());
        }
    }
}


