import java.util.Scanner;

public class BioskopWithScanner29_1 {
    public static void main(String[] args) {
        Scanner input29 = new Scanner (System.in);
        String [][] penonton = new String[4][2];

        // no 2. membuat pilihan menu
        while (true) {
            System.out.println("Pilihan Menu : ");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Masukkan pilihan anda : ");
            int inputMenu = input29.nextInt();
            input29.nextLine();

            switch (inputMenu) {
                case 1:
                    System.out.println("1. Input data penonton"); //jika user memilih 1, maka yang ditampilkan adalah input data penonton
                    break;
                case 2:
                    System.out.println("2. Tampilan daftar penonton"); //jika user memilih 2, maka yang ditampilkan adalah daftar penonton
                    break;
                case 3:
                     System.out.println("Terimakasih telah berkunjung!");  //jika user memilih 3, maka yang ditampilkan adalah menu exit/keluar
                     input29.close();
                     System.exit(0);
                     break;

                default:
                System.out.println("Pilihan menu invalid, silahkan coba lagi");
                    break;
            }
        } 

    }
    } 