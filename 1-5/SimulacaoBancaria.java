import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {

        double saldo = 0;
        boolean continuar = true;

        Scanner scanner = new Scanner(System.in);

        while (continuar) {

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    int deposito = scanner.nextInt();

                    saldo = saldo + deposito;
                    System.out.println("Saldo atual: "+ saldo);
                    break;
                case 2:
                    int saque = scanner.nextInt();

                    if (saque > saldo) {
                        System.out.println("Saldo insuficiente.");
                    } else if (saque < saldo) {
                        saldo = saldo - saque;
                        System.out.println("Saldo atual: "+ saldo);
                    }
                    break;
                case 3:
                    System.out.println("Saldo atual: "+ saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}