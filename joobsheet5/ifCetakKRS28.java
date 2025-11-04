package joobsheet5;
import java.util.Scanner;
public class ifCetakKRS28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Cetak KRS SIAKAD ----");
        System.out.println("Apakah UKT sudah Lunas? (true/false):");
        boolean uktLunas = sc.nextBoolean();
        String x = (uktLunas) ? "Pembayaran UKT terverifikasi" :  "Registrasi ditolak, silahkan lunasi UKT terlebih dahulu";
        System.out.println(x);
           
        } 
}
