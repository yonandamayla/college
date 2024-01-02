import java.util.Scanner;

public class Kasir29 {
    public static void main(String[] args) {
        int total, diskon, bayar;
        String kartu;
        Scanner input29 = new Scanner(System.in);
        System.out.print("Apakah pelanggan mempunyai kartu anggota (y atau t) ? ");
        kartu = input29.nextLine();
        System.out.print("Berapa total harga barang belanjaan? Rp ");
        total = input29.nextInt();

        if (kartu.equals("y")) {
            if (total > 500000) {
                diskon = 50000;
            } else {
                diskon = 250000;
            }
        } else {
            diskon = 0;
        }
        bayar = total - diskon;
        System.out.println("Total yang harus dibayar : Rp " + bayar);
    }
    
}
