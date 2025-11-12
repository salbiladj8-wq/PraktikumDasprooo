package joobsheet11;
import java.util.Scanner;
public class BioskopWithScanner28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom;
        String nama, next;
        String[][] penonton = new String[4][2];
        while (true) {
            System.out.println("\n ===Menu Bioskop=== ");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit: ");
            System.out.print("Pilih menu: ");
            int menu = sc.nextInt();
            if (menu == 1) {
                do {
                    sc.nextLine();
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();
                    System.out.print("Masukkan baris: ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom: ");
                    kolom = sc.nextInt();
                    sc.nextLine();
                    if ((baris < 1 || baris > 4) && (kolom < 1 || kolom > 2)) {
                    System.out.println("Nomor baris dan kolom tidak tersedia! Masukkan kembali.");
                    } else if (baris < 1 || baris > 4) {
                        System.out.println("Nomor baris tidak tersedia! Masukkan kembali.");
                    } else if (kolom < 1 || kolom > 2) {
                        System.out.println("Nomor kolom tidak tersedia! Masukkan kembali.");
                    } else {
                        penonton[baris - 1][kolom - 1] = nama;
                        System.out.println("Kursi sudah ditempati oleh: " + nama);
                    }
                    System.out.print("Input penonton lainnya? (y/n): ");
                    next = sc.nextLine();
                } while (next.equalsIgnoreCase("y"));
            } else if (menu == 2) {
                System.out.println("\nDaftar Penonton:");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        String isiKursi = (penonton[i][j] == null) ? "***" : penonton[i][j]; ;
                        System.out.println("Baris " + (i + 1) + " Kolom " + (j + 1) + ": " + isiKursi);
                    }
                }
            } else if (menu == 3) {
                System.out.println("Exit program.");
                break;
            } else {
                System.out.println("Menu tidak valid!");
            }
        }
    }
}
