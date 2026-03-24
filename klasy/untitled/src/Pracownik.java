public class Pracownik {
    private String imie;
    private int wiek;
    private double pensja;
    private boolean czy_w_pracy;

    public Pracownik(){
        this.imie = "Szymon";
        this.wiek = 72;
        this.pensja = 0.33;
        this.czy_w_pracy = true;
    }
    public Pracownik(String imie, int wiek, double pensja, boolean czy_w_pracy){
        this.imie = imie;
        this.wiek = wiek;
        this.pensja = pensja;
        this.czy_w_pracy = czy_w_pracy;
    }
    public String getImie(){
        return imie;
    }
    public void setImie(String imie){
        this.imie = imie;
    }
    public int getWiek(){
        return wiek;
    }
    public void setWiek(int wiek){
        if(wiek<0){
            System.out.println("Wiek nie może być ujemny");
            this.wiek=0;
        } else {
            this.wiek=wiek;
        }
    }
    public double getPensja(){
        return pensja;
    }
    public void setPensja(double pensja) {
        if(pensja<0){
            System.out.println("Pensja nie może byc ujemna");
            this.pensja=0;
        } else {
            this.pensja = pensja;
        }
    }
    public boolean isCzy_w_pracy(){
        return czy_w_pracy;
    }
    public void setCzy_w_pracy(boolean czy_w_pracy){
        this.czy_w_pracy = czy_w_pracy;
    }
    public double rcznaPensja(){
        return pensja * 12;
    }
}
