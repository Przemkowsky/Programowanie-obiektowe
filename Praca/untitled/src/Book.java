public class Book {
    private String tytul;
    private String autor;
    private int iloscStron;
    private int obecnaStrona = 0;

    //konstruktor
    public Book (String tytul, String autor, int iloscStron) {
        this.tytul = tytul;
        this.autor = autor;
        this.iloscStron = iloscStron;
    }

    //getter
    public void zwracajaca() {
        IO.println("Tytul: '" + tytul + "' autor: " + autor + " ilosc stron: " + iloscStron + " obecna strona: " + obecnaStrona);
    }

    public void czytaj(int strony) {
        if (strony < 0) {
            IO.println("Błąd");
            return;
        }
        obecnaStrona += strony;
        if (obecnaStrona > iloscStron) {
            IO.println("Nie można przeczytać więcej stron niż ma książka");
            obecnaStrona = iloscStron;
            IO.println("Książka przeczytana!");
            return;
        }
        IO.println("Obecna strona: " + obecnaStrona);
    }

    public void getProgress() {
        double procent = (double) obecnaStrona / iloscStron * 100;
        IO.print("[");
        for (int i = 0; i < 10; i++) {
            if (i < procent/10) {
                IO.print("#");
            }
            else {
                IO.print("-");
            }
        }
        IO.println("] " + (int)procent + "%");
    }
}