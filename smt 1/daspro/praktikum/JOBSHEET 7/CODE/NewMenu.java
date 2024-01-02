import java.util.Scanner;

public class NewMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username, password;
        int menu;

        System.out.println("Login");
        System.out.print("Silahkan masukan username : ");
        username = sc.nextLine();
        System.out.print("Masukan Password : ");
        password = sc.nextLine();

        boolean validation = false;

        do {
            if (username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin")) {
                System.out.println("Welcome admin");
                System.out.print("Masukan menu : ");
                menu = sc.nextInt();
                switch (menu) {
                    case 1:
                        System.out.println("Input data mahasiswa");
                        break;
                    case 2:
                        System.out.println("Update data mahasiswa");
                    case 3:
                        System.out.println("Presensi");
                    case 4:
                        System.out.println("log out");
                        break;
                    default:
                        System.out.println("invalid menu");
                }

            }else if (username.equalsIgnoreCase("mahasiswa") && password.equalsIgnoreCase("mahasiswa")) {
                 System.out.println("Welcome Mahasiswa");
                System.out.print("Masukan menu : ");
                menu = sc.nextInt();
                switch (menu) {
                    case 1:
                        System.out.println("Update biodata");
                        break;
                    case 2:
                        System.out.println("Akses jadwal kuliah");
                    case 3:
                        System.out.println("Akses LMS");
                    case 4:
                        System.out.println("log out");
                        break;
                    default:
                        System.out.println("invalid menu");
                }
            }

        } while (validation !=true);

}
}
