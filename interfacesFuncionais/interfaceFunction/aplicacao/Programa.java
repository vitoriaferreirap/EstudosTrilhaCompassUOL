package interfacesFuncionais.interfaceFunction.aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import interfacesFuncionais.interfaceFunction.util.LetraMaisculaNome;
import interfacesFuncionais.interfacePredicate.entidades.Produto;

/* Apartir de uma lista de produtos, gere uma nova lista contendo os nomes dos produtos
 * em caixa alta
*/

public class Programa {
    public static void main(String[] args) {

        List<Produto> lista = new ArrayList<>();

        lista.add(new Produto("TV", 900.00));
        lista.add(new Produto("Mouse", 50.00));
        lista.add(new Produto("Tablet", 350.50));

        /*
         * aplicar LETRAMAISCULANOME transforma o nome do produto em caixa alta para
         * toda a
         * lista
         * converter lista para stream (.stream()) e converter stream para lista
         * (.collect())
         */

        // precisa criar uma nova lista de stream para o resultado
        List<String> nomes = lista.stream().map(new LetraMaisculaNome()).collect(Collectors.toList());

        nomes.forEach(System.out::println);
    }
}
