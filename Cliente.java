package Trabalho_OO;
// Classe Cliente
public class Cliente extends Pessoa { // Herança: Cliente é uma especialização de Pessoa
    private String email; // Encapsulamento: atributo privado

    // Construtor utilizando super para a classe base (Herança)
    public Cliente(int id, String nome, String email) {
        super(id, nome);
        this.email = email;
    }

    // Getter para acesso ao atributo encapsulado
    public String getEmail() { return email; }
}
