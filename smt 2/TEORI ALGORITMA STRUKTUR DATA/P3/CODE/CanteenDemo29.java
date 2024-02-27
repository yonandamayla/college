import java.util.Scanner;

public class CanteenDemo29 {
    public static void main(String[] args) {
        Scanner sc29 = new Scanner(System.in);
        Item29[] items = new Item29[3];

        for (int i = 0; i < items.length; i++) {
            System.out.print("Masukkan nama (makanan/minuman) " + (i + 1) + ": ");
            String itemName = sc29.nextLine();
            System.out.print("Masukkan harga (makanan/minuman) " + (i + 1) + ": ");
            double itemPrice = sc29.nextDouble();
            System.out.print("Masukkan jumlah stock (makanan/minuman) " + (i + 1) + ": ");
            int itemStock = sc29.nextInt();

            sc29.nextLine();
            System.out.println();

            items[i] = new Item29(itemName, itemPrice, itemStock);
        }

        for (Item29 item : items) {
            item.displayInfo();
            System.out.println();
        }

        sc29.close();
    }
}

/*public class CanteenDemo29 {
    public static void main(String[] args) {
        Item29 items1 = new Item29 ("Nasi goreng", 15000, 10);
        Item29 items2 = new Item29("Donat gula", 3000, 20);
        Item29 items3 = new Item29 ("Cimory", 7000, 15);

        Item29[] items = new Item29[3];
        items[0] = items1;
        items[1] = items2;
        items[2] = items3;

        for (int i = 0; i < items.length; i++) {
            items[i].displayInfo();
            System.out.println();
        }
    }
}

kode program di atas untuk yang langsung inisialisasi items*/ 


