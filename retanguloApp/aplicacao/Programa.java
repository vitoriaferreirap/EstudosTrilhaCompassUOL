package retanguloApp.aplicacao;

import java.util.Scanner;

import retanguloApp.entidades.Retangulo;

public class Programa {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);{

    double width = 0.0; //variaveis locais
    double height = 0.0;

    System.out.print("Entre com a largura e altura do retângulo:\n");
    width = sc.nextDouble();
    height = sc.nextDouble();

    /*
   *instanciando objeto (retangulo é o novo objeto da classe Retangulo)passando valores de variavel local, como argumento para classe Retangulo
    *valores serão usados para inicializar os atributos do objeto conforme definido no construtor da classe Retangulo 
    */
    Retangulo retangulo = new Retangulo(width, height);
  
    //chamando o metodo toString da classe Retangulo
    System.out.print(retangulo.toString());

    /*System.out.println(retangulo);
    System.out.println(retangulo.Area()); //chamando metodo
    System.out.println(retangulo.width); //chamando atributo*/

    sc.close();
  }
  }
  
}
