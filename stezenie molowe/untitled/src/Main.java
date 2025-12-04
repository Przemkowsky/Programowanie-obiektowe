import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kalkulator stężenia molowego (C = n / V)");

        System.out.print("Podaj masę substancji w gramach: ");
        double masa = scanner.nextDouble();

        System.out.print("Podaj masę molową substancji w g/mol: ");
        double masaMolowa = scanner.nextDouble();

        System.out.print("Podaj objętość roztworu w dm3: ");
        double objetosc = scanner.nextDouble();

        double liczbaMol = masa / masaMolowa;
        double stezenieMolowe = liczbaMol / objetosc;

        System.out.println("Liczba moli: " + liczbaMol + " mol");
        System.out.println("Stężenie molowe: " + stezenieMolowe + " mol/dm3");

        scanner.close();
    }
}
