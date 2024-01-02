import java.util.Scanner;

public class LatihanIndividu129 {
    public static void main(String[] args) {
        Scanner sc27 = new Scanner(System.in);
        int bil1, bil2, bil3;
        int bilBesar;

        System.out.print("Masukan Bilangan 1 : ");
        bil1 = sc27.nextInt();
        System.out.print("Masukan Bilangan 2 : ");
        bil2 = sc27.nextInt();
        System.out.print("Masukan Bilangan 3 : ");
        bil3 = sc27.nextInt();

        if (bil1 >= bil2) {
            if (bil1 >= bil3) {
                System.out.println("Bilangan terbesar: " + bil1);
            } else {
                System.out.println("Bilangan terbesar: " + bil3);
            }
        } else {
            if (bil2 >= bil3) {
                System.out.println("Bilangan terbesar: " + bil2);
            } else {
                System.out.println("Bilangan terbesar: " + bil3);
            }
        }

    }

}