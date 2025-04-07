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

    // Método para comprar ingresso
    public void comprarIngresso(int clienteId, int eventoId) {
        Cliente cliente = buscarCliente(clienteId);
        Evento evento = buscarEvento(eventoId);
        if (cliente != null && evento != null && evento.getIngressosDisponiveis() > 0) {
            String codigo = "ING" + (ingressos.size() + 1);
            ingressos.add(new Ingresso(evento, cliente, codigo)); // Composição em ação
            evento.reduzirIngressos(1);
            totalVendas++; // Atualiza atributo estático
        }
    }

    // Método para auditar ingressos disponíveis
    public int auditarIngressosDisponiveis(int eventoId) {
        Evento evento = buscarEvento(eventoId);
        return (evento != null) ? evento.getIngressosDisponiveis() : 0;
    }

    @Override // Sobrescrita: implementação do método da interface
    public double calcularReceita() {
        double total = 0;
        for (Ingresso i : ingressos) { // Polimorfismo: itera sobre coleção de ingressos
            total += i.getEvento().getValorIngresso();
        }
        return total;
    }

    // Sobrecarga: versão do método com parâmetro específico
    public double calcularReceita(int eventoId) {
        double total = 0;
        for (Ingresso i : ingressos) { // Polimorfismo: itera sobre coleção de ingressos
            if (i.getEvento().getId() == eventoId) {
                total += i.getEvento().getValorIngresso();
            }
        }
        return total;
    }

    // Método auxiliar para buscar cliente
    private Cliente buscarCliente(int id) {
        return clientes.stream().filter(c -> c.getId() == id).findFirst().orElse(null);
    }

    // Método auxiliar para buscar evento
    private Evento buscarEvento(int id) {
        return eventos.stream().filter(e -> e.getId() == id).findFirst().orElse(null);
    }

    // Método estático para acessar o total de vendas
    public static int getTotalVendas() {
        return totalVendas;
    }
}
