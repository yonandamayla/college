import java.util.Scanner;

public class Triangle29 {
    public static void main(String[] args) {
        Scanner input29 = new Scanner(System.in);
        System.out.print("Masukkan nilai N = ");
        int N = input29.nextInt();
        int i = 0;

        while (i <= N) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            i++;
        }
    }
}