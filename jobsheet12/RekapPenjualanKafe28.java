package jobsheet12;
import java.util.Scanner;
public class RekapPenjualanKafe28 {
    public static int[][] inputDataPenjualan(Scanner scanner, int jumlahMenu, int jumlahHari) {
        int[][] penjualan = new int[jumlahMenu][jumlahHari];
        String[] namaMenu = {"Kopi", "Teh", "Es Kelapa Muda", "Roti Bakar", "Gorengan"};
        System.out.println("Masukkan data penjualan:");
        for (int i = 0; i < jumlahMenu; i++) {
            System.out.println("\nMenu: " + namaMenu[i]);
            for (int j = 0; j < jumlahHari; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                penjualan[i][j] = scanner.nextInt();
            }
        }
        return penjualan;
    }
    public static void tampilkanDataPenjualan(int[][] penjualan) {
        String[] namaMenu = {"Kopi", "Teh", "Es Kelapa Muda", "Roti Bakar", "Gorengan"};
        System.out.println("\n=== REKAP PENJUALAN KAFE ===");
        // Kolom
        System.out.printf("%-15s", "Menu/Hari");
        for (int j = 0; j < penjualan[0].length; j++) {
            System.out.printf("%-10s", "Hari " + (j + 1));
        }
        System.out.println();
        // tabel
        for (int i = 0; i < penjualan.length; i++) {
            System.out.printf("%-15s", namaMenu[i]);
            for (int j = 0; j < penjualan[i].length; j++) {
                System.out.printf("%-10d", penjualan[i][j]);
            }
            System.out.println();
        }
    }
    public static void tampilkanMenuTerlaris(int[][] penjualan) {
        String[] namaMenu = {"Kopi", "Teh", "Es Kelapa Muda", "Roti Bakar", "Gorengan"};
        int[] totalPenjualan = new int[penjualan.length];
        for (int i = 0; i < penjualan.length; i++) {
            for (int j = 0; j < penjualan[i].length; j++) {
                totalPenjualan[i] += penjualan[i][j];
            }
        }
        int maxIndex = 0;
        for (int i = 1; i < totalPenjualan.length; i++) {
            if (totalPenjualan[i] > totalPenjualan[maxIndex]) {
                maxIndex = i;
            }
        }
        System.out.println("\n=== MENU TERLARIS ===");
        System.out.println("Menu            : " + namaMenu[maxIndex]);
        System.out.println("Total Penjualan : " + totalPenjualan[maxIndex] + " porsi");
    }
    public static void tampilkanRataRataPenjualan(int[][] penjualan) {
        String[] namaMenu = {"Kopi", "Teh", "Es Kelapa Muda", "Roti Bakar", "Gorengan"};

        System.out.println("\n=== RATA-RATA PENJUALAN ===");

        for (int i = 0; i < penjualan.length; i++) {
            double total = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                total += penjualan[i][j];
            }
            double rataRata = total / penjualan[i].length;
            System.out.printf("%-15s: %.2f porsi/hari\n", namaMenu[i], rataRata);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] penjualan = {
            {20, 20, 25, 20, 10, 60, 10},
            {30, 80, 40, 10, 15, 20, 25},
            {5, 9, 20, 25, 10, 5, 45},
            {50, 8, 17, 18, 10, 30, 6},
            {15, 10, 16, 15, 10, 10, 55}
        };
        tampilkanDataPenjualan(penjualan);
        tampilkanMenuTerlaris(penjualan);
        tampilkanRataRataPenjualan(penjualan);
        scanner.close();
    }
}