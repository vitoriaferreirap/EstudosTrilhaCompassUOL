import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import inteface.entidades.Contrato;
import inteface.entidades.Parcelamento;
import inteface.servicos.ContratoServico;
import inteface.servicos.PaypalServico;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        // padão ISO
        DateTimeFormatter formaData = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre com os dados do contrato: ");
        System.out.print("Número: ");
        int numero = scanner.nextInt();
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate data = LocalDate.parse(scanner.next(), formaData);
        System.out.print("Valor total do contrato: ");
        double totalValor = scanner.nextDouble();

        // Criação do objeto Contrato
        Contrato contrato = new Contrato(numero, data, totalValor);

        System.out.print("Entre com o número de parcelas: ");
        int numeroParcelas = scanner.nextInt();

        // instanciar e conectar com serviços
        ContratoServico contratoServico = new ContratoServico(new PaypalServico());
        // processar o contrato
        contratoServico.processarContrato(contrato, numeroParcelas);

        System.out.println("Parcelas:");

        // usar for-each para percorrer a lista de parcelamentos do contrato
        for (Parcelamento parcelamento : contrato.getParcelamentos()) {
            System.out.println(parcelamento);
        }

        scanner.close();

    }
}