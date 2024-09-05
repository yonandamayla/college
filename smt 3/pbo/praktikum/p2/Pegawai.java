public class Pegawai {
    String nama, jabatan;
    double idPegawai, gajiKotor, potongan;

    public double getGajiBersih() {
        return gajiKotor - potongan * gajiKotor;
    }

    public void displayInfo() {
        System.out.println("ID Pegawai: " + idPegawai);
        System.out.println("Nama: " + nama);
        System.out.println("Jabatan: " + jabatan);
        System.out.println("Gaji Kotor: " + gajiKotor);
        System.out.println("Potongan: " + potongan);
        System.out.println("Gaji Bersih: " + getGajiBersih());
    }

    public static void main(String[] args) {
        Pegawai p1 = new Pegawai();
        p1.idPegawai = 190302123;
        p1.nama = "Nadia";
        p1.jabatan = "Pegawai";
        p1.gajiKotor = 5000000;
        p1.potongan = 0.1;

        p1.displayInfo();
        System.out.println();

        Pegawai p2 = new Pegawai();
        p2.idPegawai = 190302124;
        p2.nama = "Rizky";
        p2.jabatan = "Pegawai";
        p2.gajiKotor = 6000000;
        p2.potongan = 0.1;

        p2.displayInfo();
        System.out.println();

        Pegawai p3 = new Pegawai();
        p3.idPegawai = 190302125;
        p3.nama = "Rizal";
        p3.jabatan = "Manajer";
        p3.gajiKotor = 12000000;
        p3.potongan = 0.1;

        p3.displayInfo();
    }
}
