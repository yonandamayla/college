import java.util.Scanner;

public class LoginSiakad{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        String usernameAdmin = "admin";
        String passwordAdmin = "admin123";
        String usernameMahasiswa = "mahasiswa";
        String passwordMahasiswa = "mahasiswa456";
        String usernameDosen = "dosen";
        String passwordDosen = "dosen789";
      
        System.out.println("Masukan Username dan Password");
        System.out.print("Username   : ");
        String user = input.nextLine();
        System.out.print("Password   : ");
        String pw = input.nextLine();
            if (user.equals(usernameAdmin)){
                System.out.println("Username valid");
                if (pw.equals(passwordAdmin)){
                    System.out.println("Password valid");
                    System.out.println("Ini halaman admin");

                } else {
                    System.out.println("Password yang anda masukkan salah");
                }  
            } else if (user.equals(usernameMahasiswa)){
                System.out.println("Username valid");
                if (pw.equals(passwordMahasiswa)){
                    System.out.println("Password valid");
                    System.out.println("ini halaman mahasiswa");
                } else {
                    System.out.println("Password anda salah");
                }    
            } else if (user.equals(usernameDosen)) {
                System.out.println("Username valid");
                if (pw.equals(passwordDosen)){
                    System.out.println("Password valid");
                    System.out.println("ini halaman dosen");
                } else {
                    System.out.println("Password yang anda masukkan salah");
                }
            } else ("Username tidak tersedia");
        }
    }
}
