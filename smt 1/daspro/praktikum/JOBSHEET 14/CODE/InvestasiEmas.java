import java.util.Scanner;

public class InvestasiEmas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah investasi awal: ");
        double investasiAwal = scanner.nextDouble();

        System.out.print("Masukkan jumlah tahun investasi: ");
        int tahunInvestasi = scanner.nextInt();

        double keuntunganTahunan = 0.117; // 11,7%

        System.out.println("Perhitungan Investasi Emas:");
        cetakPerhitunganInvestasi(investasiAwal, keuntunganTahunan, tahunInvestasi);
    }

    static void cetakPerhitunganInvestasi(double investasiAwal, double keuntunganTahunan, int tahunInvestasi) {
        double totalInvestasi = investasiAwal;

        for (int tahun = 1; tahun <= tahunInvestasi; tahun++) {
            double keuntungan = totalInvestasi * keuntunganTahunan;
            totalInvestasi += keuntungan;

            System.out.printf("Tahun %d: Investasi = %.2f, Keuntungan = %.2f, Total = %.2f\n",
                    tahun, investasiAwal, keuntungan, totalInvestasi);
        }
    }
}
