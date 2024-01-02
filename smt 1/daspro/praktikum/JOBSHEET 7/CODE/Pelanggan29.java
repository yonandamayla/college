import java.util.Scanner;

public class Pelanggan29 {
    public static void main(String[] args) {
        Scanner input29= new Scanner(System.in);

        String nama;
        char jawab;
        int jml = 0;
        do{
            System.out.print("Masukkan nama pelanggan: ");
            nama = input29.nextLine();
            jml++;
            System.out.print("Apakah anda ingin memasukkan nama pelangga baru (Y/T)? ");
            jawab = input29.nextLine().charAt(0);
       } while (jawab == 'y' || jawab == 'Y');

        System.out.printf("Jumlah pelanggan yang Anda masukkan = "+jml);
}
}