import java.util.Arrays;
import java.util.Scanner;

public class Numbers25 {
    public static void main(String[] args) {
        Scanner input29 = new Scanner(System.in);
        int [][] myNumbers = new int [3][];
        myNumbers [0] = new int[5];
        myNumbers [1] = new int[3];
        myNumbers [2] = new int[1];

        // no 1. menambhkan kode program
        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println(Arrays.toString(myNumbers[i]));
        }

        // no 4. menambhkan kode program 
        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println("Panjang baris ke-" + (i+1) + " : " + myNumbers[i].length);
        }
    }
}
