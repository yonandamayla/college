import java.util.Scanner;

public class Bioskop29_3 {
    public static void main(String[] args) {
    Scanner input29 = new Scanner (System.in);
    String [][] penonton = new String [4][2];

    penonton [0][0] = "Amin";
    penonton [0][1] = "Bena";
    penonton [1][0] = "Candra";
    penonton [1][1] = "Dela";
    penonton [2][0] = "Eka";
    penonton [2][1] = "Farhan";
    penonton [3][0] = "Gisel";
    penonton [3][1] = "Hana";

    // no 10. menampilkan nama penonton pada baris ke-3 menggunakan for loop
    System.out.println("Penonton pada baris ke-3 : ");
    for (int i = 0; i < penonton[2].length; i++) {
        System.out.println(penonton[2][i]);
    }

    // no 11. modifikasi kode pada langkah 10 menjadi perulangan dengan for each loop
    System.out.println();
    System.out.println("Penonton pada baris ke-3 : ");
    for (String i   : penonton[2]) {
        System.out.println(i);
    }

    // no 12. memodifikasi kembali kode program pada langkah 11 untuk menampilkan nama penonton untuk setiap baris
    System.out.println();
    for (int i = 0; i < penonton.length; i++) {
        System.out.println("Penonton pada baris ke- " + (i + 1) + " : " + String.join(" , " , penonton[i]));
    }

    }
}
 
