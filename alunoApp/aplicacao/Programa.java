package alunoApp.aplicacao;

import java.util.Scanner;

import alunoApp.entidade.Alunos;

public class Programa {
  
public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.print("Digite o nome do aluno: ");
  
  String nome = sc.nextLine();
  double primeiro, segundo, terceiro;

  //for para ler as notas
  System.out.print("Digite a primeira nota: ");
  primeiro = sc.nextDouble();
  System.out.print("Digite a segunda nota: ");
  segundo = sc.nextDouble();
  System.out.print("Digite a terceira nota: ");
  terceiro = sc.nextDouble();
  
  Alunos aluno = new Alunos(nome, primeiro, segundo, terceiro);
  
  System.out.println(aluno);



  sc.close();
}
}
