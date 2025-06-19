package interfacesFuncionais.interfaceFunction.util;

import java.util.function.Function;

import interfacesFuncionais.interfacePredicate.entidades.Produto;

// Classe que implementa a interface Consumer para atualizar o preço de um produto
public class LetraMaisculaNome implements Function<Produto, String> {

    @Override
    public String apply(Produto p) {
        return p.getNome().toUpperCase();
    }

}
