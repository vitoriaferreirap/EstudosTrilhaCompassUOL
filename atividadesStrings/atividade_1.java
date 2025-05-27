package atividadesStrings;

public class atividade_1 {
  public static void main(String[] args) {
    
    String original = " abcd FGHI jklm abc NOPQ ";
    String s1 = original.toLowerCase();//imprime todas as letras em minúsculo
    String s2 = original.toUpperCase();//imprime todas as letras em maiúsculo
    String s3 = original.trim();//remove os espaços em branco no início e no final da string
    String s4 = original.substring(2);//gera uma nova string a partir do índice 2 (conta espaços em branco)
    String s5 = original.substring(2, 4);//gera uma nova string a partir do índice 2 até o índice 4 (não inclui o índice 4)
    String s6 = original.replace("a", "x");//quando achar uma letra "a", substitui por "x"
    
    //existe diferenças de letra minuscula para maiucula.(ideal tranformar em minuscula)
    int i = original.indexOf("a");//encontra o índice da primeira ocorrência da letra "a"
    int j = original.lastIndexOf("a");//encontra o índice da última ocorrência da letra "a"
    
    
    System.out.println("Original:" + original);
    System.out.println("LowerCase:" + s1);
    System.out.println("UpperCase:" + s2);
    System.out.println("Trim:" + s3);
    System.out.println("Substring(2):" + s4);
    System.err.println("Substring(2,4):" + s5);
    System.out.println("Replace(a,x):" + s6);
    System.out.println("Index of 'a': " + i);
    System.out.println("Last index of 'a': " + j);



    
    }
}
