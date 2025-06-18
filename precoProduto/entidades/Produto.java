package precoProduto.entidades;

public class Produto implements Comparable<Produto> { // Implementa a interface Comparable para permitir comparação
                                                      // entre objetos Produto
    private String nome;
    private Double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return String.format("Produto: %s, Preço: %.2f", nome, preco); // Formata a string de saída do produto
    }

    @Override
    public int compareTo(Produto outroProduto) {
        return preco.compareTo(outroProduto.getPreco()); // Compara o preço do produto atual com o preço do outro
                                                         // produto
    }
}
