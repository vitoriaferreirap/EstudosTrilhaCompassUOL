package intefaceFuncionalComparator.entidades;

public class Produto {
    private String nome;
    private Double salario;

    public Produto(String nome, Double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return nome + ", " + String.format("%.2f", salario);
    }

}
