package atividadesFuncoes;

import java.util.Scanner;

public class Atividade_1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite três numeros");
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();

    //atribuindo o retorno da função a uma variavel
    int valorFuncao = maior(a, b, c);
    abrirFuncao(valorFuncao);

    scanner.close();
  }

  //disponivel em outras classes(public) / função pode ser chamada sem ser obketo (static)
  public static int maior(int x, int y, int z) { // parametros da função
    if (x > y && x > z) {
      return x;
    } else if (y > x && y > z) {
      return y;
    } else {
      return z;
    }
  }

  //não tem retorno, apenas ação
  public static void abrirFuncao(int valor){
    System.out.println("O maior valor é: " + valor);
    
}
}