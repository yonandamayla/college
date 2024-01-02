import java.util.Scanner;

public class RataNilai {
    public static void main(String[] args) {

         Scanner sc01 = new Scanner(System.in);
         String namaMatkul;
         int [] nilaiMhs = new int [10];
         double totalNilai = 0;
         double rataNilai;
         int jmlNilai = 0;
         int countLulus = 0;

         System.out.print("Masukkan nama mata kuliah : ");
         namaMatkul = sc01.nextLine();

         System.out.print("Masukkan banyaknya nilai 1 semester : ");
         jmlNilai = sc01.nextInt();

         for (int i = 0; i < jmlNilai; i++){
            System.out.print("Masukkan nilai ke-"+(i+1)+" : ");
            nilaiMhs[i] = sc01.nextInt();

            if (nilaiMhs[i] > 70){
                totalNilai += nilaiMhs[i];
                countLulus++;
            }
         }

         if (countLulus > 0){
            rataNilai = totalNilai / countLulus;
            System.out.println("Rata-rata nilai yang lulus: "+rataNilai);
         }else{
            System.out.println("Tidak ada mahasiswa yang lulus");
         }
       
         }
    }