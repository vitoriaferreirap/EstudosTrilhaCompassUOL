package atividadesWhile;

import java.util.Scanner;

public class atividade_3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    int x  = 0;
    x = scanner.nextInt();
    int alcool = 0;
    int gasolina = 0;
    int diesel = 0;

    while (x < 1 || x > 4) {
      x = scanner.nextInt();
    }
   
    while (x != 4) {
      if (x == 1) {
        alcool++;
      } else if (x == 2) {
        gasolina++;
      } else if (x == 3) {
        diesel++;
      }
      x = scanner.nextInt();
    }

    System.out.println("Alcool: " + alcool);
    System.out.println("Gasolina: " + gasolina);
    System.out.println("Diesel: " + diesel);
     
    scanner.close();
  }
}
