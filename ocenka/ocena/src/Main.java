import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // 1. Generujemy oceny dla 10 uczniów (zakres 1-6)
        int[] oceny = generujOceny(10);

        System.out.println("--- Dziennik Lekcyjny ---");

        // 2. Wyświetlamy wszystkie oceny
        wyswietlOceny(oceny);

        // 3. Obliczamy średnią
        double srednia = obliczSrednia(oceny);
        System.out.println("Średnia klasy: " + srednia);

        // 4. Szukamy najwyższej oceny
        int max = znajdzNajwyzsza(oceny);
        System.out.println("Najwyższa ocena: " + max);

        // 5. Sprawdzamy liczbę zagrożeń (ocen niedostatecznych - 1)
        int zagrozenia = zliczZagrozenia(oceny);
        System.out.println("Liczba zagrożeń: " + zagrozenia);

        // 6. (Dla ambitnych) Wyświetl podsumowanie słowne
        podsumujWyniki(srednia, zagrozenia);


        zmienOceny(oceny, 1, 2);
    }

    // --- MIEJSCE NA WASZE METODY ---

    public static int[] generujOceny(int n){
        int[] oceny = new int[n];
        Random rand = new Random();
        for(int i=0; i<n; i++){
            int ocena = rand.nextInt(6) + 1;
            oceny[i] = ocena;
        }
        return oceny;
    }

    public static void wyswietlOceny(int[] tab){
        System.out.println(Arrays.toString(tab));
    }

    public static double obliczSrednia(int[] tab){
        int sume = 0;
        int ile = tab.length;
        for(int i=0; i<tab.length; i++){
            sume += tab[i];
        }
        double srednia = (double) sume / ile;
        return srednia;
    }

    public static int znajdzNajwyzsza(int[] tab){
        int max = 0;
        for(int i=0; i< tab.length; i++){
            if(max < tab[i]){
                max = tab[i];
            }
        }
        return max;
    }

    public static int zliczZagrozenia(int[] tab){
        int zagrozenie = 0;
        for(int i=0; i< tab.length; i++){
            if(tab[i] == 1){
                zagrozenie++;
            }
        }
        return zagrozenie;
    }

    public static void podsumujWyniki(double srednia, int zagrozenia){
        if(srednia > 4.0 && zagrozenia ==0){
            System.out.println("Wynik: Klasa bardzo dobra ");
        }
        else if (zagrozenia > 3) {
            System.out.println("Wynik: Klasa wymaga uwagi ");
        }
        else {
            System.out.println("Wynik: Klasa przeciętna");
        }
    }

    public static void zmienOceny(int[] tab, int stare, int nowe){
        for(int i=0; i< tab.length; i++){
            if(tab[i] == stare){
                tab[i] = nowe;
            }
        }
        //zadaie dla ambinych
        System.out.println("Poprawione oceny: " + Arrays.toString(tab));
    }
}