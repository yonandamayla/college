import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         String mahasiswa, admin;
         char menu;

        System.out.println("Masukkan pengguna 1 : ");
        mahasiswa = sc.nextLine();
        System.out.println("Masukkan pengguna 2 : ");
        admin = sc.nextLine();
        String user = sc.nextLine();
         if (user.equalsIgnoreCase(mahasiswa)) {
            System.out.println("===== Pilihan Menu =====");
            menu = sc.next() .charAt(0);

            switch (menu) {
                case '1':
                System.out.println("Update Biodata");
                break;
                case '2':
                System.out.println("Akses jadwal kuliah");
                break;
                case '3':
                System.out.println("Akses LMS");
                break;

                default :
                System.out.println("Invalid menu");
            }
            } else if (user.equalsIgnoreCase(admin)) {
                System.out.println("===== Pilihan Menu =====");
                menu = sc.next() .charAt(0);

                switch (menu) {
                    case '1':
                    System.out.println("Input data mahasiswa");
                    break;
                    case '2':
                    System.out.println("Update biodata pengguna");
                    break;
                    case '3':
                    System.out.println("Presensi");
                    break;

                    default:
                    System.out.println("Invalid menu");
                }

            }
         }
    }
