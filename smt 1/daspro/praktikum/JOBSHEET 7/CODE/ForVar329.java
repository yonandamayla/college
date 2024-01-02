import java.util.Scanner;

public class ForVar329 {
    public static void main(String[] args) {
        Scanner input29 = new Scanner (System.in);
        int bil, n;
        boolean berhenti = false;
        
        for (n = 0; !berhenti; n++) {
            System.out.print("Masukkan bilangan : ");
            bil = input29.nextInt();
            System.out.println("Bilangan yang anda masukkan : " + bil);
            if (bil < n) {
                berhenti = true;
            }
        }
        System.out.println("Program berakhir");
    }
}
// program akan terus melooping selama kondisi bil bernilai true karena bil >n, namun jika bil > n akan bernilai true dan program akan berakhir