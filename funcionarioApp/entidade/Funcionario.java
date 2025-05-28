package funcionarioApp.entidade;

public class Funcionario {
  public String nome;
  public double salarioBruto;
  public double taxa;

  public Funcionario(String nome, double salarioBruto, double taxa) {
    this.nome = nome;
    this.salarioBruto = salarioBruto;
    this.taxa = taxa;
  }

  public double salarioLiquido() {
    return salarioBruto - taxa;
  }

  public void aumentarSalario(double porcentagem) {
    double aumentoBruto = salarioBruto += salarioBruto * (porcentagem / 100.0);
    double aumentoLiquido = salarioBruto -= taxa; // Atualiza o salário bruto subtraindo a taxa
    System.out.println("Update de salário: " + nome + ", Aumento Salário Bruto: R$" + aumentoBruto + ",\nAumento Salário Líquido: R$" + aumentoLiquido);
  }

  @Override
  public String toString() {
    return String.format("Funcionario: %s, Salário: %.2f", nome, salarioLiquido());
    
  }
}


