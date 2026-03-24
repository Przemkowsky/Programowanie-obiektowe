public class DzialFirmy {
    private Pracownik[] pracownicy = new Pracownik[5];

    public DzialFirmy(){
        pracownicy[0] = new Pracownik("Janusz", "Kowalski", 5000, 2, false);
        pracownicy[1] = new Pracownik("Jarosław", "Nowacki", 5050.22, 3, false);
        pracownicy[2] = new Pracownik("Filip", "Majonez", 1000, 5, false);
        pracownicy[3] = new Pracownik("Agata", "Fąk", 10, 4, false);
        pracownicy[4] = new Pracownik("Szymon", "Krowa", 7542.25, 2, true);

    }
    public void wyswietlWszystko() {
        for (Pracownik p : pracownicy) {
            IO.println("Imię: " + p.getImie());
            IO.println("Nazwisko: " + p.getNazwisko());
            IO.println("Pensja: " + p.getPensja());
            IO.println("Staż: " + p.getStaz_pracy());
            IO.println("Kierownki: " + p.isCzy_kierownik());
            IO.println("Premia: " + p.obliczPremie());
            IO.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        }
    }
    public void znajdzNajlepeijZarabiajacego() {
        Pracownik max = pracownicy[0];
        for (Pracownik p : pracownicy) {
            if (p.getPensja() > max.getPensja()) {
                max = p;
            }
        }
        IO.println("Najlepiej zarabia: " + max.getImie() + " " + max.getNazwisko() + " (" + max.getPensja() + ")");
    }
}
