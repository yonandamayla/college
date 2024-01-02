import java.util.Scanner;

public class ForVar129 {
    public static void main(String[] args) {
        Scanner input29 = new Scanner (System.in);
        for (int i = 5, j = 10; i < j;  i++, j--) {
            System.out.println(i + " " + j);
        }
System.out.println("KEDUA");
        int j = 0;
        for (int i = 5; i < j; i++) {
            System.out.println(i + " " + j);
            j--;
        }
    }
}
// program ini berjalan dengan alur pengecekan kondisi pada for dahulu, inisialisasi ditandai dengan i = 1, dan j = 10. kemudian akan mengevaluasi kondisinya bernilai i < j, dan bernilai true yang update annya berupa i++ dan j--
// inisialiasi dan update boleh terdiri dari beberapa ekspresi yang dipisahkan dengan tanda koma
// karena program bernilai true maka akan mengeprint sesuai perintah 
// dimulai dari i = 1 yang akan dilooping sampai nilai i tidak > j 
