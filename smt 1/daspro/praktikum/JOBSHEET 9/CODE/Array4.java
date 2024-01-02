import java.util.Scanner;

public class Array4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] array = new int [8];
        
        for (int i = 0; i < array.length; i++) {
            array[i] =  i + 1; 
            System.out.println(array[i]);  
        }

        int total = 0;
        for (int i = 0; i < array.length; i++) {
            total = total + array[i];
        }

        double rata = total / array.length;
        System.out.println("Rata - rata : " + rata);
    }
}
