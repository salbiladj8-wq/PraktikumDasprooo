package joobsheet11;
import java.util.Scanner;
public class Siakad28 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMatkul = sc.nextInt();
        int [][] nilai = new int [jumlahMahasiswa][jumlahMatkul];
        for (int i = 0; i < nilai.length; i++){
            System.out.println(" Input Nilai Mahasiswa Ke- " + (i + 1));
            double totalPersiswa = 0;
            for (int j = 0; j < nilai[i].length; j++){
                System.out.print(" Nilai Mata Kuliah ke- " + (j + 1) + ": ");
                nilai [i][j] = sc.nextInt();
                totalPersiswa += nilai [i][j];
            }
            System.out.println(" Nilai rata-rata: " + (totalPersiswa / jumlahMatkul));
            System.out.println();
        }
        System.out.println("\n=======================================");
        System.out.println("Rata-rata Nilai Setiap Mata Kuliah");
        for (int j = 0; j < jumlahMatkul; j++){
            double totalPermatkul = 0;
            for (int i = 0; i < jumlahMahasiswa; i++){
                totalPermatkul += nilai[i][j];
            }
            System.out.println("Mata Kuliah " + (j+1) + ": " + (totalPermatkul / jumlahMahasiswa));
        }
    }
}