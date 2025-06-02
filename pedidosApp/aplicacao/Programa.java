package pedidosApp.aplicacao;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import pedidosApp.entidadeEnums.OrdemStatus;
import pedidosApp.entidades.Cliente;
import pedidosApp.entidades.Pedido;
import pedidosApp.entidades.PedidoItem;
import pedidosApp.entidades.Produto;

public class Programa {
  public static void main(String[] args)  throws Exception  {
    Scanner scanner = new Scanner(System.in);
    
    String nome;
    String email;
    //variavel deve receber uma data no formato dd/MM/yyyy
    String dataNascimentoString;
    //define o formamato esperado  da data
    SimpleDateFormat converteData = new SimpleDateFormat("dd/MM/yyyy");
    
    // 1. Dados do cliente
    System.out.println("Digite seu nome:");
    nome = scanner.nextLine();
    System.out.println("Digite seu email:");
    email = scanner.nextLine();
    System.out.println("Digite sua data de nascimento (dd/MM/yyyy):");
    dataNascimentoString = scanner.nextLine();
    Date dataNascimentoDate = converteData.parse(dataNascimentoString);
    
    // Cria um objeto Cliente com os dados fornecidos
    Cliente cliente = new Cliente(nome, email, dataNascimentoDate);


     
    // 2. Dados do pedido
    System.out.println("Digite o status do pedido (AGUARDANDO_PAGAMENTO, PROCESSANDO, ENVIADO, ENTREGUE):");
    String statusString = scanner.nextLine();
    //Converte a string para o enum OrdemStatus
    OrdemStatus status = OrdemStatus.valueOf(statusString.toUpperCase());
    Date momento = new Date(); // instante atual
    //Cria um objeto Pedido com os dados fornecidos
    Pedido pedido = new Pedido(momento, status, cliente);

   

    // 3. Itens do pedido
    System.out.println("Quantos itens tem o pedido?");
    int n = scanner.nextInt();
    scanner.nextLine(); // consumir quebra de linha

for (int i = 0; i < n; i++) {
    System.out.println("Nome do produto:");
    String nomeProduto = scanner.nextLine();
    System.out.println("Preço do produto:");
    double precoProduto = scanner.nextDouble();
    System.out.println("Quantidade:");
    int quantidade = scanner.nextInt();
    scanner.nextLine(); // consumir quebra de linha

    Produto produto = new Produto(nomeProduto, precoProduto);
    PedidoItem item = new PedidoItem(quantidade, precoProduto, produto);
    pedido.addItem(item);
}

// 4. Mostra o resumo do pedido
System.out.println(pedido);
    scanner.close();
  }
}
