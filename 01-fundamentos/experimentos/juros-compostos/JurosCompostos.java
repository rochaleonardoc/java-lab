import java.util.Scanner;

public class JurosCompostos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor inicial: ");
        double valorInicial = Double.valueOf(sc.nextLine());

        System.out.println("Digite a taxa mensal (%): ");
        double taxaInicial = Double.valueOf(sc.nextLine()) / 100;

        System.out.println("Numeros de meses: ");
        int meses = Integer.valueOf(sc.nextLine());

        double montanteFinal = valorInicial * Math.pow((1 + taxaInicial),meses);
        double juros = montanteFinal - valorInicial;
    

        System.out.printf("Montante final: R$ %.2f%n", montanteFinal);
        System.out.printf("Juros: R$ %.2f%n", juros);

        sc.close();
    }
}
