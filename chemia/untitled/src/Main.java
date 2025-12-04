import java.util.Scanner;

public class Main {
    static final double AVOGADRO = 6.022e23;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean kontynuuj = true;

        while (kontynuuj) {
            System.out.println("\nWybierz, co chcesz obliczyć:");
            System.out.println("1 - Masę atomową pierwiastka");
            System.out.println("2 - Masę cząsteczkową związku chemicznego");
            System.out.println("3 - Masę molową substancji");
            System.out.println("4 - Stałą Avogadra (liczbę cząstek w molu)");
            System.out.println("5 - Obliczenia stechiometryczne (proste)");
            System.out.print("Twój wybór: ");
            int wybor = scanner.nextInt();

            switch (wybor) {
                case 1 -> {
                    System.out.print("Podaj masę jednego atomu w gramach: ");
                    double masaAtomu = scanner.nextDouble();
                    System.out.println("Masa atomowa: " + masaAtomu + " g");
                }
                case 2 -> {
                    System.out.print("Podaj masę atomową wszystkich atomów w cząsteczce (sumę w g/mol): ");
                    double masaCzasteczki = scanner.nextDouble();
                    System.out.println("Masa cząsteczkowa: " + masaCzasteczki + " g/mol");
                }
                case 3 -> {
                    System.out.print("Podaj masę substancji w gramach: ");
                    double masa = scanner.nextDouble();
                    System.out.print("Podaj liczbę moli: ");
                    double mol = scanner.nextDouble();
                    double molowa = masa / mol;
                    System.out.println("Masa molowa: " + molowa + " g/mol");
                }
                case 4 -> System.out.println("Stała Avogadra: " + AVOGADRO + " cząstek/mol");
                case 5 -> {
                    System.out.print("Podaj liczbę moli substancji A: ");
                    double molA = scanner.nextDouble();
                    System.out.print("Podaj stosunek molowy substancji A do B (np. 2 dla 2A:1B): ");
                    double stosunek = scanner.nextDouble();
                    double molB = molA * stosunek;
                    System.out.println("Liczba moli substancji B: " + molB);
                }
                default -> System.out.println("Nieprawidłowy wybór!");
            }

            System.out.print("\nCzy chcesz kontynuować? (tak=1, nie=0): ");
            int decyzja = scanner.nextInt();
            kontynuuj = decyzja == 1;
        }

        System.out.println("Dziękujemy za skorzystanie z programu!");
        scanner.close();
    }
}
