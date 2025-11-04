package joobsheet7;
import java.util.Scanner;
public class tugasTiket28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hargaTiket = 50000;
        int jumlahTiket;
        String namaPelanggan;
        double totalSemua = 0;
        do {
            System.out.print("Masukkan nama pelanggan (ketik 'selesai' untuk keluar): ");
            namaPelanggan = sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("selesai")) {
                System.out.println("\nTransaksi selesai untuk hari ini.");
                break;
            }
            System.out.print("Masukkan jumlah tiket yang dibeli: ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid! Silakan input ulang.\n");
                sc.nextLine();
                continue;
            }
            double diskon = 0;
            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
            }
            double totalHarga = jumlahTiket * hargaTiket;
            double potongan = totalHarga * diskon;
            double bayar = totalHarga - potongan;
            System.out.println("Diskon yang didapat: " + (diskon * 100) + "%");
            System.out.println("Total yang harus dibayar adalah Rp " + bayar + "\n");
            totalSemua += bayar;
            sc.nextLine();
        } while (true);
        System.out.println("=======================================");
        System.out.println("Total Penjualan: Rp " + totalSemua);
        System.out.println("=======================================");
    }
}
