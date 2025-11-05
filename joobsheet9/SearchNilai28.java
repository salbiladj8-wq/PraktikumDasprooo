package joobsheet9;
import java.util.Scanner;
public class SearchNilai28 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        int banyakNilai = sc.nextInt();
        int [] arrNilai = new int [banyakNilai];
        for (int i = 0; i < banyakNilai; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            arrNilai[i] = sc.nextInt();
        }
        System.out.print("Masukkan nilai yang dicari: ");
        int key = sc.nextInt();
        int hasil = 0;
        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai [i]) {
                hasil = i;
                break;
            }
        }
        System.out.println ();
        if (hasil != 0) {
            System.out.println("Nilai " + key + " Ketemu, merupakan nilai mahasiswa ke-" + (hasil + 1) + ".");
        } else {
            System.out.println(" Nilai yang dicari tidak ditemukan.");
    }    
}
}