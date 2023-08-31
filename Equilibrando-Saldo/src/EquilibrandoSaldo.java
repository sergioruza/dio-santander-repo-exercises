import java.util.Scanner;

public class EquilibrandoSaldo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldoAtual = scanner.nextDouble();
        double valorDeposito = scanner.nextDouble();
        double valorRetirada = scanner.nextDouble();

        saldoAtual = depositar(saldoAtual, valorDeposito);
        saldoAtual = saque(saldoAtual, valorRetirada);

        System.out.print("Saldo atualizado na conta: " + saldoAtual);
        scanner.close();
    }

    public static double depositar(double saldoAtual, double valorDeposito) {
      return saldoAtual + valorDeposito;
    }

    public static double saque(double saldoAtual, double valorRetirada) {
      return saldoAtual - valorRetirada;
    }
}