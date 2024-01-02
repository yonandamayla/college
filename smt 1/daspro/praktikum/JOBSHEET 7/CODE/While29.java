import java.util.Scanner;

public class While29 {
    public static void main(String[] args) {
        Scanner input29 = new Scanner(System.in);

        int i = 1;
        while (i <= 10) {
            if (i % 2 == 0) {
                System.out.println("Angka " +i + " adalah bilangan genap");
            } else {
                System.out.println("Angka " +i + " adalah bilangan ganjil");
            }
             i++;
        }
    }
}
// program ini akan mengeprint angka 1 sampai 10, dengan nilai i awal yaitu 1. program akan melakukan looping jika 1 <= 10. jika i modulo 2 hasilnya 0, maka bilangan tersebut merupakan bilangan genap. namun jika i modulo 2 selain 0 maka bilangan tersebut adalah bilangan ganjil 