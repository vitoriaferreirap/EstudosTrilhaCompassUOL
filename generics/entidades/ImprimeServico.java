package generics.entidades;

import java.util.ArrayList;
import java.util.List;

//classe parametrizada do tipo T, que pode ser qualquer tipo de dado
public class ImprimeServico<T> {// classe genérica do tipo T qualquer
    private List<T> list = new ArrayList<>();

    public void addValor(T valor) {
        list.add(valor);
    }

    // retorna primeiro elemento da lista
    public T first() {
        if (list.isEmpty()) {
            throw new IllegalStateException("A lista está vazia.");
        }
        return list.get(0);
    }

    // imprime todos os elementos da lista
    public void print() {
        if (!list.isEmpty()) {
            System.out.println(list.get(0));
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(", " + list.get(i));
        }
    }

}
