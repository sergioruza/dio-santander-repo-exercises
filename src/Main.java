import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int saldoTotal = scanner.nextInt();
    int valorSaque = scanner.nextInt();

    if (valorSaque <= saldoTotal) {
      saldoTotal = sacar(saldoTotal, valorSaque);
      System.out.println("Saque realizado com sucesso. Novo saldo: " + saldoTotal);
    } else {
      System.out.println("Saldo insuficiente. Saque nao realizado!");
    }

    scanner.close();
  }

  public static int sacar(int saldoTotal, int valorSaque) {
    return saldoTotal - valorSaque;
  }
}