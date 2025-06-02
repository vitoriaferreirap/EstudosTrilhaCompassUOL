package atividadeMatriz;

import java.util.Scanner;

public class Programa {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n, m;
    n = scanner.nextInt(); // número de linhas
    m = scanner.nextInt(); // número de colunas
    
    //criando uma matriz
    int[][] matriz = new int[n][m];
    
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        matriz[i][j] = scanner.nextInt(); // preenchendo a matriz
      }
    }
    
    int x = scanner.nextInt(); // valor a ser pesquisado na matriz
    
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        //não é o índice, mas sim o valor armazenado naquela posição da matriz
        if (matriz[i][j] == x) {
          System.out.printf("Posição %d, %d:\n", i, j);
          // Verificando os vizinhos
          if (j > 0) {
            System.out.printf("Esquerda: %d\n", matriz[i][j - 1]);
          }
          if (j < m - 1) {
            System.out.printf("Direita: %d\n", matriz[i][j + 1]);
          }
          if (i < n - 1) {
            System.out.printf("Abaixo: %d\n", matriz[i + 1][j]);
          }
          if (i > 0) {
            System.out.printf("Acima: %d\n", matriz[i - 1][j]);
          }
          
          
        }
      }
      System.out.println("\n");
    }
    scanner.close();
  }
}
