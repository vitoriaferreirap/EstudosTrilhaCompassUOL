package Set.aplicacao;

import java.util.HashSet;
import java.util.Set;

public class Programa {
    public static void main(String[] args) {

        Set<String> conjunto = new HashSet<>();// não garante ordem

        conjunto.add("TV");
        conjunto.add("Celular");
        conjunto.add("Notebook");
        // retorna true se o elemento estiver no conjunto
        System.out.println(conjunto.contains("Notebook"));

        conjunto.remove("TV");
        // x talque algo
        conjunto.removeIf(x -> x.charAt(0) == 'C'); // remove todos os elementos que começam com 'C'

        for (String produto : conjunto) {
            System.out.println(produto);
        }

    }
}
