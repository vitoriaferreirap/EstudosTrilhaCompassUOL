package atividadesFor;

import java.util.Scanner;

public class Atividade_2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = 0;
    n = scanner.nextInt();

    for (int i = 1; i <= n; i++) {
      int j = n - i + 1;
      System.out.println(i + "-" + j);
      
    }
    
    scanner.close();  
  }
}
