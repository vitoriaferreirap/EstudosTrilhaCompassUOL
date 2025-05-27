package atividadesStrings;

public class atividade_2 {
  public static void main(String[] args) {
    //operação split  
    String frase = "Hoje é um dia lindo";
    String[] vetPalavras = frase.split(" ");//divide a string em palavras, usando o espaço como delimitador
    String p1 = vetPalavras[0];
    String p2 = vetPalavras[1];
    String p3 = vetPalavras[2];
    String p4 = vetPalavras[3];
    String p5 = vetPalavras[4];

    System.out.println(p1);
    System.out.println(p2);
    System.out.println(p3);
    System.out.println(p4);
    System.out.println(p5);


    
  }
}
