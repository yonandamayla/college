import java.util.Scanner;

public class IteratifTotal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int N = scanner.nextInt();

        printTotalIteratif(N);
    }

    static void printTotalIteratif(int N) {
        int total = 0;
        int i;

        // Mencetak urutan angka 1 + 2 + 3 + ... + N
        for (i = 1; i <= N; i++) {
            System.out.print(i);
            total += i;

            // Menambahkan '+' setelah angka, kecuali untuk angka terakhir
            if (i < N) {
                System.out.print(" + ");
            }
        }

        System.out.println(" = " + total);
    }
}
