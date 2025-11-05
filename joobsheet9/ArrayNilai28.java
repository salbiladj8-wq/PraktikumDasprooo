package joobsheet9;
import java.util.Scanner;
public class ArrayNilai28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int [] nilaiAkhir = new int [10];
        for (int i = 0; i < 10; i++){
            System.out.print("Masukkan nilai akhir mahasiswa ke-" + i + ": ");
            nilaiAkhir[i] = sc.nextInt();
        }for (int i = 0; i < nilaiAkhir.length; i++){
            if (nilaiAkhir [i] > 70)
            System.out.println("Nilai akhir ke-" + i + " lulus! ");

        } 
    }
}

