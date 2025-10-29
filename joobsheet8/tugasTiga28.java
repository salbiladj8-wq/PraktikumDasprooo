package joobsheet8;
import java.util.Scanner;
public class tugasTiga28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int keseluruhanPelanggan = 0;
        int totalItem = 0;
        System.out.print("Jumlah cabang kafe: ");
        int cabangKafe = sc.nextInt();
        System.out.println("\n=== Input Penjualan Per Cabang ===");
        for (int i=1; i <= cabangKafe; i++) {
            int pelangganPerCabang = 0;
            int itemPerCabang = 0;
            System.out.println("\n--- Cabang " + i + " ---");
            System.out.print("Jumlah pelanggan: ");
            int jumlahPelanggan = sc.nextInt();
            pelangganPerCabang += jumlahPelanggan;
            for (int j=1; j <= jumlahPelanggan; j++) {
                System.out.print("-Pelanggan " + j + " memesan berapa item? ");
                int itemPesan = sc.nextInt();
                itemPerCabang += itemPesan;
            }
            System.out.println("Cabang " + i + ":");
            System.out.println("-Pelanggan: " + pelangganPerCabang + " orang");
            System.out.println("-Item terjual: " + itemPerCabang);
            keseluruhanPelanggan += pelangganPerCabang;
            totalItem += itemPerCabang;
        }
        System.out.println("\n Total Seluruh Cabang");
        System.out.println("Pelanggan: " + keseluruhanPelanggan + " orang");
        System.out.println("Item terjual: " + totalItem + " item");
    }
}
