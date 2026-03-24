public class Main {
    public static void main(String[] args) {
        DzialFirmy dzial = new DzialFirmy();
        dzial.wyswietlWszystko();
        dzial.znajdzNajlepeijZarabiajacego();

        Pracownik test = new Pracownik();
        test.setPensja(-100000);

        IO.println("Po wpisaniu błędnej wartości pensja wynosi: " + test.getPensja());
    }
}