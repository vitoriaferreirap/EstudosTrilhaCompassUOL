package interfacesFuncionais.interfacePredicate.aplicacao;

import java.util.ArrayList;
import java.util.List;

import interfacesFuncionais.interfacePredicate.entidades.Produto;
import interfacesFuncionais.interfacePredicate.util.ProdutoPredicate;

/* apartir de uma lista de produtos, remova da lista somente aquele 
com preço minimo de 100.00 */

public class Programa {
    public static void main(String[] args) {

        List<Produto> lista = new ArrayList<>();

        lista.add(new Produto("TV", 900.00));
        lista.add(new Produto("Mouse", 50.00));
        lista.add(new Produto("Tablet", 350.50));

        // lista.removeIf(p -> p.getSalario() >= 100.00); // expressão lambda

        // excluir apenas quem atende ao predicado
        lista.removeIf(new ProdutoPredicate()); // classe que implementa Predicate

        for (Produto p : lista) {
            System.out.println(p);
        }

    }
}
