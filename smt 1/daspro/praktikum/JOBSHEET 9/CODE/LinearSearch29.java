import java.util.Scanner;

public class LinearSearch29 {
    public static void main(String[] args) {
        Scanner input29 = new Scanner(System.in);
        int [] arrayInt = {34, 18, 26, 48, 72, 20, 56, 63};
        int key = 20;
        int hasil = 0;
        int jml;

        System.out.print("Masukkan jumlah elemen array : ");
        jml = input29.nextInt();

        arrayInt = new int[jml];

        for (int i = 0; i < jml; i++) {
        System.out.print("Masukkan elemen array ke- : " + (i+1) + " : ");
        arrayInt[i] = input29.nextInt();
        }

        System.out.print("Masukkan key yang ingin dicari : ");
        key = input29.nextInt();

        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] == key) {
                hasil = i;
                break;
            }
        }
        System.out.println("Key ada dalam array pada posisi indeks ke- " + hasil);
        }
    }

