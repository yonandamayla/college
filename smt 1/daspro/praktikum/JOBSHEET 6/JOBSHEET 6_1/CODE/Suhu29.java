import java.util.Scanner;

public class Suhu29 {
    public static void main(String[] args) {
        Scanner input29 = new Scanner(System.in);
        int suhu;
        char hujan;
        System.out.print("Berapa suhu sekarang ? ");
        suhu = input29.nextInt();

        if (suhu > 27) {
            System.out.println("Memakai dress");
            System.out.println("Apakah sekarang hujan (y atau t)?");
            hujan = input29.next().charAt(0);
            if (hujan == 'y') {
                System.out.println("Membawa payung");
            } else {
                System.out.println("Memakai sunscreen");
            }
        } else {
            System.out.println("Memakai celana panjang");
        }
    }
}