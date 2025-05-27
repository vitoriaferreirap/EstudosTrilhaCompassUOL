package atividadesWhile;
import java.util.Scanner;

public class atividade_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //estrutura repetição while
        int x = scanner.nextInt();
        while (x != 2002) {
          System.out.println("Número inválido");
          x= scanner.nextInt();
        }
        scanner.close();
        
        System.out.println("Acesso permitido");
    }
}