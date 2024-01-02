import java.util.Scanner;

public class LoginSiakad {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        String username = "admin";
        int password = 666;
        System.out.println("Masukan Username dan Password");
        System.out.println("Username   : ");
        String user = input.nextLine();
        System.out.println("Password   : ");
        int pw = input.nextInt();
        if (username == username && pw == password){
            System.out.println("Selamat Anda Berhasil Login");
        }else{
            System.out.println("Harap cek kembali username dan password anda");
        }
    }
}