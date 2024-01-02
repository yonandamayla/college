import java.util.Scanner;

public class Percobaan2_29 {
    static int hitungPangkat(int x, int y) {
        if (y == 0) {
            return (1);
        } else {
            return (x * hitungPangkat(x, y - 1));
        }
    }
    public static void main(String[] args) {
        Scanner sc29 = new Scanner(System.in);
        System.out.print("Bilangan yang dihitung : ");
        int bilangan = sc29.nextInt();
        System.out.print("Pangkat: ");
        int pangkat = sc29.nextInt();
        int hasil = (hitungPangkat(bilangan, pangkat));

        System.out.print(bilangan); // percobaan 2, no 2
        for (int i = 1; i < pangkat; i++) {
            System.out.print("x" + bilangan);
        }
        System.out.print("x1 = " + hasil);
    }
}
