import java.util.Scanner;

public class LoginLooping {
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
           
        boolean autentikasi = false;
        int x = 1;
        while (x <= 3 && !autentikasi) {
            if (x == 1 && user.equals(usernameAdmin) && pw.equals(passwordAdmin)) {
                autentikasi = true;
            } else if (x == 2 && user.equals(usernameMahasiswa) && pw.equals(passwordMahasiswa)) {
                autentikasi = true; 
            } else if (x == 3 && user.equals(usernameDosen) && pw.equals(passwordDosen)) {
                autentikasi = true; 
            }
            x++;
     }
     if (autentikasi) {
        System.out.println("Login Berhasil!");
        // ini untuk code tampilan jika user berhasil login
     } else {
        System.out.println("Login Gagal, mohon cek username dan password");
     }
    }
}
