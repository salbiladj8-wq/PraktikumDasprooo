package joobsheet5;
import java.util.Scanner;
public class ifCetakKRS28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Cetak KRS SIAKAD ----");
        System.out.println("Apakah UKT sudah Lunas? (true/false):");
        boolean uktLunas = sc.nextBoolean();
        if (uktLunas) {
            System.out.println("Pembayaran UKT terverifikasi");
            System.out.println("Silahkan cetak KRS dan minta tanda tangan");
            System.out.println("Silahkan cetak KRS dan minta tanda tangan DPA");
        } else {
            System.out.println("Registrasi ditolak, silahkan lunasi UKT terlebih dahulu");
        }

    }
}
