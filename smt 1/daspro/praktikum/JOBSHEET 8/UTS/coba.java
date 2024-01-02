public class coba {

  public static void main(String[] args) {
    // Set diskon dan totalHarga
    int diskon = 0;
    int totalHarga = 0;

    // Input harga dan isMember
    int harga = 50000;
    boolean isMember = true;

    // Hitung diskon
    if (isMember) {
      diskon = 5;
    }

    // Hitung totalHarga
    totalHarga = harga * (100 - diskon) / 100;

    // Cetak totalHarga
    System.out.println(totalHarga);
  }
}
