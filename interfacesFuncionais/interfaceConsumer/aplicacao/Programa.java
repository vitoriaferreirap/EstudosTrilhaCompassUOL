package interfacesFuncionais.interfaceConsumer.aplicacao;

import java.util.ArrayList;
import java.util.List;

import interfacesFuncionais.interfaceConsumer.util.PrecoAtualizado;
import interfacesFuncionais.interfacePredicate.entidades.Produto;

/* apartir de uma lista de produtos, atualize o valor do produto*/

public class Programa {
    public static void main(String[] args) {

        List<Produto> lista = new ArrayList<>();

        lista.add(new Produto("TV", 900.00));
        lista.add(new Produto("Mouse", 50.00));
        lista.add(new Produto("Tablet", 350.50));

        // default method da interface Consumer - percorre a lista e executa a ação
        // atualiza cada elemento da lista aplicando o consumer PrecoAtualizado
        lista.forEach(new PrecoAtualizado());

        // (::) para cada elemento da lista, chame System.out.println(elemento).
        lista.forEach(System.out::println); // referência de método para imprimir os produtos
    }
}
