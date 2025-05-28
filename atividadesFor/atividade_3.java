package atividadesFor;

import java.util.Scanner;

public class Atividade_3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Quantos casos de teste vai querer:");
    int n = 0;
    n = scanner.nextInt();
    System.out.println("Digite três valores decimais:");
    
    for (int i = 0; i < 3; i++) { //cada loop é uma linha 
      double a = scanner.nextDouble();
      double b = scanner.nextDouble();
      double c = scanner.nextDouble();

      double mediaPonderada = (a * 2 + b * 3 + c * 5) / 10.0;
      System.out.printf("Média ponderada: %.1f%n", mediaPonderada);

      
     
      
    }
    
    scanner.close();
  }
}
