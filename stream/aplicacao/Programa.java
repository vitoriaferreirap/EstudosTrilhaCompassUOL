package stream.aplicacao;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Programa {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> stream1 = lista.stream().map(x -> x * 10); // Cria um Stream a partir da lista
        // imprime strem na tela - toArray = converte o stream em um array
        System.out.println(Arrays.toString(stream1.toArray()));

        // Cria um Stream a partir de valores
        Stream<String> stream2 = Stream.of("Maria", "Alex", "Bob"); // Cria um Stream a partir de valores
        System.out.println(Arrays.toString(stream2.toArray()));

        // Cria um Stream interativo
        Stream<Integer> stream3 = Stream.iterate(0, x -> x + 2); // somando doi indefinidamente
        System.out.println(Arrays.toString(stream3.limit(10).toArray())); // limita a 10 elementos

        // Stream sequancia de fibonacci
        Stream<Long> stream4 = Stream.iterate(new Long[] { 0L, 1L }, x -> new Long[] { x[1], x[0] + x[1] })
                .map(x -> x[0]); // pega o primeiro elemento do array - tranforma pares em um elemento
        System.out.println(Arrays.toString(stream4.limit(10).toArray())); // limita a 20 elementos
    }

}