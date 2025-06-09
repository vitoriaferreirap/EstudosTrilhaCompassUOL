package hotelApp.aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import hotelApp.model.entidades.Reserva;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);

        // converter as strings de data para o formato Date
        SimpleDateFormat formaDaData = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Digite o número do quarto: ");
        int numeroQuarto = scanner.nextInt();
        System.out.print("Digite a data de check-in (dd/mm/yyyy): ");
        Date checkIn = formaDaData.parse(scanner.next());
        System.out.print("Digite a data de check-out (dd/mm/yyyy): ");
        Date checkOut = formaDaData.parse(scanner.next());

        // 1º validação: verificar se o check-in é posterior à data atual.
        Date agora = new Date(); // data atual
        if (!checkIn.after(agora) || !checkOut.after(agora)) {
            System.out.println("Erro: As datas de check-in e check-out devem ser futuras.");
        } else if (!checkOut.after(checkIn)) {
            System.out.println("Erro: A data de check-out deve ser posterior à data de check-in.");

        } else {
            // instância de Reserva.
            Reserva reserva = new Reserva(numeroQuarto, checkIn, checkOut);
            System.out.println("Reserva criada: " + reserva);

            System.out.println();

            System.out.print("Entre com a data para atualizar a reserva: ");
            System.out.print("Digite a data de check-in (dd/mm/yyyy): ");
            checkIn = formaDaData.parse(scanner.next());
            System.out.print("Digite a data de check-out (dd/mm/yyyy): ");
            checkOut = formaDaData.parse(scanner.next());

            /*
             * 2º validação: atualizar as datas de check-in e check-out. (apenas datas
             * futuras)
             * Delegação para a classe Reserva, que irá verificar se as datas são válidas.
             * Se houver erro, irá retornar uma mensagem de erro, por isso a String erro foi
             * criada.
             * Se não houver erro, irá atualizar as datas e retornar null.
             */
            String erro = reserva.atualizarDatas(checkIn, checkOut);
            if (erro != null) {
                System.out.println("Erro na reserva: " + erro);
            } else {
                System.out.println("Reserva atualizada: " + reserva);

            }

        }

        scanner.close();
    }
}
