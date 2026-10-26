Java

import java.util.Scanner;

public class Sorveteria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao;
        int quantidade = 0;
        double total, desconto = 0, valorFinal;

        do {
            System.out.println("\n===== SORVETERIA =====");
            System.out.println("1 - Chocolate");
            System.out.println("2 - Morango");
            System.out.println("3 - Baunilha");
            System.out.println("4 - Flocos");
            System.out.println("0 - Fechar pedido");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Chocolate escolhido!");
                    quantidade++;
                    break;
                case 2:
                    System.out.println("Morango escolhido!");
                    quantidade++;
                    break;
                case 3:
                    System.out.println("Baunilha escolhido!");
                    quantidade++;
                    break;
                case 4:
                    System.out.println("Flocos escolhido!");
                    quantidade++;
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida");
            }

        } while (opcao != 0);

        if (quantidade == 0) {
            System.out.println("Obrigado pela preferência!");
        } else {
            total = quantidade * 3.00;

            if (quantidade >= 3) {
                desconto = total * 0.15;
            }

            valorFinal = total - desconto;

            System.out.println("\nQuantidade de bolas: " + quantidade);
            System.out.printf("Valor sem desconto: R$ %.2f%n", total);

            if (desconto > 0) {
                System.out.printf("Desconto (15%%): R$ %.2f%n", desconto);
            }

            System.out.printf("Valor final: R$ %.2f%n", valorFinal);
            System.out.println("Obrigado pela preferência!");
        }

        sc.close();
    }
}