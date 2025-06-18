package generics.aplicacao;

import java.util.Scanner;

import generics.entidades.ImprimeServico;

public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ImprimeServico<Integer> imprime = new ImprimeServico<>();

        System.out.println("Quantos valores você deseja imprimir?");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            Integer valor = scanner.nextInt();
            imprime.addValor(valor);
        }
        imprime.print();
        // Obtém o primeiro valor da lista
        Integer primeiro = imprime.first();
        System.out.println("Primeiro valor: " + primeiro);

        scanner.close();
    }
}
