public class Kasus29 {
    public static void main(String[] args) {
        int tinggi = 5; // Ubah tinggi segitiga sesuai kebutuhan

        for (int i = 0; i < tinggi; i++) {
            for (int j = i; j < tinggi - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= 2 * i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
