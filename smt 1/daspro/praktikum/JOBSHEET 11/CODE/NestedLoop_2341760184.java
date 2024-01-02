import java.util.Scanner;

public class NestedLoop_2341760184 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] temps = new double[5][7]; 

        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota ke-" + (i + 1));
            double totalSuhuKota = 0.0; 
            for (int j = 0; j < temps[i].length; j++) { 
                System.out.print("Masukkan suhu ke-" + (j + 1) + ": ");
                temps[i][j] = input.nextDouble(); 
                totalSuhuKota += temps[i][j]; // Menambahkan suhu harian ke total suhu kota
            }

            // no 3. untuk menghitung nilai rata-rata suhu kota
            double rataSuhuKota = totalSuhuKota / temps[i].length; 
            System.out.println("Rata-rata suhu kota ke-" + (i + 1) + ": " + rataSuhuKota);
            System.out.println();
        }

        // no 2. menggunakan foreach untuk menampilkan array temps
        for (int i = 0; i < temps.length; i++) {
            System.out.print("Kota ke-" + (i + 1) + ": ");
            for (double suhu : temps[i]) {
                System.out.print(suhu + " ");
            }
            System.out.println();
        }
    }
}
