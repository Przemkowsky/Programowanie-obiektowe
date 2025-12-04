import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // zadanie 1
        int[] liczby = {2, 5, 8, 3, 7};

        int suma = 0;


        for (int liczba : liczby) {
            suma += liczba;
        }

        System.out.println("Suma elementów tablicy wynosi: " + suma);

        //zadanie 2

        int[] tablica = {12,45,3,27,19};
        int i = 0;
        int max = tablica[0];

        while (i < tablica.length) {
            if (tablica[i] > max) {
                max = tablica[i];
            }
            i++;
        }

        System.out.println("Największy element w tablicy to: " + max);

        // zadanie 3

        int liczbay;
        int dodatnie = 0;

        do {
            System.out.println("Podaj liczbę całkowitą: ");
            liczbay = scanner.nextInt();

            if (liczbay > 0) {
                dodatnie++;
            }

        }while (liczbay != 0);
        System.out.println("Liczb dodatnich jest: " + dodatnie);


    }
}