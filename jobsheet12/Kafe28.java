package jobsheet12;
import java.util.Scanner;
public class Kafe28 {
    public static void Menu() {
        System.out.println("\n=== MENU KAFE ===");
        System.out.println("1. Kopi Hitam     - 15000");
        System.out.println("2. Cappuccino     - 20000");
        System.out.println("3. Latte          - 22000");
        System.out.println("4. Teh Manis      - 12000");
        System.out.println("5. Air Mineral    - 10000");
        System.out.println("6. Coklat Panas   - 18000");
        System.out.println("=====================");
    }
    public static int hargaTotal(int pilihanMenu, int banyakItem, String kodePromo) {
        int [] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        int harga = hargaItems[pilihanMenu - 1] * banyakItem;
        int diskon = 0;

        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            diskon = harga * 50 / 100;
            System.out.println("Promo: dapatkan diskon 50%.");
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            diskon = harga * 30 / 100;
            System.out.println("Promo: dapatkan diskon 30%.");
        } else {
            System.out.println("Promo: kode invalid.");
        }

        return harga - diskon;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalKeseluruhan = 0;
        String ulang;
        do {
            Menu();
            System.out.print("Pilih menu (1-6): ");
            int pilihanMenu = sc.nextInt();
            System.out.print("Jumlah pesanan: ");
            int banyakItem = sc.nextInt();
            sc.nextLine();
            System.out.print("Masukkan kode promo: ");
            String kodePromo = sc.nextLine();
            int totalHarga = hargaTotal(pilihanMenu, banyakItem, kodePromo);
            System.out.println("Total harga: Rp " + totalHarga);
            totalKeseluruhan += totalHarga;
            System.out.print("Ingin memesan lagi? (ya/tidak): ");
            ulang = sc.nextLine();
        } while (ulang.equalsIgnoreCase("ya"));
        System.out.println("\nTotal keseluruhan: Rp " + totalKeseluruhan);
    }
}
