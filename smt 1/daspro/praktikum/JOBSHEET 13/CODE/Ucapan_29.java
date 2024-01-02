import java.util.Scanner;

public class Ucapan_29 {
    public static String PenerimaUcapan() {
        Scanner sc29 = new Scanner(System.in);
        System.out.print("Tuliskan NAMA orang yang ingin anda beri ucapan : ");
        String namaOrang = sc29.nextLine();
        sc29.close();
        return namaOrang;
    }

    public static void main(String[] args) {
        String nama = PenerimaUcapan();
        System.out.println("Thank you " + nama + "\nMay the force be with you");
    }
}
