import java.util.Scanner;
public class HitungIP29 {

    public static void main(String[] args) {
        Scanner sc29 = new Scanner(System.in);

        String namaMhsw, namaMatkul;
        char ulang;
        String kategori;
        double nilai, ip;
        int jml = 0, sks = 0;

        System.out.println("==== Program Hitung IP ====");
        System.out.print("Masukkan Nama Mahasiswa: ");
        namaMhsw = sc29.nextLine();

        do{
        System.out.print("Masukkan Nama Mata Kuliah: ");
        namaMatkul = sc29.next();
        jml++;
        System.out.print("Nilai A, B+, B, C+, C, D, E: ");
        kategori = sc29.next();

        if(kategori.equalsIgnoreCase("A")){
            nilai = 4.0;
        }else if(kategori.equalsIgnoreCase("B+")){
            nilai = 3.5;
        }else if(kategori.equalsIgnoreCase("B")){
            nilai = 3.0;
        }else if(kategori.equalsIgnoreCase("C")){
            nilai = 2.5;
        }else if(kategori.equalsIgnoreCase("C+")){
            nilai = 2.0;
        }else if(kategori.equalsIgnoreCase("D")){
            nilai = 1.0;
        }else {
            nilai = 0.0;
        }
        
        System.out.println("Masukkan Jumlah SKS: ");
        sks = sc29.nextInt();
        sks++;

        ip = (nilai * sks)/ sks ;
        
        System.out.println("Ingin lanjut? (y/t)");
        ulang = sc29.next().charAt(0);

        }while(ulang != 't');
            System.out.println("===== Hasil Perhitungan IP =====");
            System.out.println("Nama                                    : "+namaMhsw);
            System.out.println("Indeks Prestasi                         :  "+ip);
            System.out.println("Jumlah Mata Kuliah                      : "+ jml++);
            System.out.println("Jumlah SKS                              : " + sks++);
            System.out.println("Jumlah MK yang harus perbaikan/remidi :  ");
}
}