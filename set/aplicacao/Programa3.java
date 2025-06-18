package Set.aplicacao;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Programa3 {
    public static void main(String[] args) {

        /*
         * operações com SET
         * criando um objeto do tipo TreeSet que implementa a interface Set, que ira
         * armazenar elementos do tipo Integer
         */
        Set<Integer> a = new TreeSet<>(Arrays.asList(0, 1, 2, 3, 4, 5));
        Set<Integer> b = new TreeSet<>(Arrays.asList(3, 4, 5, 6, 7, 8));

        // UNIÃO
        Set<Integer> c = new TreeSet<>(a);
        c.addAll(b);
        System.out.println("União: " + c);

        // INTERSECÇÃO
        Set<Integer> d = new TreeSet<>(a); // copia do conjunto a
        d.retainAll(b); // retém apenas os elementos que estão em ambos os conjuntos
        System.out.println("Interseção: " + d);

        // DIFERENÇA
        Set<Integer> e = new TreeSet<>(a); // copia do conjunto a
        e.removeAll(b); // remove todos os elementos do conjunto b do conjunto a
        System.out.println("Diferença: " + e);
    }
}
