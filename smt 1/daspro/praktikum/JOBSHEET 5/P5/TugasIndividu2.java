import java.util.Scanner;

public class TugasIndividu2 {
    public static void main(String[] args) {
        Scanner input29 = new Scanner(System.in);
        String username = "yonanda";
        int password = 123;

        System.out.println("Masukkan Username dan Password");
        System.out.print("Username    : ");
        String user = input29.nextLine();
        System.out.print("Password    : ");
        int pw = input29.nextInt();
        if (user.equals(username) && pw == password){
            System.out.println("Anda berhasil login!");
        }else{
            System.out.println("Harap cek kembali username dan password anda");
        }
    }
}