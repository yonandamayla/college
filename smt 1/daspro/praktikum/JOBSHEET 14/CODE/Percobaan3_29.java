import java.util.Scanner;

public class Percobaan3_29 {
    static double hitungLaba (double saldo, int tahun) {
        if (tahun == 0) {
            return (saldo);
        } else {
            return (1.11 * hitungLaba(saldo, tahun - 1));
        }
    }
    public static void main(String[] args) {
        Scanner sc29 = new Scanner(System.in);
        System.out.print("Jumlah saldo awal : ");
        double saldoAwal = sc29.nextInt();
        System.out.print("Lamanya investasi (tahun) : ");
        int tahun = sc29.nextInt();
        System.out.print("Jumlah saldo setelah " + tahun + " tahun : ");
        System.out.print(hitungLaba(saldoAwal, tahun));
    }
}
