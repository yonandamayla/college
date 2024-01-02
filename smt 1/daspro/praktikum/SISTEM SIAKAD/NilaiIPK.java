import java.util.Scanner;

public class NilaiIPK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sks_matkul, nilai_mata_kuliah_1, nilai_mata_kuliah_2, nilai_mata_kuliah_3, nilai_mata_kuliah_4, nilai_mata_kuliah_5, nilai_mata_kuliah_6, nilai_mata_kuliah_7;
        double nilai_ips;
        System.out.println("masukkan sks mata kuliah anda");
        sks_matkul = sc.nextInt();


        System.out.println("masukkan nilai matkul 1 ");
        nilai_mata_kuliah_1 = sc.nextInt();
        System.out.println("masukkan nilai matkul 2 ");
        nilai_mata_kuliah_2 = sc.nextInt();
        System.out.println("masukkan nilai matkul 3 ");
        nilai_mata_kuliah_3 = sc.nextInt();
        System.out.println("masukkan nilai matkul 4 ");
        nilai_mata_kuliah_4 = sc.nextInt();
        System.out.println("masukkan nilai matkul 5 ");
        nilai_mata_kuliah_5 = sc.nextInt();
        System.out.println("masukkan nilai matkul 6 ");
        nilai_mata_kuliah_6 = sc.nextInt();
        System.out.println("masukkan nilai matkul 7 ");
        nilai_mata_kuliah_7 = sc.nextInt();

        double total_mata_kuliah_1 = nilai_mata_kuliah_1 * sks_matkul;
        double total_mata_kuliah_2 = nilai_mata_kuliah_2 * sks_matkul;
        double total_mata_kuliah_3 = nilai_mata_kuliah_3 * sks_matkul;
        double total_mata_kuliah_4 = nilai_mata_kuliah_4 * sks_matkul;
        double total_mata_kuliah_5 = nilai_mata_kuliah_5 * sks_matkul;
        double total_mata_kuliah_6 = nilai_mata_kuliah_6 * sks_matkul;
        double total_mata_kuliah_7 = nilai_mata_kuliah_7 * sks_matkul;

        System.out.println("total nilai matkul 1 " + total_mata_kuliah_1);
        System.out.println("total nilai matkul 2 " + total_mata_kuliah_2);
        System.out.println("total nilai matkul 3 " + total_mata_kuliah_3);
        System.out.println("total nilai matkul 4 " + total_mata_kuliah_4);
        System.out.println("total nilai matkul 5 " + total_mata_kuliah_5);
        System.out.println("total nilai matkul 6 " + total_mata_kuliah_6);
        System.out.println("total nilai matkul 7 " + total_mata_kuliah_7);

        nilai_ips = total_mata_kuliah_1;
        nilai_ips = nilai_ips + total_mata_kuliah_2;
        nilai_ips = nilai_ips + total_mata_kuliah_3;
        nilai_ips = nilai_ips + total_mata_kuliah_4;
        nilai_ips = nilai_ips + total_mata_kuliah_5;
        nilai_ips = nilai_ips + total_mata_kuliah_6;
        nilai_ips = nilai_ips + total_mata_kuliah_7;

        double total_sks = sks_matkul * 7;

        System.out.println("Nilai ips adalah " +nilai_ips/total_sks);
        
    }
}