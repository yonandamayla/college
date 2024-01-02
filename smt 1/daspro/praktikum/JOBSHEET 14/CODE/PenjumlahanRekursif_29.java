public class PenjumlahanRekursif_29 {

    static int penjumlahanRekursif(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + penjumlahanRekursif(n - 1);
        }
    }

    public static void main(String[] args) {
        int f = 8; //contoh untuk perhitungan sampai 8 
        int hasil = penjumlahanRekursif(f);
        System.out.println("Hasil penjumlahan dari 1 sampai " + f + " = " + hasil);
    }
}