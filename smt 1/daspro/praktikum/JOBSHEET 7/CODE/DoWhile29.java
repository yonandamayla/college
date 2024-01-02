import java.util.Scanner;

public class DoWhile29 {
    public static void main(String[] args) {
        Scanner input29 = new Scanner (System.in);

        int x = 0;
        do {
            System.out.println(x);
        } while (++x <= 8);
        System.out.println(" Program berhenti");
    }
}
// program ini akan mengeprint x dahulu yaitu x = 0
// selanjutnya print x yang bernilai 0 tadi memenuhi <= 8 maka ia akan ditambah 1 lagi dan akan diprint kembali hingga nilainya > 8 maka program tidak akan mengeprint lagi 
