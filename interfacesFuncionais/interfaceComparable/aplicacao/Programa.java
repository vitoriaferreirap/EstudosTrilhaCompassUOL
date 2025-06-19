package interfacesFuncionais.interfaceComparable.aplicacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import interfacesFuncionais.interfaceComparable.entidades.Funcionarios;

public class Programa {
    public static void main(String[] args) {
        /*
         * Ler arquivo contendo funcionarios(nome e salarios) no formato .cvs(separado
         * por vírgula) e imprimir os nomes ordenados alfabeticamente.
         */
        List<Funcionarios> lista = new ArrayList<>();
        String path = ("C:\\Users\\Vitoria Ferreira\\Documents\\arquivo.txt");

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String funcionarioCsv = br.readLine();
            while (funcionarioCsv != null) { // enquanto diferente de nulo add nomes

                String[] campos = funcionarioCsv.split(","); // separa os campos por vírgula
                lista.add(new Funcionarios(campos[0], Double.parseDouble(campos[1])));
                funcionarioCsv = br.readLine();
            }

            Collections.sort(lista); // ordena a lista
            for (Funcionarios f : lista) {
                System.out.println(f.getNome() + ", " + f.getSalario());
            }

        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());

        }

    }
}
