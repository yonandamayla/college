import java.util.Scanner;

public class UpdateUserData {

    public static void main(String[] args) {
        String[][] userData = {
            {"Admin", "Admin123"},
            {"Dosen", "Dosen456"},
            {"MahasiswaYonanda", "yonanda789", "2341760184", "082139631334", "islam", "P", "05/05/2005"},
            {"MahasiswaDhynar", "dhynar789"},
            {"MahasiswaAfril", "afril789"},
            {"MahasiswaRama", "rama789"}
        };

        Scanner input = new Scanner(System.in);

        // Menampilkan pilihan pengguna yang data-nya bisa diubah
        System.out.println("Pilih pengguna untuk memperbarui data:");
        for (int i = 2; i < userData.length; i++) {
            System.out.println((i - 1) + ". " + userData[i][0]);
        }

        // Meminta input pilihan pengguna dari user
        System.out.print("Masukkan angka pilihan: ");
        int pilihan = input.nextInt();

        // Memperbarui data pengguna
        if (pilihan > 0 && pilihan <= userData.length) {
            String[] selectedUser = userData[pilihan + 1];
            System.out.println("Data yang tersedia untuk pengguna " + selectedUser[0] + ":");

            for (int j = 1; j < selectedUser.length; j++) {
                System.out.println(j + ". " + selectedUser[j]);
            }

            System.out.print("Masukkan angka data yang ingin diubah: ");
            int dataChoice = input.nextInt();

            if (dataChoice > 0 && dataChoice < selectedUser.length) {
                System.out.print("Masukkan data baru: ");
                String newData = input.next();
                selectedUser[dataChoice] = newData;
            }
        } else {
            System.out.println("Pilihan tidak valid.");
        }

        input.close();

        // Menampilkan data pengguna yang baru setelah diperbarui
        System.out.println("\nData Pengguna Baru:");
        for (String[] user : userData) {
            for (String data : user) {
                System.out.print(data + " ");
            }
            System.out.println();
        }
    }
}
