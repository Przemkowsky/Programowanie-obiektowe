import java.util.Random;
import java.util.Arrays;

public static class Main {

    public static void main(String[] args) {
        // 1. Generujemy oceny dla 10 uczniów (zakres 1-6)
        int[] oceny = generujOceny(10);

        System.out.println("--- Dziennik Lekcyjny ---");

        // 2. Wyświetlamy wszystkie oceny
        wyswietlOceny(oceny);

        // 3. Obliczamy średnią
        //double srednia = obliczSrednia(oceny);
        //System.out.println("Średnia klasy: " + srednia);

        // 4. Szukamy najwyższej oceny
        //int max = znajdzNajwyzsza(oceny);
        //System.out.println("Najwyższa ocena: " + max);

        // 5. Sprawdzamy liczbę zagrożeń (ocen niedostatecznych - 1)
        //int zagrozenia = zliczZagrozenia(oceny);
        //System.out.println("Liczba zagrożeń: " + zagrozenia);

        // 6. (Dla ambitnych) Wyświetl podsumowanie słowne
        //podsumujWyniki(srednia, zagrozenia);
    }

    // --- MIEJSCE NA WASZE METODY ---

}
    public static int[] generujOceny(int n) {
        int[] oceny =new int[n];
        Random rand = new Random();
        for (int i=0;i<n;i++){
            int ocena = rand.nextInt(6) + 1;
            oceny[i]=ocena;
    }
    return oceny;
    }
    public static void wyswietlOceny(int[] tab) {
        System.out.print(Arrays.toString(tab));

    }
}