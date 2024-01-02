import java.util.Scanner;

public class ArrayRataNilai29_1 {
    public static void main(String[] args) {
        Scanner input29 = new Scanner (System.in);
        int [] nilaiMhs = new int [5];
        double total = 0;
        double rata2;
        int lulus = 0; 

        
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke- " + (i + 1) + " : ");
            nilaiMhs[i] = input29.nextInt();
        }

        for (int i = 0; i < nilaiMhs.length; i++) {
            total = total + nilaiMhs[i];
            if (nilaiMhs[i] > 70) {
                lulus++;
            } else {
                lulus--;
            }
        }

        rata2 = total / nilaiMhs.length;
        System.out.println("Rata-rata nilai lulus = " + rata2);

    }
}
