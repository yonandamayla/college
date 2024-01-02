import java.util.Scanner;

public class KonversiNilai{
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int nilai;
    System.out.print("Masukkan nilai (0-100): ");
    nilai = sc.nextInt();
    
    if (nilai >=0 && nilai <=100){
        if (nilai >= 90 && nilai <= 100) {
        System.out.print("Grade A");
     }else if (nilai >=80 && nilai <=89) {
        System.out.print("Grade B");
     }else if (nilai >=60 && nilai <=79) {
        System.out.print("Grade C");
     }else if (nilai >=50 && nilai <=59) {
        System.out.print("Grade D");
     }else {
        System.out.println("Grade E");
     }
    }else {
        System.out.println("Tidak Valid");
    }
    }
} 
