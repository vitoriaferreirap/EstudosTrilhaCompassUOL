package precoProduto.servicos;

import java.util.List;

public class CalculoServico {
    // adaptar metodo para não receber apenas inteiros (METODO GENERICO)
    // METODO TRABALHA COM QUALQUER TIPO T, DESDE QUE T EXTENDA A INTERFACE
    // COMPARABLE T
    public static <T extends Comparable<T>> T max(List<T> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("A lista não pode estar vazia");
        }
        T max = list.get(0); // assume que o primeiro elemento é o maior
        for (T item : list) { // cada elemento da lista é tipo T
            if (item.compareTo(max) > 0) { // compara os elementos usando o método compareTo
                max = item; // atualiza o maior elemento encontrado
            }
        }
        return max; // retorna o maior elemento encontrado

    }
}
