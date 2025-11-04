package joobsheet7;
import java.util.Scanner;
public class tugasParkir28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenis, durasi;
        int total = 0;
        System.out.println("===== PROGRAM PARKIR KENDARAAN =====");
        while (true) {
            System.out.print("Masukkan jenis kendaraan (Mobil / Motor / out): ");
            String jenisKendaraan = sc.next();
            if (jenisKendaraan.equalsIgnoreCase("out")) {
                break;
            } else if (jenisKendaraan.equalsIgnoreCase("Mobil")) {
                jenis = 1;
            } else if (jenisKendaraan.equalsIgnoreCase("Motor")) {
                jenis = 2;
            } else {
                System.out.println("Jenis kendaraan tidak valid!");
                continue;
            }
            System.out.print("Masukkan durasi parkir (jam): ");
            durasi = sc.nextInt();
            if (durasi > 5) {
                total += 12500;
            } else if (jenis == 1) {
                total += durasi * 3000;
            } else if (jenis == 2) {
                total += durasi * 2000;
            } else {
                System.out.println("Jenis kendaraan tidak valid!");
            }
            System.out.println();
        }
        System.out.println("====================================");
        System.out.println("Total biaya parkir: Rp " + total);
        System.out.println("====================================");
    }
}
