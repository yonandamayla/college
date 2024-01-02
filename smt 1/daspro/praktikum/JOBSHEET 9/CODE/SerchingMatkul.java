import java.util.Scanner;
import java.util.Arrays;

public class SerchingMatkul {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String [] matkul = {"CTPS", "PRAKDASPRO", "PAMB", "MTKDAS", "KTI", "DASPRO", "BING", "BINDO", "AGAMA"};
        String [] find = new String[7];
         String [] hari = new  String [7];
                
                hari[0] = "Senin";
                hari[1] = "Selasa";
                hari[2] = "Rabu";
                hari[3] = "Kamis";
                hari[4] = "Jum'at";
                hari[5] = "Sabtu";
                hari[6] = "Minggu";
                String hasil = " ";


        System.out.println("Matkul anda adalah sebagai berikut : ");
        // System.out.println(Arrays.toString(matkul));
        for (int i = 0; i < matkul.length; i++) {
            System.out.println(matkul[i]);
        }
        
        System.out.print("Masukkan matkul yang ingin dicari : ");
        String Inpmatkul=  input.nextLine();

        boolean findd = false;
        for (int i = 0; i < matkul.length; i++) 
        {
            if ( matkul[i].equals(Inpmatkul)) {
                findd = true;
                hasil = matkul[i] = hari[i];
                break;
                
            }
        }
        if (findd) {
            System.out.println("Matkul yang anda cari ada di hari: " + hasil );
        }else{
            System.out.println("tidak ditemukan");
        }
        
        
      


    }
}
