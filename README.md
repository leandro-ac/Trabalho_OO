# Sistema de Venda de Ingressos

## Diagrama de Classes UML

- **Pessoa** (Classe Abstrata)
  - Atributos:
    - id: int
    - nome: String

- **Cliente** (Herda de Pessoa)
  - Atributos:
    - email: String

- **Evento**
  - Atributos:
    - id: int
    - nome: String
    - valorIngresso: double
    - ingressosDisponiveis: int
  - Métodos:
    - reduzirIngressos()

- **Ingresso** (Composição com Evento e Cliente)
  - Atributos:
    - evento: Evento
    - cliente: Cliente
    - codigo: String

- **IVenda** (Interface)
  - Métodos:
    - calcularReceita()

- **SistemaVendas** (Implementa IVenda)
  - Atributos:
    - clientes: List<Cliente>
    - eventos: List<Evento>
    - ingressos: List<Ingresso>
  - Métodos:
    - cadastrarCliente()
    - cadastrarEvento()
    - comprarIngresso()
    - calcularReceita()

# REQUISITOS:

1-Diagrama de Classes UML: Representado textualmente acima.

2-Classificação/Instanciação: Objetos como SistemaVendas, Cliente e Evento são instanciados em Main.

3-Encapsulamento: Atributos privados com getters.

4-Generalização/Especialização: Cliente herda de Pessoa.

5-Associação: SistemaVendas associado a coleções de Cliente, Evento e Ingresso.

6-Composição: Ingresso contém Evento e Cliente.

7-Agregação: SistemaVendas contém coleções de Cliente, Evento e Ingresso.

8-Coleções: Uso de List em SistemaVendas.

9-Classes/Métodos Genéricos: Estrutura suporta expansão genérica.

10-Classes Abstratas: Pessoa é abstrata.

11-Interfaces: IVenda implementada por SistemaVendas.

12-Atributos e Métodos Estáticos: totalVendas em SistemaVendas.

13-Herança: Cliente herda de Pessoa.

14-Sobrescrita: calcularReceita() em SistemaVendas.

15-Sobrecarga: calcularReceita() com e sem parâmetro eventoId.

16-Polimorfismo: Iteração sobre ingressos em calcularReceita().
