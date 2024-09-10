class AlatTulis {
    private String nama;
    private int stok, hargaSatuan, hargaTotal;

    // Setter
    public void setData(String nama, int stok, int hargaSatuan) {
        this.nama = nama;
        this.stok = stok;
        this.hargaSatuan = hargaSatuan;
        this.hargaTotal = stok * hargaSatuan;
    }

    // Getter 
    public void getData() {
        System.out.println("Nama: " + this.nama);
        System.out.println("Stok: " + this.stok);
        System.out.println("Harga Satuan: Rp. " + this.hargaSatuan);
        System.out.println("Harga Total: Rp. " + this.hargaTotal);
        System.out.println();
    }

    // Getter untuk mendapatkan harga total 
    public int getHargaTotal() {
        return this.hargaTotal;
    }
}

class TotalHarga {
    private int totalHarga;

    // Setter 
    public void setTotalHarga(AlatTulis[] alatTulisList) {
        this.totalHarga = 0;
        for (int i = 0; i < alatTulisList.length; i++) {
            this.totalHarga += alatTulisList[i].getHargaTotal();
        }
    }
    

    // Getter 
    public void getTotalHarga() {
        System.out.println("Total Harga Semua Alat Tulis: Rp. " + this.totalHarga);
    }
}

public class Main {
    public static void main(String[] args) {
        AlatTulis bolpoint = new AlatTulis();
        AlatTulis pensil = new AlatTulis();
        AlatTulis penghapus = new AlatTulis();

        bolpoint.setData("Bolpoint", 10, 2000);
        pensil.setData("Pensil", 10, 1000);
        penghapus.setData("Penghapus", 10, 500);

        bolpoint.getData();
        pensil.getData();
        penghapus.getData();

        AlatTulis[] alatTulisList = {bolpoint, pensil, penghapus};
        TotalHarga totalHarga = new TotalHarga();
        totalHarga.setTotalHarga(alatTulisList);
        totalHarga.getTotalHarga();
    }
}
