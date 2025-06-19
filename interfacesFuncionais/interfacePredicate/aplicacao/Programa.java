package interfacesFuncionais.interfacePredicate.aplicacao;

import java.util.ArrayList;
import java.util.List;

import interfacesFuncionais.interfacePredicate.entidades.Produto;

/* apartir de uma lista de produtos, remova da lista somente aquele 
com preço minimo de 100.00 */

public class Programa {
    public static void main(String[] args) {

        List<Produto> lista = new ArrayList<>();

        lista.add(new Produto("TV", 900.00));
        lista.add(new Produto("Mouse", 50.00));
        lista.add(new Produto("Tablet", 350.50));

        // default method da interface Consumer - percorre a lista e executa a ação
        lista.forEach(null);

    }
}
