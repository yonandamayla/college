import java.util.Scanner;

public class Yona {
    public static void main(String[] args) {
        Scanner input29 = new Scanner(System.in);

        String nama, matkul;
        char ulang;
        String kategori;
        double nilai, ip;
        int totalsks, sks = 0, jml = 0;

    
        System.out.println("======= Program Hitung IP =====");
        System.out.print("Masukkan nama : ");
        nama = input29.nextLine();

        do {
        System.out.print("Masukkan Mata Muliah : ");
        matkul = input29.nextLine();
        System.out.print(" Nilai (A, B+, B, C+, C, D, E) : ");
        kategori = input29.nextLine();
        System.out.println("Masukkan Nilai (A, B+, B, C+, C, D, E) :");
        nilai = input29.nextDouble();
        if (kategori.equalsIgnoreCase("A")) {
            nilai = 4.0;
        } else if (kategori.equalsIgnoreCase("B+")) {
            nilai = 3.5;
        } else if (kategori.equalsIgnoreCase("B")) {
            nilai = 3.0;
        } else if (kategori.equalsIgnoreCase("C+")) {
            nilai = 2.5;
        } else if (kategori.equalsIgnoreCase("C")) {
            nilai = 2.0;
        } else if (kategori.equalsIgnoreCase("D")) {
            nilai = 1.0;
        } else if (kategori.equalsIgnoreCase("E")) {
            nilai = 0.0;
        } else {
            System.out.println("Kategori tidak tersedia");
        }


        System.out.println("Masukkan jumlah sks : ");
        sks = input29.nextInt();
        sks++;

        ip = (nilai * sks) / sks;
        System.out.println("Apakah lanjut input nilai (Y/N) ? ");
        ulang = input29.next() .charAt(0);
  
        } while (ulang != 'N');
        System.out.println("Hitung Nilai IP : ");
        System.out.println("Nama : " + nama);
        System.out.println("Indeks Prestasi : " + ip);
        System.out.println("Jumlah Mata Kuliah : " + jml++);
        System.out.println("Jumlah SKS : " + sks++);
        System.out.println("Jumlah MK yang harus perbaikan / remidi : ");
    }
}