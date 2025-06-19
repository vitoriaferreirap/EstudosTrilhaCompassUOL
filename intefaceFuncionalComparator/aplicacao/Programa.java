package intefaceFuncionalComparator.aplicacao;

import java.util.ArrayList;
import java.util.List;

import intefaceFuncionalComparator.entidades.Produto;

public class Programa {
    public static void main(String[] args) {

        List<Produto> lista = new ArrayList<>();

        lista.add(new Produto("TV", 900.00));
        lista.add(new Produto("Mouse", 50.00));
        lista.add(new Produto("Tablet", 350.50));

        // chama o sort da lista passando a classe MyComparator
        lista.sort(new MyComparator()); // ordena a lista

        for (Produto p : lista) {
            System.out.println(p);
        }
    }
}
