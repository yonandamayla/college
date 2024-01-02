import java.util.Scanner;

public class HargaBayar29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int harga, jumlah, jmlHal;
        String merk;
        double dis= 0.1, total, bayar, jmlDis;

        System.out.println("Masukkan Jumlah Diskon");
        dis = input.nextDouble();
        System.out.println("Masukkan Jumlah Halaman Buku yang Dibeli");
        jmlHal = input.nextInt();
        merk = input.nextLine();
        
        System.out.println("Masukkan Nama Merk Buku yang Dibeli");
        merk = input.nextLine();
        System.out.println("Masukkan Harga Barang yang Dibeli");
        harga = input.nextInt();
        System.out.println("Masukkan Jumlah Barang yang Dibeli");
        jumlah = input.nextInt();

        total = harga * jumlah;
        jmlDis = total * dis; 
        bayar = total - jmlDis;

        System.out.println ("Diskon yang Anda Dapatkan Adalah " + jmlDis) ;
        System.out.println ("Jumlah yang Harus Dibayar Adalah " + bayar) ;
    }
}