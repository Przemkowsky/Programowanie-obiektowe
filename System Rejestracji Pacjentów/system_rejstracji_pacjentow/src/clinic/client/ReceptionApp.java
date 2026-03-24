package clinic.client;

import clinic.core.Pacjent;
import clinic.core.Doktor;

public class ReceptionApp {
    public static void main(String[] args){
        Pacjent pacjent = new Pacjent("Przemyslaw", "12345678901");
        Doktor doktor = new Doktor();
        System.out.println(pacjent.getName());//Ponieważ pole jest prywatne
        doktor.diagnoza(pacjent, "1");//ponieważ ma dostęp pakietowy i nie jest widoczna dla clinic.client
    }
}
