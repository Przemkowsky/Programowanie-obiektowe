public class GraWideo {
    // pola (private!)
    private String tytul;
    private int rokWydania;
    private double cena;
    private boolean czyMultiplayer;

    // konstruktor domyślny
    public GraWideo() {
        this.tytul = "Nieznana gra";
        this.rokWydania = 2000;
        this.cena = 100.0;
        this.czyMultiplayer = false;
    }

    // konstruktor parametryczny
    public GraWideo(String tytul, int rokWydania, double cena, boolean czyMultiplayer) {
        this.tytul = tytul;
        this.rokWydania = rokWydania;
        this.cena = cena;
        this.czyMultiplayer = czyMultiplayer;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public int getRokWydania() {
        return rokWydania;
    }

    public void setRokWydania(int rokWydania) {
        if (rokWydania > 2026) {
            System.out.println("Błąd: rok wydania nie może być z przyszłości!");
            this.rokWydania = 2000;
        } else {
            this.rokWydania = rokWydania;
        }
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        if (cena < 0) {
            System.out.println("Błąd: cena nie może być ujemna!");
            this.cena = 0;
        } else {
            this.cena = cena;
        }
    }

    public boolean isCzyMultiplayer() {
        return czyMultiplayer;
    }

    public void setCzyMultiplayer(boolean czyMultiplayer) {
        this.czyMultiplayer = czyMultiplayer;
    }
    public double cenaZRabatem() {
        return cena * 0.9;
    }
}