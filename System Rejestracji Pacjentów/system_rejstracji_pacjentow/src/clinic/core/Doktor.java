package clinic.core;

public class Doktor {
public void diagnoza(Pacjent pacjent, String kod) {
    pacjent.setKodChoroby(kod);
    System.out.println("Przypisano kod choroby: " + kod);
}
}
