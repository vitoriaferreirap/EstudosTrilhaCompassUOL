package files;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Programa1 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Vitoria Ferreira\\Documents\\arquivo.txt");
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
            // verifica se tem linhas no arquivo
            while (scanner.hasNextLine()) {
                System.err.println(scanner.nextLine());

            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}