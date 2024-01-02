import java.util.Scanner;;

public class LoginNew {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String [] inputUsername = {"Admin", "Dosen", "Mahasiswa"};
        String [] inputPassword = {"Admin123", "Dosen456", "Mahasiswa789"};

        boolean found = false;
        int indexUser = -1;

        do {
            System.out.print("Masukkan username: ");
            String inUsername = input.nextLine();
            for (int i = 0; i < inputUsername.length; i++) {
                if (inUsername.equals(inputUsername[i])) {
                    found = true;
                    indexUser = i;
                }
            }
            if (!found) {
                System.out.println("Pengguna tidak ditemukan");
            }
            int trial = 0;
            int max = 3;
            do {
            System.out.print("Masukkan password: ");
                String inPassword = input.nextLine();
                if (inPassword.equals(inputPassword[indexUser])) {
                    switch (indexUser) {
                        case 0:
                        System.out.println("Halaman admin");
                        System.out.println("====================");
                            break;

                        case 1:
                        System.out.println("Halaman mahasiswa ");                        
                            break;

                        case 2:
                        System.out.println("Halaman dosen");
                            break;
                        
                        default:
                    }        
                }  
            } while (trial<=max);
        } while (!found);
        input.close();
    }
}
