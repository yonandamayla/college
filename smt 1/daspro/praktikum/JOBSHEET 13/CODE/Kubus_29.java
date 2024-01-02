import java.util.Scanner;

public class Kubus_29 {
    public static int hitungVolume(int sisi) {
        return sisi * sisi * sisi;
    }

    public static int hitungLuasPermukaan(int sisi) {
        return 6 * sisi * sisi;
    }

    public static void main(String[] args) {
        int sisiKubus;
        Scanner sc29 = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi kubus (bilangan positif): ");
        sisiKubus = sc29.nextInt();

        while (sisiKubus <= 0) {
            System.out.print("Masukkan sisi kubus kembali (bilangan positif) : ");
            sisiKubus = sc29.nextInt();

            if (sisiKubus >= 0) {
                int volume = hitungVolume(sisiKubus);
                int luasPermukaan = hitungLuasPermukaan(sisiKubus);

                System.out.println("Volume Kubus: " + volume);
                System.out.println("Luas Permukaan Kubus: " + luasPermukaan);
            } else {
                while (sisiKubus <= 0) {
                    System.out.print("Masukkan sisi kubus kembali (bilangan positif : ");
                    sisiKubus = sc29.nextInt();

                    if (sisiKubus >= 0) {
                        int volume = hitungVolume(sisiKubus);
                        int luasPermukaan = hitungLuasPermukaan(sisiKubus);

                        System.out.println("Volume Kubus: " + volume);
                        System.out.println("Luas Permukaan Kubus: " + luasPermukaan);
                    }
                }
                break;
            }
            break;
        }
        sc29.close();
    }
}