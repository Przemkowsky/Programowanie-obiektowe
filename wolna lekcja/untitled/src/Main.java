import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        int tablica = createTable(10);
    }
        static int createTable(int rozmiar) {
            int[] tablica = new int[rozmiar];
            for (int i = 0; i < tablica.length; i++) {
                tablica[i] = (int) (Math.random() * 10);
            }
        return tablica[0];
    }
}