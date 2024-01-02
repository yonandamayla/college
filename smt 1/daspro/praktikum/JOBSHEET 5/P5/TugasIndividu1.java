import java.util.Scanner;
public class TugasIndividu1 {
   public static void main(String[] args) {
    Scanner input29 = new Scanner (System.in);
    int jarak;

    System.out.println("Masukkan jarak anda: ");
    jarak = input29.nextInt();
    if(jarak <= 5){
    System.out.println("Gunakan melee weapon");
    } else if (jarak > 5){
    System.out.println("Gunakan ranged weapon");
    }
   }
}