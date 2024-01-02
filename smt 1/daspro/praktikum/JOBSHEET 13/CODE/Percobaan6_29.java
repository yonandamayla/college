import java.util.Scanner;

public class Percobaan6_29 {
    public static void main(String[] args) {
        Scanner sc29 = new Scanner(System.in);

        int p, l, t, L, vol;

        System.out.print("Masukkan panjang : ");
        p = sc29.nextInt();
        System.out.print("Masukkan lebar : ");
        l = sc29.nextInt();
        System.out.print("Masukkan tinggi : ");
        t = sc29.nextInt();

        L = hitungLuas(p, l);
        System.out.println("Luas persegi panjang adalah : " + L);

        vol = hitungVolume(p, l, t);
        System.out.println("Volume balok adalah " + vol);
    }
    static int hitungLuas (int panjang, int lebar) {
        int Luas = panjang * lebar;
        return Luas;
    }
    static int hitungVolume (int a, int b, int tinggi) {
        int volume = hitungLuas(a, b) * tinggi;
        return volume;
}
}
