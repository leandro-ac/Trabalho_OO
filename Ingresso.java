package Trabalho_OO;
// Classe Ingresso
public class Ingresso {
    private Evento evento;    // Composição: Ingresso contém um Evento
    private Cliente cliente;  // Composição: Ingresso contém um Cliente
    private String codigo;    // Encapsulamento: atributo privado

    // Construtor para criar um Ingresso com composição
    public Ingresso(Evento evento, Cliente cliente, String codigo) {
        this.evento = evento;
        this.cliente = cliente;
        this.codigo = codigo;
    }

    // Métodos getters para acesso controlado (Encapsulamento)
    public Evento getEvento() { return evento; }
    public Cliente getCliente() { return cliente; }
    public String getCodigo() { return codigo; }
}