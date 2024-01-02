import java.util.Scanner;

public class DeretDescendingRekursif_29 {
    // Fungsi Rekursif
    static void fungsiRekursif(int n) {
        if (n >= 0) {
            System.out.println(n + " ");
            fungsiRekursif(n - 1);
        }
    }
    // Fungsi Iteratif
    static void fungsiIteratif(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.println(i + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai angka: ");
        int input = sc.nextInt();
        System.out.println("Memakai Fungsi Rekursif:");
        fungsiRekursif(input);
        System.out.println("\nMemakai Fungsi Iteratif:");
        fungsiIteratif(input);
    } 
}

