package precoProduto.aplicacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import precoProduto.entidades.Produto;
import precoProduto.servicos.CalculoServico;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        // criando uma lista de produtos
        List<Produto> list = new ArrayList<>();

        String file = "C:\\Users\\Vitoria Ferreira\\Documents\\arquivo.txt";

        // O BufferedReader é usado para ler o conteúdo do arquivo, linha por linha.
        // o FileReader é usado para ler o arquivo como um fluxo de caracteres.

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String linha = br.readLine();// lê a primeira linha do arquivo
            while (linha != null) {
                // ao add na lista é necessario instanciar o objeto Produto, apartir dos dados
                // da linha do arquivo
                if (linha.trim().isEmpty()) {
                    linha = br.readLine();
                    continue; // pula linhas em branco
                }
                String[] fields = linha.split(",");// separa os dados da linha por vírgula e armazena em um array
                list.add(new Produto(fields[0], Double.parseDouble(fields[1]))); // cria um novo objeto Produto e
                                                                                 // adiciona na lista
                linha = br.readLine();
            }
            Produto x = CalculoServico.max(list); // chama o método max da classe CalculoServico para encontrar o
                                                  // produto com o maior preço
            System.out.println("MAX:");
            System.out.println(x); // imprime o produto com o maior preço
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage()); // trata exceções e imprime a mensagem de erro
        }
    }
}