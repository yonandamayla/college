import java.util.Scanner;
import java.util.Random;

public class Quiz29 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input29 = new Scanner(System.in);

        char menu =  'y';
        do {
            int number = random.nextInt(10) + 1;
            boolean success = false;
            do {
                System.out.print("Tebak angka (1-10) : ");
                int answer = input29.nextInt();
                input29.nextLine();
                success = (answer == number);
            } while (!success);
            System.out.print("Apakah anda ingin mengulang permainan (y/Y)? ");
            menu = input29.nextLine() .charAt(0);
        } while (menu == 'y' || menu == 'Y');
    }
}
