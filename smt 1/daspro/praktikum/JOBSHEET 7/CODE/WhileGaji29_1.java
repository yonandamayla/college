import java.util.Scanner;

public class WhileGaji29_1 {
public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int jmlKaryawan = 0;
        int jmlJamLembur = 0;
        double gajiLembur = 0;
        double totalGajiLembur = 0;
        String jabatan;

        System.out.print("Masukkan jumlah karyawan : ");
        jmlKaryawan = scan.nextInt();

        int i = 0;
        while (i < jmlKaryawan) {
            System.out.println("Pilihan jabatan - Direktur, Manajer, Karyawan ");
            System.out.print("Masukkan jabatan karyawan ke- " + (i + 1) + ": ");
            jabatan = scan.next();
            System.out.print("Masukkan jumlah jam lembur : ");
            jmlJamLembur = scan.nextInt();
            i++;

            if (jabatan.equalsIgnoreCase("direktur")) {
                continue;
            } else if (jabatan.equalsIgnoreCase("manajer")) {
                gajiLembur = jmlJamLembur * 100000;
            } else if (jabatan.equalsIgnoreCase("karyawan")) {
                gajiLembur = jmlJamLembur * 75000;
            } else {
                System.out.println("Jabatan invalid");
                i--;
                gajiLembur = jmlJamLembur * 0;
            }
            
            totalGajiLembur += gajiLembur;
        }
            System.out.println("Total gaji lembur: " + totalGajiLembur);
}
}