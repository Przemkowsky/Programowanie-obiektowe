import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Witaj w grze Zgadywanka Liczb!");
        System.out.println("Spróbuj odgadnąć liczbę od 1 do 100.");

        int liczba = random.nextInt(100) + 1;
        int proby = 0;
        int strzal = 0;

        while (strzal != liczba) {
            System.out.print("Podaj liczbę: ");
            strzal = scanner.nextInt();
            proby++;

            if (strzal < liczba) {
                System.out.println("Więcej!");
            } else if (strzal > liczba) {
                System.out.println("Mniej!");
            } else {
                System.out.println("Gratulacje! Odgadłeś liczbę w " + proby + " próbach!");
            }
        }

        scanner.close();
    }
}
