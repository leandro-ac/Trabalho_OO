package Trabalho_OO;
// Classe Evento
public class Evento {
    private int id;              // Encapsulamento: atributos privados
    private String nome;
    private String data;
    private double valorIngresso; // Encapsulamento: valor do ingresso
    private int ingressosDisponiveis;

    // Construtor para instanciação da classe
    public Evento(int id, String nome, String data, double valorIngresso, int ingressosDisponiveis) {
        this.id = id;
        this.nome = nome;
        this.data = data;
        this.valorIngresso = valorIngresso;
        this.ingressosDisponiveis = ingressosDisponiveis;
    }

    // Métodos getters para acesso controlado (Encapsulamento)
    public int getId() { return id; }
    public String getNome() { return nome; }
    public String getData() { return data; }
    public double getValorIngresso() { return valorIngresso; }
    public int getIngressosDisponiveis() { return ingressosDisponiveis; }

    // Método para reduzir ingressos disponíveis
    public void reduzirIngressos(int quantidade) {
        if (quantidade <= ingressosDisponiveis) {
            ingressosDisponiveis -= quantidade;
        }
    }
}
