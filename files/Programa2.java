package files;

import java.io.BufferedReader;
import java.io.FileReader;

public class Programa2 {
    public static void main(String[] args) {

        String path = "C:\\Users\\Vitoria Ferreira\\Documents\\arquivo.txt";

        // garante que os resursos sejam fechados após o uso
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            // bufferedReader para ler o arquivo mais rápido
            // FileReader para ler o arquivo
            String line = br.readLine(); // lê a primeira linha do arquivo
            while (line != null) { // enquanto a linha não for nula
                System.out.println(line); // imprime a linha
                line = br.readLine(); // lê a próxima linha
            }
        } catch (Exception e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
