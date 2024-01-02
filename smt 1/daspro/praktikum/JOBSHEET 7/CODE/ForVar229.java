import java.util.Scanner;

public class ForVar229 {
    public static void main(String[] args) {
        Scanner input29 = new Scanner(System.in);
        int bil;
        boolean berhenti = false;
        
        for (; !berhenti; ) {
            System.out.print("Masukkan bilangan : ");
            bil = input29.nextInt();
            System.out.println("Bilangan yang anda masukkan : " + bil);
            if (bil == 0) {
                berhenti = true;
            }
        }
        System.out.println("Program Berakhir ");
    }
}
// dalam kondisi for berarti tidak berhenti dan akan mengeprint bilangan yang dimasukkan dan mengeprint lagi bilangan yang dimasukkan dengan variabel bil
// kondisi for akan berjalan jika variabel berhenti bernilai false
// jika kita menginputkan 0 maka program akan berakir karena variabel berhenti menjadi true, sehingga looping berhenti