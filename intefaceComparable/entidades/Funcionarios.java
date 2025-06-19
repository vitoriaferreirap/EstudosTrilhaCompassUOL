package intefaceComparable.entidades;

public class Funcionarios implements Comparable<Funcionarios> {
    private String nome;
    private Double salario;

    public Funcionarios(String nome, Double salario) {
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
    // compareTo - comparar um objeto com outro
    public int compareTo(Funcionarios outroFuncionario) {
        return salario.compareTo(outroFuncionario.getSalario());
    }
}
