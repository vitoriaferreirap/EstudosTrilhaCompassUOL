package alunoApp.entidade;

public class Alunos {
  public String nome;
  public double primeiro;
  public double segundo;
  public double terceiro;

  public Alunos(String nome, double primeiro, double segundo, double terceiro_) {
    this.nome = nome;
    this.primeiro = primeiro;
    this.segundo = segundo;
    this.terceiro = terceiro_;
  }

 public double valorTotal() {
    double soma = primeiro + segundo + terceiro;
    if (soma >= 60.0) {
        System.out.println("Aprovado");
        return soma;
    } else {
        System.out.println("Reprovado");
        double pontosFaltando = 60.0 - soma;
        System.out.println("Faltam " + pontosFaltando + " pontos para aprovação.");
        return soma;
    }
}

  @Override
  public String toString() {
    return String.format("Nota final = %.2f", valorTotal());
  }
}
