import java.util.Scanner;

public class Segitiga29{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alas, tinggi;
        float luas;
        System.out.print("Masukkan alas");
        alas = sc.nextInt();
        System.out.println("Masukkan tinggi");
        tinggi = sc.nextInt();
        luas = alas * tinggi / 2;
        System.out.println("Luas segitiga: " + luas);
    }
}