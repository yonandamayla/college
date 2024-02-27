public class Perulangan {
    public static void main(String[] args) {
        for (int i = 1; i <= 15; i++) {
            // Pengecualian untuk angka 6 dan 10
            if (i == 6 || i == 10) {
                continue;
            }

            // Cetak angka genap atau asterik untuk angka ganjil
            if (i % 2 == 0) {
                System.out.print(i + " ");
            } else {
                System.out.print("* ");
            }
        }
    }
}
