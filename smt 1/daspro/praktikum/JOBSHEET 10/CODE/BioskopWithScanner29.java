import java.util.Scanner;

public class BioskopWithScanner29 {
    public static void main(String[] args) {
        Scanner input29 = new Scanner (System.in);

        int baris, kolom;
        String nama, next;

        String [][] penonton = new String[4][2];

        while (true) {
            System.out.print("Masukkan nama : ");
            nama = input29.nextLine();
            System.out.print("Masukkan baris : ");
            baris = input29.nextInt();
            System.out.print("Masukkan kolom : ");
            kolom = input29.nextInt();

            input29.nextLine();

            penonton[baris-1][kolom-1] =  nama;

            System.out.print("Input penonton lainnya ? (y/n) : ");
            next = input29.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}
