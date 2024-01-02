import java.util.Scanner;

public class RekursifTotalPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int N = scanner.nextInt();

        System.out.print("1");
        printTotalRekursif(N, 1);
    }

    static void printTotalRekursif(int N, int current) {
        if (current < N) {
            System.out.print(" + " + (current + 1));
            printTotalRekursif(N, current + 1);
        } else {
            System.out.println(" = " + hitungTotalRekursif(N));
        }
    }

    static int hitungTotalRekursif(int N) {
        if (N == 1) {
            return 1;
        } else {
            return N + hitungTotalRekursif(N - 1);
        }
    }
}

