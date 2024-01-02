import java.util.Scanner;

public class Star29 {
    public static void main(String[] args) {
    Scanner input29 = new Scanner(System.in);
    System.out.print("Masukkan nilai N = ");  
    int N = input29.nextInt();

    for (int i = 1; i <= N; i++) {
        System.out.print("*");
    }
    }
}