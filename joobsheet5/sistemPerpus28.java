package joobsheet5;
import java.util.Scanner;
public class sistemPerpus28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    String kartuMhs;
    String regisOn;
    System.err.print("Apakah punya kartuMhs (true/false): ");
    kartuMhs = sc.nextLine().trim();
    System.err.print("Apakah sudah registOn (true/false): ");
    regisOn = sc.nextLine().trim();
    if (kartuMhs.equalsIgnoreCase("true") || regisOn.equalsIgnoreCase("true")){
        System.out.println("Boleh masuk");
    } else {
        System.out.println("Ditolak");
    }       
}
}
