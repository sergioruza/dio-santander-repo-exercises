import java.text.DecimalFormat;
import java.util.Scanner;

public class BancoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
   
        double valorInicial = scanner.nextDouble();
        
     
        double taxaJuros = scanner.nextDouble();
        
        int periodo = scanner.nextInt();
        
        double valorFinal = valorInicial;

        valorFinal = calculoJurosCompostos(valorInicial, taxaJuros, periodo);
 
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("Valor final do investimento: R$ " + df.format(valorFinal));
        
        scanner.close();
    }
    
  public static double calculoJurosCompostos(double valorInicial, double taxaJuros, int periodo) {
    return valorInicial * Math.pow((1 + taxaJuros), periodo);
    }
}
