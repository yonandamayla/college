import java.util.Scanner;

public class DeretBil29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan bilangan : ");
        int bil = input.nextInt();

        for (int i = 1; i <= bil; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println("Bilangan yang bukan kelipatan 3 : " + i);
  }
}
}