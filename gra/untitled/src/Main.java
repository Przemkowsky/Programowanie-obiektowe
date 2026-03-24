public class Main {
    public static void main(String[] args) {

        // tworzenie kolekcji
        KolekcjaGier kolekcja = new KolekcjaGier();

        // wyświetlanie
        kolekcja.wyswietlWszystko();

        // analiza
        kolekcja.znajdzNajdrozsza();

        // TEST WALIDACJI
        GraWideo test = new GraWideo();
        test.setCena(-50); // błędna wartość
        test.setRokWydania(3000); // błędna wartość
    }
}