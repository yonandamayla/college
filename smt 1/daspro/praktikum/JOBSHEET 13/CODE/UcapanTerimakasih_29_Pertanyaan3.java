import java.util.Scanner;

public class UcapanTerimakasih_29_Pertanyaan3 {
    public static String PenerimaUcapan() {
        Scanner sc29 = new Scanner (System.in);
        System.out.print("Tuliskan NAMA orang yang ingin anda beri ucapan : ");
        String namaOrang = sc29.nextLine();
        sc29.close();
        return namaOrang;
    }

    public static void UcapanTerimaKasih() {
        String nama = PenerimaUcapan();
        System.out.println("Thank you " + nama + " for being the best teacher in the world.\n" + 
        "You inspired in me a love for learning and made me feel like i could ask you anything.");
        UcapanTambahan("Wish me luck " + nama);
    }

    public static void UcapanTambahan(String ucapan) {
        System.out.println(ucapan);
    }
    
    public static void main(String[] args) {
        UcapanTerimaKasih();
    }
}
