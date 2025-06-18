package Set.aplicacao;

import java.util.Set;
import java.util.TreeSet;

public class Programa1 {
    public static void main(String[] args) {

        Set<String> conjunto = new TreeSet<>();// ordem alfabética

        conjunto.add("Tv");
        conjunto.add("Tablet");
        conjunto.add("Notebook");

        // retorna true se o elemento estiver no conjunto
        System.out.println(conjunto.contains("Notebook"));

        for (String produto : conjunto) {
            System.out.println(produto);
        }

    }
}
