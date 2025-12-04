import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Zapytaj użytkownika ile liczb chce wprowadzić
        System.out.print("Ile liczb chcesz wprowadzić? ");
        int n = scanner.nextInt();




        // 2. Utwórz tablicę na liczby
        int[] liczby = new int[n];




        // 3. Wczytaj liczby do tablicy (użyj pętli for)
        System.out.println("Podaj " + n + " liczb:");
        for (int i = 0; i < n; i++){
            System.out.println("Podaj liczbe: ");
            liczby[i] = scanner.nextInt();
        }
        // TODO: wczytaj kolejne liczby do tablicy





        // 4. Wypisz wszystkie liczby na ekranie
        System.out.println("Wprowadzone liczby:");
        for (int i = 0; i < n; i++) {
            System.out.println(liczby[i]);
        }
        // TODO: wypisz wszystkie liczby z tablicy





        // 5. Oblicz sumę i średnią
        int suma = 0;

        // TODO: oblicz sumę wszystkich elementów tablicy
        double srednia = 0; // TODO: oblicz średnią

        for(int i = 0; i < n; i++) {
            suma += liczby[i];
        }
        srednia = suma / n;
        System.out.println("Suma = " + suma);
        System.out.println("Średnia = " + srednia);





        // 6. Znajdź największą i najmniejszą liczbę
        int max = liczby[0];
        int min = liczby[0];
        for (int i = 1; i < n; i++) {
            if (liczby[i]<liczby[i-1]) {
                min = liczby[i];
            }
            if (liczby[i] > min) {
                max = liczby[i];
            }
        }

        System.out.println("Największa liczba = " + max);
        System.out.println("Najmniejsza liczba = " + min);




        // 7. Policz ile liczb jest parzystych i nieparzystych
        int parzyste = 0;
        int nieparzyste = 0;
        for(int i = 0; i < n; i++){
            if(liczby[i] % 2==0){
                parzyste++;
            }
            else{
                nieparzyste++;
            }
        }


        System.out.println("Parzyste: " + parzyste);
        System.out.println("Nieparzyste: " + nieparzyste);





        // 8. Policz ile liczb jest większych od średniej
        int wiekszeOdSredniej = 0;
        for(int i = 0; i < n; i++){
            if(liczby[i] > srednia){
                wiekszeOdSredniej++;
            }
        }
        // TODO: policz ile liczb jest większych od średniej

        System.out.println("Liczb większych od średniej: " + wiekszeOdSredniej);

// 9. Posortuj tablicę rosnąco i wypisz wynik

        sortowanie_bombalkoe(liczby, n);
        System.out.println("Sortowanie ");
        for (int i = 0; i < n; i++){
            System.out.println(liczby[i]);
        }

        static void sortowanie_bombalkoe(int liczby[], int n){
            int pomocnicze;
            for (int i = 0; i < n-i-1; i++)
        }


        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (liczby[j] > liczby[j + 1]) {
                    int pomocnicza = liczby[j];
                    liczby[j] = liczby[j + 1];
                    liczby[j + 1] = pomocnicza;
                }
            }
        }
        // TODO: sortowanie bąbelkowe
    }
}