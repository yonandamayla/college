import java.util.Scanner;

public class RataRataNilai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String pelajaran;
        double rata;
        int nilai, jmlNilai, totalNilai = 0, count;

        System.out.print("Masukkan berapa matkul yang ingin diinput nilai : " );
        // jumlah nilai diperoleh dari beberapa matkul
        count = sc.nextInt();
        jmlNilai = count;
        
        while (count >= 1) {
            System.out.print("Masukkan nilai : ");
            nilai = sc.nextInt();
            totalNilai += nilai;
            count--;
        } rata = totalNilai / jmlNilai;
        System.out.println("Rata - rata nilai matkul : " + rata);
    }
}
