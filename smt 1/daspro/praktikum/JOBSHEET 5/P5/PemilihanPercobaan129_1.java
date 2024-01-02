import java.util.Scanner;

public class PemilihanPercobaan129_1 {
    public static void main(String[] args) {
        Scanner input29 = new Scanner(System.in);
        System.out.println("Masukkan Umur : ");
        int age = input29.nextInt();

        if (age > 65 ) {
            System.out.println("Elderly");
        } else if (age > 18 ) {
            System.out.println("Adults");
        } else if (age > 12) {
            System.out.println("Teens");
        } else if (age > 5) {
            System.out.println("Children");
        } else if (age >= 1 ) {
            System.out.println("Toddler");
        } else {
            System.out.println("Sorry, the age you entered is wrong ");
        }
    }

}
