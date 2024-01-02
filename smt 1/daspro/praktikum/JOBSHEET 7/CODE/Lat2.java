import java.util.Scanner;

public class Lat2{

    public static void main(String[] args) {
        Scanner input28 = new Scanner(System.in);
        int pilihan;
        char ulang;
        do {
            System.out.println(" Mata Kuliah :  ");
            System.out.println(" 1. Daspro");
            System.out.println(" 2. Matdas ");
            System.out.println(" 3. KTI ");

            System.out.println("===== Pilihan Dosen =====");
            pilihan = input28.nextInt();

            switch (pilihan){
                case 1:
                System.out.println("Bu Triana");
                break;
                case 2:
                System.out.println("Bu Anisa");
                break;
                case 3:
                System.out.println("Bu Ririd");
                break;
            default:
            System.out.println("Menu tidak tersedia");
            }

        System.out.println("Ingin memilih menu (y/t)");
        ulang = input28.next().charAt(0);
        
        } while (ulang != 't');
        System.out.println("arigato");
}
}