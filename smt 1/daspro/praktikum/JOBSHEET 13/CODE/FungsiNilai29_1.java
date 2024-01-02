import java.util.Scanner;

public class FungsiNilai29_1 {

    public static void main(String[] args) {
        int jumlahMatkul;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlahMahasiswa = scanner.nextInt();

        System.out.print("Masukkan jumlah mata kuliah : ");
        jumlahMatkul = scanner.nextInt();

        int[][] nilaiTugas = new int[jumlahMahasiswa][jumlahMatkul];
        String[] namaMahasiswa = new String[jumlahMahasiswa];

        inputDataNilaiMahasiswa(namaMahasiswa, nilaiTugas);
        tampilkanNilaiMahasiswa(namaMahasiswa, nilaiTugas);
        nilaiMahasiswaTertinggi(namaMahasiswa, nilaiTugas);

        scanner.close();
    }

    // fungsi untuk menginputkan nilai data mahasiswa
    public static void inputDataNilaiMahasiswa(String[] namaMahasiswa, int[][] nilaiTugas) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < namaMahasiswa.length; i++) {
            System.out.print("Masukkan nama mahasiswa ke-" + (i + 1) + ": ");
            namaMahasiswa[i] = scanner.nextLine();

            for (int j = 0; j < nilaiTugas.length; j++) {
                System.out.printf("Masukkan nilai untuk matkul ke-%d: ", j + 1);
                nilaiTugas[i][j] = scanner.nextInt();
            }
            scanner.nextLine();
        }
    }

    // fungsi untuk menampilkan seluruh nilai mahasiswa dari minggu ke 1 - 7
    public static void tampilkanNilaiMahasiswa(String[] namaMahasiswa, int[][] nilaiTugas) {
        System.out.println("\nNilai Mahasiswa:");
        System.out.println("-----------------------------------------");
        System.out.printf("| %-15s |", "Nama Mahasiswa");
        for (int i = 1; i <= nilaiTugas.length; i++) {
            System.out.printf(" Matkul %d |", i);
        }
        System.out.println("\n-----------------------------------------");

        for (int i = 0; i < namaMahasiswa.length; i++) {
            System.out.printf("| %-15s |", namaMahasiswa[i]);
            for (int j = 0; j < nilaiTugas.length; j++) {
                System.out.printf(" %-8d |", nilaiTugas[i][j]);
            }
            System.out.println("\n-----------------------------------------");
        }
    }

    public static void nilaiMahasiswaTertinggi(String[] namaMahasiswa, int[][] nilaiTugas) {
        int mahasiswaTertinggi = 0;
        int mingguTertinggi = 0;
        int nilaiTertinggi = 0;
        int nilaiTertinggiMingguan = 0;

        for (int i = 0; i < nilaiTugas[0].length; i++) {
            for (int j =0; i < namaMahasiswa.length; i++) {
                if (nilaiTugas[i][j] > nilaiTertinggiMingguan) {
                    nilaiTertinggiMingguan = nilaiTugas[i][j];
                    mahasiswaTertinggi = j;
                    mingguTertinggi = i-1;
                }
            }
            if (nilaiTertinggiMingguan > nilaiTertinggi) {
                nilaiTertinggi = nilaiTertinggiMingguan;
            }
        }

        System.out.println("Mahasiswa dengan nilai tertinggi yaitu : " + namaMahasiswa[mahasiswaTertinggi] + "dengan nilai " + nilaiTertinggi);
    }
}
