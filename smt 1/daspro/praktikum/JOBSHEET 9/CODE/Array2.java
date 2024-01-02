import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] array = new int [10];
        
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        for (int i = array.length -1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}
