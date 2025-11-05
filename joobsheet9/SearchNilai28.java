package joobsheet9;
import java.util.Scanner;
public class SearchNilai28 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan jumlah elemen array: ");
        int jmlElmn = sc.nextInt();
        int [] arrNilai = new int [jmlElmn];
        for (int i = 0; i < jmlElmn; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            arrNilai[i] = sc.nextInt();
        }
        System.out.print("Masukkan nilai yang dicari: ");
        int key = sc.nextInt();
        int hasil = -1;
        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai [i]) {
                hasil = i;
                break;
            }
        }
        System.out.println ();
        if (hasil != -1) {
            System.out.println("Nilai " + key + " Ketemu di indeks ke-" + hasil + ".");
        } else {
            System.out.println("Nilai " + key + "  Tidak ditemukan dalam array.");
        }
    }    
}
