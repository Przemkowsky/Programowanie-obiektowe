public class Main {
    public static void main(String[] args) {

        int[] tablica = {0,2,4,5,7,6};
        int suma = 0, srednia = 0, tysiac = 1000;


        for (int i =0; i < tablica.length; i++) {
            suma += tablica[i];


        }
        System.out.println(suma);

        srednia = suma / tablica.length;
        System.out.println("Średnia to " + srednia);
        System.out.println("Suma to " + suma);

        for (int i =0; i < tablica.length; i++) {
            if(i % 2 !=0){
                System.out.println(i);
            }
        }
        for (int i =0; i < tablica.length; i++) {
            if(i % 2 ==0) {
                System.out.println(tysiac - tablica.length);
            }
        }


1
        }
    }
