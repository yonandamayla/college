import java.util.Scanner;

public class PemilihanMenuSiakad {
    public static void main(String[] args) {
        Scanner input29 = new Scanner(System.in);
        int menu;

        System.out.println(" ====== Pilihan Menu ===== : ");
        menu = input29.nextInt();

        switch (menu) {
            case 1:
            System.out.println("Login Akun SIAKAD");
            break;
            case 2:
            System.out.println("Input data mahasiswa");
            break;
            case 3:
            System.out.println("Update data mahasiswa");
            break;
            case 4:
            System.out.println("Jadwal Perkuliahan");
            break;
            case 5:
            System.out.println("Input nilai mahasiswa");
            break;
            case 6:
            System.out.println("Cetak KHS dan nilai");
            break;

            default:
            System.out.println("Maaf, menu tidak tersedia");
        }
    }
}
