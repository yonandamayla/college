import java.util.Scanner;

public class Mahasiswa29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama, jenisKelamin;
        int count = 0;
        String output = "";
        
        while (count < 2 ) {
            System.out.print("Masukkan nama mahasiswa: ");
            nama = input.nextLine();
            System.out.print("Masukkan jenis kelamin mahasiswa (L/P): ");
            jenisKelamin = input.nextLine();
            
            if (jenisKelamin.equalsIgnoreCase("P")) {
                output += nama + "\n";
            }

            count++;
        }
        
        System.out.println("Nama-nama mahasiswa perempuan:");
        System.out.println(output);
    }
}