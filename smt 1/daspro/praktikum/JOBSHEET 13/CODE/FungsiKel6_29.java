import java.util.Scanner;

public class FungsiKel6_29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlahMahasiswa = scanner.nextInt();

        System.out.print("Masukkan jumlah mata kuliah : ");
        int jumlahMatkul = scanner.nextInt();

        int[][] nilaiTugas = new int[jumlahMahasiswa][jumlahMatkul];
        String[] namaMahasiswa = new String[jumlahMahasiswa];

        // Input nilai mahasiswa
        inputDataNilaiMahasiswa(namaMahasiswa, nilaiTugas);

        // Menampilkan nilai mahasiswa
        tampilkanNilaiMahasiswa(namaMahasiswa, nilaiTugas);

        // Input data mahasiswa
        System.out.println();
        String nama = inputDataMahasiswa("Nama Mahasiswa: ");
        String nim = inputDataMahasiswa("NIM Mahasiswa: ");
        String prodi = inputDataMahasiswa("Prodi Mahasiswa: ");

        // Menampilkan data mahasiswa dalam bentuk tabel
        tampilkanDataMahasiswa(nama, nim, prodi);

        scanner.close();
    }
    

    // FITUR : INPUT DATA MAHASISWA
    // Fungsi untuk menginputkan nilai data mahasiswa
    public static void inputDataNilaiMahasiswa(String[] namaMahasiswa, int[][] nilaiTugas) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < namaMahasiswa.length; i++) {
            System.out.print("Masukkan nama mahasiswa ke-" + (i + 1) + ": ");
            namaMahasiswa[i] = scanner.nextLine();

            for (int j = 0; j < nilaiTugas[i].length; j++) {
                System.out.printf("Masukkan nilai untuk matkul ke-%d: ", j + 1);
                nilaiTugas[i][j] = scanner.nextInt();
            }
            scanner.nextLine();
        }
    }

    // Fungsi untuk menampilkan seluruh nilai mahasiswa
    public static void tampilkanNilaiMahasiswa(String[] namaMahasiswa, int[][] nilaiTugas) {
        System.out.println("\nNilai Mahasiswa:");
        System.out.println("-----------------------------------------");
        System.out.printf("| %-15s |", "Nama Mahasiswa");
        for (int i = 1; i <= nilaiTugas[0].length; i++) {
            System.out.printf(" Matkul %d |", i);
        }
        System.out.println("\n-----------------------------------------");

        for (int i = 0; i < namaMahasiswa.length; i++) {
            System.out.printf("| %-15s |", namaMahasiswa[i]);
            for (int j = 0; j < nilaiTugas[i].length; j++) {
                System.out.printf(" %-8d |", nilaiTugas[i][j]);
            }
            System.out.println("\n-----------------------------------------");
        }
    }

    // FITUR INPUT DATA MAHASISWA
    // Fungsi untuk input data mahasiswa
    private static String inputDataMahasiswa(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextLine();
    }

    // Fungsi untuk menampilkan data mahasiswa dalam bentuk tabel
    public static void tampilkanDataMahasiswa(String nama, String nim, String prodi) {
        System.out.println("=====================================");
        System.out.println("|          Data Mahasiswa           |");
        System.out.println("=====================================");
        System.out.println("| Nama          | " + padRight(nama, 15) + " |");
        System.out.println("| NIM           | " + padRight(nim, 15) + " |");
        System.out.println("| Prodi         | " + padRight(prodi, 15) + " |");
        System.out.println("=====================================");
    }

    // Fungsi untuk menambahkan spasi di sebelah kanan
    private static String padRight(String input, int length) {
        return String.format("%-" + length + "s", input);
    }
}
