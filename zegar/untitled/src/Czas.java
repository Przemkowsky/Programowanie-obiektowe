public class Czas {

    private int godziny;
    private int minuty;

    public Czas(int godziny, int minuty) {
        if (godziny < 0 || godziny > 23 || minuty < 0 || minuty > 59) {
            this.godziny = 0;
            this.minuty = 0;
        } else {
            this.godziny = godziny;
            this.minuty = minuty;
        }
    }

    public String toString() {
        return String.format("%02d:%02d", godziny, minuty);
    }

    public void dodajMinuty(int m) {
        int totalMinutes = godziny * 60 + minuty + m;
        totalMinutes = ((totalMinutes % 1440) + 1440) % 1440;

        godziny = totalMinutes / 60;
        minuty = totalMinutes % 60;
    }

    public boolean czyNoc() {
        return godziny >= 22 || godziny < 6;
    }
}
