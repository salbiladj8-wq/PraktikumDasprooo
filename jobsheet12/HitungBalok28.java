package jobsheet12;
import java.util.Scanner;
public class HitungBalok28 {
    static int hitungLuas(int pjg, int lb) {
        int Luas = pjg * lb;
        return Luas;
    }
    static int hitungVolume(int pjg, int lb, int tgi) {
        int Volume = pjg * lb * tgi;
        return Volume;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan panjang: ");
        int p = input.nextInt();
        System.out.print("Masukkan lebar: ");
        int l = input.nextInt();
        System.out.print("Masukkan tinggi: ");
        int t = input.nextInt();

        int luas = hitungLuas(p, l);
        int volume = hitungVolume(p, l, t);
        System.out.println("Luas persegi panjang adalah: " + luas);
        System.out.println("Volume balok adalah: " + volume);
        input.close();
    }
}
