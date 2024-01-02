import java.util.Scanner;

public class LatIndividu129 {
    public static void main(String[] args) {
        Scanner input29 = new Scanner(System.in);
        System.out.print("Masukkan nilai N (nilai N minimal 3): ");
        int N = input29.nextInt();

        if (N < 3) {
            System.out.println("Nilai N harus minimal 3");
        } else {
            for (int i = 1; i <= N; i++) {
                // untuk mencetak spasi di kolom sebelum angka 
                for (int space = 1; space <= N - i; space++) {
                    System.out.print(" ");
                }
                
                // untuk mencetak angka dari arah kanan atas sampai seperti turun ke kiri bawah
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }
                
                System.out.println();
            }
        }
    }
}
