import java.util.Scanner;

public class LoopSentinel29 {
    public static void main(String[] args) {
        Scanner input29= new Scanner(System.in);

        int jumlah = 0, counter = 0, angka;
        float rata = 0;
        do{
            System.out.print("Masukkan integer positif (-1 untuk berhenti) : ");
            angka = input29.nextInt();
            if (angka >= 0) {
                jumlah += angka;
                ++counter;
            }
        } while (angka != -1);
        rata = jumlah / counter;
        System.out.printf("Jumlah dari %d angka adalah %d\n", counter, jumlah);
        System.out.printf("Rata-rata dari %d angka adalah %.3f\n", counter,rata);
}
}