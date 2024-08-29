class Lemari {
    // Atribut
    private String bahan;
    private String warna;
    private double tinggi;
    private double lebar;
    private int jumlahPintu;
    private double kapasitas;

    // Constructor
    public Lemari(String bahan, String warna, double tinggi, double lebar, int jumlahPintu, double kapasitas) {
        this.bahan = bahan;
        this.warna = warna;
        this.tinggi = tinggi;
        this.lebar = lebar;
        this.jumlahPintu = jumlahPintu;
        this.kapasitas = kapasitas;
    }

    // Method
    public void bukaPintu() {
        System.out.println("Pintu lemari dibuka.");
    }

    public void tutupPintu() {
        System.out.println("Pintu lemari ditutup.");
    }

    public void masukkanBarang(double beratBarang) {
        if (kapasitas >= beratBarang) {
            kapasitas -= beratBarang;
            System.out.println("Barang dengan berat " + beratBarang + " kg telah dimasukkan ke lemari.");
        } else {
            System.out.println("Tidak ada cukup kapasitas untuk barang ini.");
        }
    }

    public void keluarkanBarang(double beratBarang) {
        kapasitas += beratBarang;
        System.out.println("Barang dengan berat " + beratBarang + " kg telah dikeluarkan dari lemari.");
    }

    public void tampilkanKapasitas() {
        System.out.println("Kapasitas lemari yang tersisa: " + kapasitas + " kg.");
    }

    public void cetakInformasi() {
        System.out.println("Lemari - Bahan: " + bahan + ", Warna: " + warna + ", Tinggi: " + tinggi + " m, Lebar: "
                + lebar + " m, Jumlah Pintu: " + jumlahPintu);
    }
}

class LemariEs extends Lemari {
    private double suhu; // atribut baru

    // Constructor
    public LemariEs(String bahan, String warna, double tinggi, double lebar, int jumlahPintu, double kapasitas,
            double suhu, boolean freezer) {
        super(bahan, warna, tinggi, lebar, jumlahPintu, kapasitas);
        this.suhu = suhu;
    }

    // Method baru untuk mengatur suhu
    public void aturSuhu(double suhuBaru) {
        suhu = suhuBaru;
        System.out.println("Suhu lemari es diatur menjadi: " + suhu + " derajat Celcius.");
    }

    public void cetakInformasi() {
        super.cetakInformasi();
        System.out.println("Suhu: " + suhu + " derajat Celcius");
    }
}

class LemariPakaian extends Lemari {
    private int jumlahGantungan; // atribut baru
    private boolean adaLaci; // atribut baru

    // Constructor
    public LemariPakaian(String bahan, String warna, double tinggi, double lebar, int jumlahPintu, double kapasitas,
            int jumlahGantungan, boolean adaLaci) {
        super(bahan, warna, tinggi, lebar, jumlahPintu, kapasitas);
        this.jumlahGantungan = jumlahGantungan;
        this.adaLaci = adaLaci;
    }

    // Method baru untuk menambahkan pakaian di gantungan
    public void tambahPakaian(int jumlah) {
        jumlahGantungan += jumlah;
        System.out.println(jumlah + " pakaian telah ditambahkan ke dalam lemari. Total gantungan: " + jumlahGantungan);
    }

    // Method baru untuk mengeluarkan pakaian dari gantungan
    public void keluarkanPakaian(int jumlah) {
        if (jumlahGantungan >= jumlah) {
            jumlahGantungan -= jumlah;
            System.out.println(jumlah + " pakaian telah dikeluarkan dari lemari. Total gantungan: " + jumlahGantungan);
        } else {
            System.out.println("Tidak cukup pakaian di gantungan untuk dikeluarkan.");
        }
    }

    // Method baru untuk memeriksa apakah ada laci di lemari
    public void cekLaci() {
        if (adaLaci) {
            System.out.println("Lemari pakaian ini memiliki laci.");
        } else {
            System.out.println("Lemari pakaian ini tidak memiliki laci.");
        }
    }
    
    public void cetakInformasi() {
        super.cetakInformasi();
        System.out.println("Jumlah Gantungan: " + jumlahGantungan);
        System.out.println("Ada Laci: " + (adaLaci ? "Ya" : "Tidak"));
    }
}

public class Main {
    public static void main(String[] args) {
        // Instansiasi objek untuk Lemari
        Lemari lemari1 = new Lemari("Kayu", "Coklat", 2.0, 1.5, 2, 50.0);
        System.out.println("===== Informasi Lemari =====");
        lemari1.cetakInformasi();
        lemari1.bukaPintu();
        lemari1.masukkanBarang(10.0);
        lemari1.tampilkanKapasitas();
        lemari1.keluarkanBarang(5.0);
        lemari1.tutupPintu();
        System.out.println();

        // Instansiasi objek untuk LemariPakaian
        LemariPakaian lemariPakaian1 = new LemariPakaian("Kayu", "Putih", 2.2, 1.8, 3, 80.0, 10, true);
        System.out.println("===== Informasi Lemari Pakaian =====");
        lemariPakaian1.cetakInformasi();
        lemariPakaian1.bukaPintu();
        lemariPakaian1.tambahPakaian(5);
        lemariPakaian1.cekLaci();
        lemariPakaian1.keluarkanPakaian(3);
        lemariPakaian1.tutupPintu();
        System.out.println();

        // Instansiasi objek untuk LemariEs
        LemariEs lemariEs1 = new LemariEs("Besi", "Silver", 1.8, 0.7, 1, 200.0, -18.0, true);
        System.out.println("===== Informasi Lemari Es =====");
        lemariEs1.cetakInformasi();
        lemariEs1.bukaPintu();
        lemariEs1.aturSuhu(-20.0);
        lemariEs1.tutupPintu();
    }
}
