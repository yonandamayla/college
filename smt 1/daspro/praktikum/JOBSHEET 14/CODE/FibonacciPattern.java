import java.util.Scanner;

public class FibonacciPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan panjang deret Fibonacci: ");
        int panjangDeret = scanner.nextInt();

        System.out.print("Pola Fibonacci: ");
        cetakFibonacci(panjangDeret);
    }

    static void cetakFibonacci(int panjangDeret) {
        int angkaSebelumnya = 1;
        int angkaSekarang = 1;

        for (int i = 0; i < panjangDeret; i++) {
            System.out.print(angkaSebelumnya + " ");

            int jumlah = angkaSebelumnya + angkaSekarang;
            angkaSebelumnya = angkaSekarang;
            angkaSekarang = jumlah;
        }
    }
}
