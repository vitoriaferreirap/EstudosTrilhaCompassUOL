package atividadesWhile;

import java.util.Scanner;

public class atividade_2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int x = 0;
    int y = 0;
    
    x = scanner.nextInt();
    y = scanner.nextInt();

    while (x !=0 && y !=0) {
      if(x > 0 && y > 0) {
      System.out.println("primeiro");
      }else if(x > 0 && y < 0){
      System.out.println("quarto");
      }else if(x < 0 && y < 0){
      System.out.println("terceiro");
    } else if (x < 0 && y > 0) {
      System.out.println("segundo");
    }

      x = scanner.nextInt();
      y = scanner.nextInt();
      }
    scanner.close();
  }
  
}
