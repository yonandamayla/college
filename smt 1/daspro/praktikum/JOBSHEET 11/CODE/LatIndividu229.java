import java.util.Scanner;

public class LatIndividu229 {
    public static void main(String[] args) {
        Scanner input29 = new Scanner(System.in);
        System.out.print("Masukkan nilai N (nilai N minimal 5) : ");
        int N = input29.nextInt();

        if (N < 5) {
            System.out.println("Nilai N harus minimal 5");
        } else {
            // UNTUK MENAMPILKAN BARIS
            for (int i = 0; i < N; i++) {
                // UNTUK MENAMPILKAN * YANG SEMAKIN KE BAWAH BARISNYA MAKA AKAN SEMAKIN BERKURANG 1 
                for (int j = 0; j < N - i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
