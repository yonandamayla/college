import java.util.Scanner;

public class KonversiNilai {
    public static void main(String[] args) {
        Scanner input29 = new Scanner(System.in);
        int nilai;
        System.out.println("Masukkan Nilai (0-100) : ");
        nilai = input29.nextInt();

        if (nilai >= 0 && nilai <= 100) {
            if (nilai > 80 && nilai <= 100) {
                System.out.println("Nilai A, Sangat Baik");
            } else if (nilai <= 80 && nilai > 73) {
                System.out.println("Nilai B+, Lebih dari baik");
            } else if (nilai <= 73 && nilai > 65 ) {
                System.out.println("Nilai B, Baik");
            } else if (nilai <= 65 && nilai > 60) {
                System.out.println("Nilai C+, Lebih dari cukup");
            } else if (nilai <= 60 && nilai > 50) {
                System.out.println("Nilai C, Cukup");
            } else if (nilai <= 50 && nilai > 39) {
                System.out.println("Nilai D, Kurang");
            } else {
                System.out.println("E, gagal");
            }
        }
    }
}
