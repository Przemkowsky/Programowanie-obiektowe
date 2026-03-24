public class Pracownik {
    private String imie;
    private String nazwisko;
    private double pensja;
    private int staz_pracy;
    private boolean czy_kierownik;

    Pracownik() {
        this.imie = "Jan";
        this.nazwisko = "Szymczyk";
        this.pensja = 1000.21;
        this.staz_pracy = 2;
        this.czy_kierownik = false;
    }
    public Pracownik(String imie, String nazwisko, double pensja, int staz_pracy, boolean czy_kierownik) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pensja = pensja;
        this.staz_pracy = staz_pracy;
        this.czy_kierownik = czy_kierownik;
    }
    public String getImie(){
        return imie;
    }
    public void setImie(String imie) {
        this.imie = imie;
    }
    public String getNazwisko() {
        return nazwisko;
    }
    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
    public double getPensja(){
        return pensja;
    }
    public void setPensja(double pensja){
        if (pensja<0){
            IO.println("Pensja nie może być ujemna");
            this.pensja = 2000;
        } else {
            this.pensja = pensja;
        }
    }
    public  int getStaz_pracy(){
        return staz_pracy;
    }
    public void setStaz_pracy(int staz_pracy) {
        this.staz_pracy = staz_pracy;
    }
    public boolean isCzy_kierownik(){
        return czy_kierownik;
    }
    public void setCzy_kierownik(boolean czy_kierownik){
        this.czy_kierownik = czy_kierownik;
    }
    public double obliczPremie() {
        return pensja * 0.1 * staz_pracy;
    }
}
