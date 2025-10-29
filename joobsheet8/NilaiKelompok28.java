package joobsheet8;
import java.util.Scanner;
public class NilaiKelompok28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1, j, nilai;
        float ttlNilai, rtrtNilai;
        // perulangan 6 kelompok
        while (i <= 6) {
            System.out.println("Kelompok " + i);
            ttlNilai = 0;
            // perulangan untuk 5 penilai
            for (j = 1; j <= 5; j++) {
                System.out.print(" Nilai dari kelompok penilai " + j + ": ");
                nilai = sc.nextInt();
                ttlNilai += nilai;
            }
            rtrtNilai = ttlNilai / 5;
            System.out.print("Kelompok " + i + ": nilai rata-rata = " + rtrtNilai);
            System.out.println(); 
            i++;
        }
    }
}
