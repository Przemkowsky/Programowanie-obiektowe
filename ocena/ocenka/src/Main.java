public class Main {

    public static void findMinMaxAndPrint(int [] t) {
        int min = t[0], max = t[0];
        int minIndex = 0, maxIndex = 0;
        for (int i = 1; i <t.length; i++) {
            if (t[i] < min){
                min = t[i];
                minIndex = i;
            }
            if (t[i] > max) {
                max = t[i];
                maxIndex = i;
            }
        }
        System.out.println("Maksymalna wartość: " + max + " (Index: " +maxIndex + ")");
        System.out.println("Minimalna wartość: " + min + " (Index: " +minIndex + ")");
    }

    public static void main(String[] args) {
        int[] data = {12, 5, 45, 8, 30, 1};

        System.out.println("Analiza tablicy: " + java.util.Arrays.toString(data));

        findMinMaxAndPrint(data);
    }
}