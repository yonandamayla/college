import java.util.Scanner;

public class Toko29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama anda: ");
        String nama = input.nextLine();

        System.out.print("Apakah pelanggan adalah member (Y/N)? ");
        boolean isMember = input.nextLine().equalsIgnoreCase("ya");

        double totalHargaSebelumDiskon = 0;
        double totalDiskon = 0;
        int totalItemBarang = 0;

        boolean tambahProduk = true;
        while (tambahProduk) {
            System.out.print("Masukkan produk yang anda beli : ");
            String namaProduk = input.nextLine();

            System.out.print("Banyaknya : ");
            int kuantitas = input.nextInt();

            System.out.print("Harga : ");
            double hargaSatuan = input.nextDouble();

            System.out.print("Diskon (%) : ");
            double diskonProduk = input.nextDouble();

            totalItemBarang += kuantitas;
            double subTotal = kuantitas * hargaSatuan;

            double diskon = subTotal * (diskonProduk / 100);
            totalDiskon += diskon;

            totalHargaSebelumDiskon += subTotal;

            System.out.print("Tambah produk lagi (Y/N)? ");
            input.nextLine();
            tambahProduk = input.nextLine().equalsIgnoreCase("ya");
        }

        double diskonMember = 0;
        if (isMember) {
            if (totalHargaSebelumDiskon >= 200000) {
                diskonMember = totalHargaSebelumDiskon * 0.1;
            } else {
                diskonMember = totalHargaSebelumDiskon * 0.05;
            }
        }

        double totalAkhir = totalHargaSebelumDiskon - totalDiskon - diskonMember;

        System.out.println("Nama Pelanggan: " + nama);
        System.out.println("Tipe Pelanggan: " + (isMember ? "Member" : "Bukan Member"));
        System.out.println("Total Item Barang: " + totalItemBarang);
        System.out.println("Total Harga Sebelum Diskon: " + totalHargaSebelumDiskon);
        System.out.println("Total Diskon: " + totalDiskon);
        System.out.println("Diskon Member: " + diskonMember);
        System.out.println("Total Akhir: " + totalAkhir);

        input.close();
}
}