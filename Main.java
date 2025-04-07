package Trabalho_OO;
// Main.java
public class Main {
    public static void main(String[] args) {
        SistemaVendas sistema = new SistemaVendas(); // Instanciação: criação de objeto

        // Instanciação de objetos Cliente e Evento
        Cliente c1 = new Cliente(1, "Leandro", "leandro@email.com"); // Classificação/Instanciação
        Evento e1 = new Evento(1, "Jogocl do Vasco", "2025-05-01", 50.0, 100); // Classificação/Instanciação

        sistema.cadastrarCliente(c1);
        sistema.cadastrarEvento(e1);
        sistema.comprarIngresso(1, 1);

        // Teste das funcionalidades
        System.out.println("Ingressos disponíveis: " + sistema.auditarIngressosDisponiveis(1));
        System.out.println("Receita total: " + sistema.calcularReceita());
        System.out.println("Receita do evento 1: " + sistema.calcularReceita(1));
        System.out.println("Total de vendas: " + SistemaVendas.getTotalVendas()); // Uso de método estático
    }
}
