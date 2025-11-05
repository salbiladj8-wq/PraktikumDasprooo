package joobsheet9;
import java.util.Scanner;
public class ArrayRataNilai28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa:");
        int jmlMhs = sc.nextInt();
        int [] nilaiMhs = new int [jmlMhs];
        double totalLulus = 0, totalTidaklulus = 0;
        int jmlhLls = 0, jmlhTdkLls = 0;
        for (int i = 0; i < nilaiMhs.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
            if (nilaiMhs[i] > 70){
                jmlhLls++;
                totalLulus += nilaiMhs[i];
            }else{
                jmlhTdkLls++;
                totalTidaklulus += nilaiMhs[i];
            }
        }
        double rataLulus = (jmlhLls > 0) ? totalLulus / jmlhLls : 0;
        double rataTidakLulus = (jmlhTdkLls > 0) ? totalTidaklulus / jmlhTdkLls : 0;
        System.out.println("Rata-rata nilai lulus: " + rataLulus);
        System.out.println("Rata-rata nilai tidak lulus: " + rataTidakLulus);
        System.out.println("Jumlah mahasiswa yang lulus: " + jmlhLls);
        System.out.println("Jumlah mahasiswa yang tidak lulus: " + jmlhTdkLls);
    }
}
