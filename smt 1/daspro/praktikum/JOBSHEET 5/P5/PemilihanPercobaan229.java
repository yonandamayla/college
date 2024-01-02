import java.util.Scanner;

public class PemilihanPercobaan229 {
    public static void main(String[] args) {
        Scanner input29 = new Scanner(System.in);
        System.out.println("Nilai UAS : ");
        float uas = input29.nextFloat();
        System.out.println("Nilai UTS : ");
        float uts = input29.nextFloat();
        System.out.println("Nilai Kuis : ");
        float kuis = input29.nextFloat();
        System.out.println("Nilai Tugas : ");
        float tugas = input29.nextFloat();

        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);

        String massage = total < 65 ? "Remidi" : "Tidak Remidi";
        System.out.println("Nilai Akhir = " + total + " sehingga" + " tidak remidi");

    }
}