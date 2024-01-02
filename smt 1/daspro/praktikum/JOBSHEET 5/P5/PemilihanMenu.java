import java.util.Scanner;

public class PemilihanMenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner user = new Scanner(System.in);
        System.out.println("\n====== Pilihan Menu = ====\n" + 
        "1. Login akun SIAKAD \n" +
        "2. Input Data Mahasiswa\n" +
        "3. Update Data Mahasiswa \n" +
        "4. Jadwal Perkuliahan\n" +
        "5. Input Nilai Mahasiswa/n" +
        "6. Cetak KHS dan Nilai\n" +
        "Masukkan Pilihan : ");

        int getInput= input.nextInt();
        if (input.equals("1")) {
            System.out.println("Masukkan Username & Password");
        }
        
            case 2:
            // Input Data Mahasiswa
            System.out.println("Menginput data mahasiswa");
            break;

            case 3:
            // Update Data Mahasiswa
            System.out.println("Mengupdate data mahasiswa");
            break;

            case 4:
            // Jadwal Perkuliahan
            System.out.println("Masukkan jadwal perkuliahan");
            break;

            case 5:
            // Input Nilai Mahasiswa
            System.out.println("Menginput nilai mahasiswa");
            break;

            case 6:
            // Cetak KHS dan Nilai
            System.out.println("Silahkan mencetak KHS dan pelaporan nilai");
            break;
        }
    }
}
