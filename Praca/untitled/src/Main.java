import java.util.Scanner;

void main() {
    char czyDalej = ' ';
    Scanner sc = new Scanner(System.in);
    Book ksiazka1 = new Book("kuło wadis", "Henryk Sienkiewicz", 600);
    ksiazka1.zwracajaca();
    do{
        int n = 0;
        IO.print("Podaj obecną stronę: ");
        n = sc.nextInt();
        ksiazka1.czytaj(n);
        ksiazka1.getProgress();
        IO.println("Czy chcesz kontynułować: ");
        czyDalej = sc.next().charAt(0);
    }while (czyDalej == 't');
}