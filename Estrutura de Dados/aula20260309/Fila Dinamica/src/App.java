public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("=== TESTANDO A FILA DINÂMICA (FIFO) ===\n");

        FilaDinamica fila = new FilaDinamica();

        System.out.println("1. Chegaram três clientes: 10, 20 e 30...");
        fila.enfileirar(10);
        fila.enfileirar(20);
        fila.enfileirar(30);
        fila.imprimir(); // Esperado: [ 10 -> 20 -> 30 ]

        System.out.println("\n2. Quem é o próximo a ser atendido? (Peek)");
        System.out.println("Próximo: " + fila.observar());

        System.out.println("\n3. Atendendo (Dequeue) os dois primeiros...");
        System.out.println("Atendido: " + fila.desenfileirar()); // Tira o 10
        System.out.println("Atendido: " + fila.desenfileirar()); // Tira o 20
        fila.imprimir(); // Esperado: [ 30 ]

        System.out.println("\n4. Chegou mais um cliente: 40...");
        fila.enfileirar(40);
        fila.imprimir(); // Esperado: [ 30 -> 40 ]

        System.out.println("\n5. Esvaziando o resto da fila...");
        System.out.println("Atendido: " + fila.desenfileirar()); // Tira o 30
        System.out.println("Atendido: " + fila.desenfileirar()); // Tira o 40
        fila.imprimir(); // Esperado: [ Vazia ]
        
        System.out.println("\n=== FIM DOS TESTES ===");
    }
}
