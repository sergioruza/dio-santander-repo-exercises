import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BancoOrganizadorAtivos {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> ativos = new ArrayList<>();

    int quantidadeAtivos = scanner.nextInt();
    scanner.nextLine();

    for (int i = 0; i < quantidadeAtivos; i++) {
      String codigoAtivo = scanner.nextLine();
      ativos.add(codigoAtivo);
    }

    sortAtivos(ativos);
    System.out.print(String.join("\n", ativos));
    scanner.close();
  }

  public static void sortAtivos(ArrayList<String> ativos) {
    Collections.sort(ativos);
  }
}