package hotelApp.aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import hotelApp.model.entidades.Reserva;
import hotelApp.model.exception.DominioException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            // converter as strings de data para o formato Date
            SimpleDateFormat formaDaData = new SimpleDateFormat("dd/MM/yyyy");

            System.out.print("Digite o número do quarto: ");
            int numeroQuarto = scanner.nextInt();
            System.out.print("Digite a data de check-in (dd/mm/yyyy): ");
            Date checkIn = formaDaData.parse(scanner.next());
            System.out.print("Digite a data de check-out (dd/mm/yyyy): ");
            Date checkOut = formaDaData.parse(scanner.next());

            // instância de Reserva.
            Reserva reserva = new Reserva(numeroQuarto, checkIn, checkOut);
            System.out.println("Reserva criada: " + reserva);

            System.out.println();

            System.out.print("Entre com a data para atualizar a reserva: ");
            System.out.print("Digite a data de check-in (dd/mm/yyyy): ");
            checkIn = formaDaData.parse(scanner.next());
            System.out.print("Digite a data de check-out (dd/mm/yyyy): ");
            checkOut = formaDaData.parse(scanner.next());

            // antes retornava uma string com uma mensagem e erro, agora ira retornar uma
            // exceção
            reserva.atualizarDatas(checkIn, checkOut);
            System.out.println("Reserva atualizada: " + reserva);

        }
        // trata exceção
        catch (ParseException e) {
            System.out.println("Erro: Formato de data inválido. Use dd/mm/yyyy.");
        } catch (DominioException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        // qualquer outra exceção que não seja ParseException ou DominioException
        catch (RuntimeException e) {
            System.out.println("Erro inesperado: ");
        }
        scanner.close();
    }
}