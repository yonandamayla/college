import java.util.Scanner;

public class UpdateBiodataMahasiswa {

    public static void main(String[] args) {
        // Inisialisasi data mahasiswa dalam array 2 dimensi
        String[][] dataMahasiswa = {
            {"Nama", "John Doe"},
            {"NIM", "123456"},
            {"Jurusan", "Teknik Informatika"},
            {"Alamat", "Jl. Raya No. 123"},
            {"Nomor Telepon", "08123456789"},
            {"Email", "john@example.com"}
        };

        Scanner input = new Scanner(System.in);

        // Menampilkan pilihan untuk memperbarui biodata
        System.out.println("Pilih data apa yang ingin diubah:");
        for (int i = 0; i < dataMahasiswa.length; i++) {
            System.out.println((i + 1) + ". " + dataMahasiswa[i][0]);
        }

        // Meminta input pilihan dari user
        System.out.print("Masukkan angka pilihan: ");
        int pilihan = input.nextInt();

        // Memperbarui data biodata
        System.out.print("Masukkan data " + dataMahasiswa[pilihan - 1][0] + " baru: ");
        String newData = input.next();
        dataMahasiswa[pilihan - 1][1] = newData;

        input.close();

        // Menampilkan biodata mahasiswa yang baru setelah diperbarui
        System.out.println("\nBiodata Mahasiswa Baru:");
        for (String[] biodata : dataMahasiswa) {
            System.out.println(biodata[0] + ": " + biodata[1]);
        }
    }
}
