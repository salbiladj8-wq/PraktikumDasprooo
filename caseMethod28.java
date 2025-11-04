import java.util.Scanner;
public class caseMethod28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===== INPUT DATA MAHASISWA =====");
        System.out.print("NAMA : ");
        String nama = sc.nextLine();
        System.out.print("NIM  : ");
        String nim = sc.nextLine();

        System.out.println("\n--- Mata Kuliah 1: Algoritma dan Pemrograman ---");
        System.out.print("Nilai UTS   : ");
        double uts1 = sc.nextDouble();
        System.out.print("Nilai UAS   : ");
        double uas1 = sc.nextDouble();
        System.out.print("Nilai Tugas : ");
        double tugas1 = sc.nextDouble();

        System.out.println("\n--- Mata Kuliah 2: Struktur Data ---");
        System.out.print("Nilai UTS   : ");
        double uts2 = sc.nextDouble();
        System.out.print("Nilai UAS   : ");
        double uas2 = sc.nextDouble();
        System.out.print("Nilai Tugas : ");
        double tugas2 = sc.nextDouble();

        double nilai1 = (0.3 * uts1) + (0.4 * uas1) + (0.3 * tugas1);
        double nilai2 = (0.3 * uts2) + (0.4 * uas2) + (0.3 * tugas2);
        double rataRata = (nilai1 + nilai2) / 2;
        String huruf1;
        String huruf2;

        // Penilaian huruf untuk mata kuliah 1
        if (nilai1 >= 80 && nilai1 <= 100) {
            huruf1 = "A";
        } else if (nilai1 >= 73 && nilai1 < 80) {
            huruf1 = "B+";
        } else if (nilai1 >= 65 && nilai1 < 73) {
            huruf1 = "B";
        } else if (nilai1 >= 60 && nilai1 < 65) {
            huruf1 = "C+";
        } else if (nilai1 >= 50 && nilai1 < 60) {
            huruf1 = "C";
        } else if (nilai1 >= 39 && nilai1 < 50) {
            huruf1 = "D";
        } else {
            huruf1 = "E";
        }

        // Penilaian huruf untuk mata kuliah 2
        if (nilai2 >= 80 && nilai2 <= 100) {
            huruf2 = "A";
        } else if (nilai2 >= 73 && nilai2 < 80) {
            huruf2 = "B+";
        } else if (nilai2 >= 65 && nilai2 < 73) {
            huruf2 = "B";
        } else if (nilai2 >= 60 && nilai2 < 65) {
            huruf2 = "C+";
        } else if (nilai2 >= 50 && nilai2 < 60) {
            huruf2 = "C";
        } else if (nilai2 >= 39 && nilai2 < 50) {
            huruf2 = "D";
        } else {
            huruf2 = "E";
        }

        String status1;
        String status2;
        String statusSemester;

        if (nilai1 >= 60) {
            status1 = "LULUS";
        } else {
            status1 = "TIDAK LULUS";
        }

        if (nilai2 >= 60) {
            status2 = "LULUS";
        } else {
            status2 = "TIDAK LULUS";
        }

        if (rataRata >= 70) {
            statusSemester = "LULUS";
        } else {
            statusSemester = "TIDAK LULUS (Rata-rata < 70)";
        }
        System.out.println("==== HASIL PENILAIAN AKADEKMIK ====");
        System.out.println("Nama\t: " + nama);
        System.out.println("NIM\t: " + nim);
        System.out.println("");
        System.out.println("Mata Kuliah\t\tUTS\tUAS\tTUGAS\tNilai Akhir\tNilai Huruf\tStatus");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Algoritma & Pemrograman" + "\t" + uts1 + "\t" + uas1 + "\t" + tugas1 + "\t" + nilai1 + "\t\t" + huruf1 + "\t\t" + status1);
        System.out.println("Struktur Data" + "\t\t" + uts2 + "\t" + uas2 + "\t" + tugas2 + "\t" + nilai2 + "\t\t" + huruf2 + "\t\t" + status2);
        System.out.println("");
        System.out.println("Rata-Rata Nilai Akhir: " + rataRata);
        System.out.println("Status Semester\t: " + statusSemester);
    }
}