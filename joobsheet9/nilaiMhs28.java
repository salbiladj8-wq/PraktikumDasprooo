package joobsheet9;
import java.util.Scanner;
public class nilaiMhs28 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = sc.nextInt();
        int [] nilai = new int [jumlah];
        int total = 0;
        int tertinggi = 0;
        int terendah = 0;
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai[i] = sc.nextInt();
            total += nilai[i];
            if (i == 0) {
                tertinggi = nilai[i];
                terendah = nilai[i];
            }
            if (nilai[i] > tertinggi) {
                tertinggi = nilai[i];
            }
            if (nilai[i] < terendah) {
                terendah = nilai[i];
            }   
        }
        double rata2 = (double) total / nilai.length;
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == tertinggi) {
                System.out.println("Nilai tertinggi Mahasiswa ke-" + i + " dengan nilai " + nilai[i]);
            }
        }
        System.out.println("\nNilai rata rata: " + rata2);
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
    }
}
