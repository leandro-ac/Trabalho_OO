package Trabalho_OO;
// SistemaVendas c/ coleções e métodos básico
import java.util.ArrayList;
import java.util.List;

public class SistemaVendas implements IVenda { // Implementação da interface IVenda
    private List<Cliente> clientes = new ArrayList<>();    // Coleções: lista de clientes (Agregação)
    private List<Evento> eventos = new ArrayList<>();      // Coleções: lista de eventos (Agregação)
    private List<Ingresso> ingressos = new ArrayList<>();  // Coleções: lista de ingressos (Agregação)
    private static int totalVendas = 0;                    // Atributos estáticos: compartilhado entre instâncias

    // Método para cadastrar cliente
    public void cadastrarCliente(Cliente c) {
        clientes.add(c); // Adiciona à coleção
    }

    // Método para cadastrar evento
    public void cadastrarEvento(Evento e) {
        eventos.add(e); // Adiciona à coleção
    }

    @Override // Sobrescrita: implementação do método da interface
    public double calcularReceita() {
        return 0; // Implementação temporária
    }

    // Método estático para acessar o total de vendas
    public static int getTotalVendas() {
        return totalVendas;
    }
}
