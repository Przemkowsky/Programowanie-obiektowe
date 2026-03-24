package clinic.core;

public class Pacjent {

    private String name;
    private String pesel;
    private String kodChoroby;
    public Pacjent(String name, String pesel) {
        this.name = name;
        this.pesel = pesel;
        this.kodChoroby = "";
    }
    public String getName() {
        return name;
    }
    void setKodChoroby(String code) {
        this.kodChoroby = code;
    }
}

