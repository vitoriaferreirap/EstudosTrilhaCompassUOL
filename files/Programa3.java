package files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Programa3 {
    public static void main(String[] args) {
        String[] lines = new String[] { "Criando um novo arquivo" };
        String path = "C:\\Users\\Vitoria Ferreira\\Documents\\arquivoCriadoVSCODE.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            for (String line : lines) {// para cada string contido no lines
                bw.write(line);
                bw.newLine(); // Adiciona uma nova linha após cada string
            }
        } catch (IOException e) {
            e.printStackTrace(); // Imprime a pilha de erros caso ocorra uma exceção
        }

    }

}
