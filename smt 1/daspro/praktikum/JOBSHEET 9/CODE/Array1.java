import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] array = new int [60];

        for (int i = 0; i < array.length; i++) {
            array [i] = i + 1;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
