package intefaceFuncionalComparator.aplicacao;

import java.util.Comparator;

import intefaceFuncionalComparator.entidades.Produto;

//classe que implementa a interface Comparator para ordenar objetos do tipo Produto
public class MyComparator implements Comparator<Produto> {

    @Override
    // retorna int pois : negativo = p1 < p2, zero = p1 == p2, positivo = p1 > p2
    public int compare(Produto p1, Produto p2) {
        return p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase());
    }

}
