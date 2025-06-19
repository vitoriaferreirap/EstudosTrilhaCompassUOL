package intefaceComparable.aplicacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Programa {
    public static void main(String[] args) {
        /*
         * Programa para ler um arquivo contendo nomes de pessoas(nome por linha)
         * armazenalos em uma lista, ordenar essa lista e imprimir os nomes ordenados.
         */
        List<String> lista = new ArrayList<>();
        String path = ("C:\\Users\\Vitoria Ferreira\\Documents\\arquivo.txt");

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String nome = br.readLine();
            while (nome != null) { // enquanto diferente de nulo add nomes
                lista.add(nome);
                nome = br.readLine();
            }

            Collections.sort(lista); // ordena a lista
            for (String s : lista) {
                System.out.println(s); // imprime os nomes ordenados
            }

        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());

        }

    }
}
