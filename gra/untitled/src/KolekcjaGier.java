public class KolekcjaGier {
    private GraWideo[] gry;

    // konstruktor
    public KolekcjaGier() {
        gry = new GraWideo[5];

        gry[0] = new GraWideo("Wiedzmin 3", 2015, 120, false);
        gry[1] = new GraWideo("Cyberpunk 2077", 2020, 200, false);
        gry[2] = new GraWideo("Minecraft", 2011, 100, true);
        gry[3] = new GraWideo("FIFA 23", 2022, 250, true);
        gry[4] = new GraWideo("GTA V", 2013, 150, true);
    }

    // wyświetlanie wszystkich gier
    public void wyswietlWszystko() {
        for (GraWideo g : gry) {
            System.out.println("Tytuł: " + g.getTytul());
            System.out.println("Rok wydania: " + g.getRokWydania());
            System.out.println("Cena: " + g.getCena());
            System.out.println("Multiplayer: " + g.isCzyMultiplayer());
            System.out.println("----------------------");
        }
    }

    // metoda analityczna – najdroższa gra
    public void znajdzNajdrozsza() {
        double max = gry[0].getCena();
        String tytul = gry[0].getTytul();

        for (GraWideo g : gry) {
            if (g.getCena() > max) {
                max = g.getCena();
                tytul = g.getTytul();
            }
        }

        System.out.println("Najdroższa gra: " + tytul + " - " + max + " zł");
    }
}