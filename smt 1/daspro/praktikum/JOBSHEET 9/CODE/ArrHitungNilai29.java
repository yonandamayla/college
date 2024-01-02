import java.util.Scanner;

public class ArrHitungNilai29 {
    public static void main(String[] args) {
        Scanner input29 = new Scanner(System.in);
        int[] elemen = new int[10];
        int jml = 0;
        int max_num, min_num;
        double rata2;
        double total = 0;

        System.out.print("Masukkan banyaknya elemen : ");
        jml = input29.nextInt();

        for (int i = 0; i < jml; i++) {
            System.out.print("Masukkan elemen ke-"+ i +": ");
            elemen[i] = input29.nextInt();
        }
        max_num = elemen[0];
        for (int i = 0; i < jml; i++) {
            if (elemen[i] > max_num) {
                 max_num = elemen[i];
            }
        }
        min_num = elemen[0];
        for (int i = 0; i < jml; i++) {
            if (elemen[i] < min_num) {
                min_num = elemen[i];
            }
        }
        rata2 = elemen[0];
        for (int i = 0; i < jml; i++) {
            total += elemen[i];
        }
        rata2 = total/jml;
        System.out.println("Nilai tertinggi adalah: " + max_num);
        System.out.println("Nilai terendah adalah: " + min_num);
        System.out.println("Rata-rata nilai adalah: "+ rata2);
    }
}