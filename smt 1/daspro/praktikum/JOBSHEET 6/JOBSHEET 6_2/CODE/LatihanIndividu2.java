import java.util.Scanner;

public class LatihanIndividu227 {
    public static void main(String[] args) {
        Scanner sc27 = new Scanner(System.in);

        String buku;
        int jumlah;
        float diskon ,diskon1, jmlBayar, harga;

        System.out.print("Masukan jenis buku : ");
        buku = sc27.nextLine();

        if (buku.equalsIgnoreCase("kamus")) {
            diskon = 0.1f;
            System.out.print("Masukan jumlah yang dibeli : ");
            jumlah = sc27.nextInt();
            if (jumlah > 2 ) {
                diskon = diskon + 0.02f;
                System.out.print("Masukan harga : ");
                harga = sc27.nextInt();
                diskon1 = diskon * harga * jumlah;
                jmlBayar = (jumlah * harga) - diskon1;
                System.out.println("Jumlah diskon persen : " + diskon);
                System.out.println("Jumlah diskon rupiah : " + diskon1);
                System.out.println("Jumlah yang harus di bayar : " +jmlBayar);

            }else{
                diskon = 0.1f;
                System.out.println("Jumlah diskon : " + diskon);
                System.out.print("Masukan harga : ");
                harga = sc27.nextInt();
                diskon1 = diskon * harga * jumlah;
                jmlBayar = (jumlah * harga) - diskon1;
                System.out.println("Jumlah diskon persen : " + diskon);
                System.out.println("Jumlah diskon rupiah : " + diskon1);
                System.out.println("Jumlah yang harus di bayar : " +jmlBayar);
                
            }
            
        }else if (buku.equalsIgnoreCase("novel")) {
            diskon = 0.07f;
            System.out.println("Masukan jumlah yang di beli : ");
            jumlah = sc27.nextInt();
            if (jumlah > 3) {
                diskon = diskon + 0.02f;
                System.out.println("Jumlah diskon : " + diskon);
                System.out.println("Masukan harga : ");
                harga = sc27.nextInt();
                diskon1 = diskon * harga * jumlah;
                jmlBayar = (jumlah * harga) - diskon1;
                System.out.println("Jumlah diskon persen : " + diskon);
                System.out.println("Jumlah diskon rupiah : " + diskon1);
                System.out.println("Jumlah yang harus di bayar : " +jmlBayar);
            }else if (jumlah <=3) {
                diskon = diskon + 0.01f;
                System.out.println("Jumlah diskon : " + diskon);
                System.out.println("Masukan harga : ");
                harga = sc27.nextInt();
                diskon1 = diskon * harga * jumlah;
                jmlBayar = (jumlah * harga) - diskon1;
                System.out.println("Jumlah diskon persen : " + diskon);
                System.out.println("Jumlah diskon rupiah : " + diskon1);
                System.out.println("Jumlah yang harus di bayar : " +jmlBayar);
            }

            
        }else{
            System.out.println("Masukan jumlah buku");
            jumlah = sc27.nextInt();
            if (jumlah > 3) {
                diskon = 0.05f;
                System.out.println("Jumlah diskon : " + diskon);
                System.out.println("Masukan harga : ");
                harga = sc27.nextInt();
                diskon1 = diskon * harga * jumlah;
                jmlBayar = (jumlah * harga) - diskon1;
                System.out.println("Jumlah diskon persen : " + diskon);
                System.out.println("Jumlah diskon rupiah : " + diskon1);
                System.out.println("Jumlah yang harus di bayar : " +jmlBayar);
            }
        }


    }
}