import java.util.Scanner;

public class InputData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] dataMahasiswa = new String [4][4];
        
        for (int i = 0; i < dataMahasiswa.length; i++){
            System.out.println("Masukkan data untuk mahasiswa ke-" + (i+1));

            System.out.print("Masukkan Nama: ");
            dataMahasiswa[i][0] = sc.nextLine();

            System.out.print("Masukkan NIM: ");
            dataMahasiswa[i][1] = sc.nextLine();

            System.out.print("Masukkan Jurusan: ");
            dataMahasiswa[i][2] = sc.nextLine();

            System.out.print("Masukkan Program Studi: ");
            dataMahasiswa[i][3] = sc.nextLine();

            System.out.println();
        }

        System.out.println("\nBerikut adalah Data Mahasiswa yang berhasil diinput: ");
        System.out.println();
        for (int i = 0; i < dataMahasiswa.length; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1) + ":");
            System.out.println("Nama: " + dataMahasiswa[i][0]);
            System.out.println("NIM: " + dataMahasiswa[i][1]);
            System.out.println("Jurusan: " + dataMahasiswa[i][2]);
            System.out.println("Program Studi: "+ dataMahasiswa[i][3]);
            System.out.println("===============================");
        }
}    
}

