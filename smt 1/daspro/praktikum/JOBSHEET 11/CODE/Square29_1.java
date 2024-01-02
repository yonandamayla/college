import java.util.Scanner;
public class Square29_1 {
    public static void main(String[] args) {
        Scanner input29 = new Scanner(System.in);
        System.out.print("Masukkan nilai N = ");
        int N = input29.nextInt();

        // inner loop
        // for (int i = 1; i <= N; i++) {
        //     System.out.print("*");

        for (int iOuter = 1; iOuter <= N; iOuter++) {
            for (int i = 0; i <= N; i++) {
                System.out.print("*");
            }
            // System.out.println();
        }
    }
}

