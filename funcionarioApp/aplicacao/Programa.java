package funcionarioApp.aplicacao;

import java.util.Scanner;

import funcionarioApp.entidade.Funcionario;

public class Programa {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String nome = "";
    double salarioBruto = 0.0;
    double taxa = 0.0;
    
    System.out.println("Dados funcionario:");
    System.out.println("Nome: ");
    nome = scanner.nextLine();
    System.out.println("Salario bruto: ");
    salarioBruto = scanner.nextDouble();
    System.out.println("Taxa: ");
    taxa = scanner.nextDouble();
    

    Funcionario funcionario = new Funcionario(nome, salarioBruto, taxa);
    System.out.println(funcionario);//mostra salario liquido

    System.out.println("Qual a porcentagem to aumento salárial?");
    double porcentagem = scanner.nextDouble();
    funcionario.aumentarSalario(porcentagem); // passando a porcentagem de aumento que o usuario digitou para o metodo direto


    scanner.close();
  }
}
