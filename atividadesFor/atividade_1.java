package atividadesFor;

import java.util.Scanner;

public class Atividade_1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    int x = 0;
    x = scanner.nextInt();

    //achando impares de forma crescente com for
    for (int i = 1; i <= x; i++) {
      if (i % 2 != 0) {
        System.out.println(i);
      }
    }

    System.out.println("-----");
    
    //achando impares de forma regressiva com for
    for (int i = x; i >= 1; i--) {
      if (i % 2 != 0) {
    System.out.println(i);
  }
}

    
    scanner.close();

  }
}
