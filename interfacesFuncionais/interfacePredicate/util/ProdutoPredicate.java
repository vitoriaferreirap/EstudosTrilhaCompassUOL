package interfacesFuncionais.interfacePredicate.util;

import java.util.function.Consumer;

import interfacesFuncionais.interfacePredicate.entidades.Produto;

// Classe que implementa a interface Consumer para atualizar o preço de um produto
public class ProdutoPredicate implements Consumer<Produto> {

    @Override
    public void accept(Produto p) {
        // Atualiza o preço do produto t em 10%
        p.setPreco(p.getPreco() * 1.10);
        // Imprime o produto atualizado
        System.out.println(p);
    }

}
