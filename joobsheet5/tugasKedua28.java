package joobsheet5;
import java.util.Scanner;
public class tugasKedua28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka;
        System.out.print("Masukan angka: ");
        angka = sc.nextInt();
        if (angka % 2 == 0) {
            System.out.println(angka + " adalah bilangan genap");
        } else {
            System.out.println(angka + " adalah bilangan ganjil");
        }
    }
}
