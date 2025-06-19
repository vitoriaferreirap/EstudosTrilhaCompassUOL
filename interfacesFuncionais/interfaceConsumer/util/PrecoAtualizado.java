package interfacesFuncionais.interfaceConsumer.util;

import java.util.function.Consumer;

import interfacesFuncionais.interfacePredicate.entidades.Produto;

// Classe que implementa a interface Consumer para atualizar o preço de um produto
public class PrecoAtualizado implements Consumer<Produto> {

    @Override
    public void accept(Produto p) {
        // Atualiza o preço do produto t em 10%
        p.setPreco(p.getPreco() * 1.1);
    }

}
