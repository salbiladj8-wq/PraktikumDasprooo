package joobsheet9;
import java.util.Scanner;
public class pesananMakan28 {
     public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan jumlah pesanan: ");
        int jumlah = sc.nextInt();
        sc .nextLine();
        String [] pesanan = new String [jumlah];
        double [] harga = new double [jumlah];
        double  total = 0;
        for   (int i=0; i<pesanan.length; i++){
            System.out.print("Masukkan nama pesanan ke-"+i+": ");
            pesanan[i] = sc.nextLine();
            System.out.print("Masukkan harga pesanan ke-"+i+": ");
            harga[i] = sc.nextDouble();
            sc.nextLine();
            total += harga[i];
        }
        System.out.println("\nDaftar Pesanan:");
        for (int i=0; i< jumlah; i++){
            System.out.println((i+1)+". "+pesanan[i]+" - Rp "+harga[i]);
        }
        System.out.println("Total Harga: Rp "+total);
    }
}
