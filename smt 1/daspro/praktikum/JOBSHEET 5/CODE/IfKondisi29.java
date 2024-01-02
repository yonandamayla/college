import java.util.Scanner;

public class IfKondisi29 {
    public static void main(String[] args) {
        Scanner sc29 = new Scanner(System.in);

        System.out.println("Masukkan Suhu : ");
        int suhu = sc29.nextInt();

        if (suhu < 16) {
            System.out.println("Silahkan Menggunakan Jaket");
        } 
        if (suhu < 20) {
            System.out.println("Silahkan Pakai Baju Tebal");
        }else {
            System.out.println("Silahkan Pakai Topi");
        }

    }
}