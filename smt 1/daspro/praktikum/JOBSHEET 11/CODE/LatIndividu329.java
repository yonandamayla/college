import java.util.Scanner;

public class LatIndividu329 {
    public static void main(String[] args) {
        Scanner input29 = new Scanner(System.in);
        System.out.print("Masukkan Nilai N = ");
        int N = input29.nextInt();

        // untuk mencetak baris
        for (int i = 1; i <= N; i++) {
            // untuk mencetak angka dalam satu baris
            for (int j = 1; j <= N; j++) {
                if (i == 1 || i == N || j == 1 || j == N) {
                    System.out.print(N);
                } else {
                    System.out.print(" ");
                }
                System.out.print(" "); // menambahkan spasi antar angka
            }
            System.out.println();
        }
    }
}