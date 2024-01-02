import java.util.Scanner;

public class LoginAdmin {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        String [] username = {"admin", "mahasiswa", "dosen"};
        String [] password = {"admin123", "mahasiswa789", "dosen456"};
        // String usernameAdmin = "admin";
        // String passwordAdmin = "admin123";
        // String usernameMahasiswa = "mahasiswa";
        // String passwordMahasiswa = "mahasiswa456";
        // String usernameDosen = "dosen";
        // String passwordDosen = "dosen789";
      

        System.out.println("Masukan Username dan Password");
        System.out.print("Username   : ");
        String inputUsername = input.nextLine();
        System.out.print("Password   : ");
        String inputPassword = input.nextLine();
            if (inputUsername.equals(username[0])){
                System.out.println("Username ada dalam data");
                if (inputPassword.equals(password[0])){
                    System.out.println("Password ada dalam data");
                    System.out.println("ini halaman admin");

                } else {
                    System.out.println("Password anda salah");
                }  
            } else if (inputUsername.equals(username[1])){
                System.out.println("Username ada dalam data");
                if (inputPassword.equals(password[1])){
                    System.out.println("Password ada dalam data");
                    System.out.println("ini halaman mahasiswa");
                } else {
                    System.out.println("Password anda salah");
                }    
            } else if (inputUsername.equals(username[2])) {
                System.out.println("Username ada dalam data");
                if (inputPassword.equals(password[2])){
                    System.out.println("Password ada dalam data");
                    System.out.println("ini halaman dosen");
                } else {
                    System.out.println("Password anda salah");
                }
            } else {System.out.println("username anda salah");
        } 
        // 
        // int indexUser = 0;
        // boolean usernameTdkAda = !inputUsername.equals(username[indexUser]);
        // while (usernameTdkAda) {   
        // }
        
        boolean found = false;
        int indexUser = -1;
        
        do {
            System.out.print("Masukkan username: ");
            String inUsername = input.nextLine();
            for (int i = 0; i < username.length; i++) {
                if (inUsername.equals(username[i])) {
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
                if (inPassword.equals(password[indexUser])) {
                    switch (indexUser) {
                        case 0:
                        System.out.println("Halaman admin");
                        System.out.println("====================");
                        // System.out.println("Pilihan Menu"
                        //                     "1. Input data mahasiswa"
                        //                     "2. Update data mahasiswa"
                        //                     "3. Jadwal mata kuliah");
                        // System.out.println("====================");
                            break;

                        case 1:
                        System.out.println("Halaman mahasiswa ");
                        // System.out.println("====================");
                        // System.out.println("Pilihan Menu" 
                        //                         "1. Cetak KHS + nilai"
                        //                         "2. Jadwal mata kuliah dan dosen pengajar");
                        // System.out.println("====================");                        
                            break;

                        case 2:
                        System.out.println("Halaman dosen");
                        // System.out.println("Halaman mahasiswa ");
                        // System.out.println("====================");
                        // System.out.println("Pilihan Menu" 
                        //                         "1. Upload Nilai"
                        //                         "2. Presensi Mahasiwa"
                        //                         "3. Upload RPS");
                        // System.out.println("====================");
                            break;
                        
                        default:
                    }
                        
                }  
            } while (trial<=max);
        } while (!found);
        input.close();
    }
}

