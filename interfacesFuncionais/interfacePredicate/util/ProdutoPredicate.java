package interfacesFuncionais.interfacePredicate.util;

import java.util.function.Predicate;

import interfacesFuncionais.interfacePredicate.entidades.Produto;

// Classe que implementa a interface Predicate para filtrar produtos
public class ProdutoPredicate implements Predicate<Produto> {

    @Override
    public boolean test(Produto produto) {
        return produto.getSalario() >= 100.00;
    }

}
