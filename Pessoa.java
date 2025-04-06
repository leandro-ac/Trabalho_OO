package Trabalho_OO;
//Classe Abstrata Pessoa
public abstract class Pessoa {
    private int id;          // Encapsulamento: atributos privados
    private String nome;

    // Construtor para instanciação
    public Pessoa(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    // Métodos getters para acesso controlado (Encapsulamento)
    public int getId() { return id; }
    public String getNome() { return nome; }
}