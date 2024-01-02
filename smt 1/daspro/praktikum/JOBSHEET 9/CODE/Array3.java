import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String [] bulan = new String [12];

        System.out.print("Masukkan angka (1- 12) : ");
        int nomorBulan =  input.nextInt();

        bulan[0] = "Januari";
        bulan[1] = "Februari";
        bulan[2] = "Maret";
        bulan[3] = "April";
        bulan[4] = "Mei";
        bulan[5] = "Juni";
        bulan[6] = "Juli";
        bulan[7] = "Agustus";
        bulan[8] = "September";
        bulan[9] = "Oktober";
        bulan[10] = "November";
        bulan[11] = "Desember";

        System.out.print("Nama bulan : " + bulan[nomorBulan - 1]);
    }
}
