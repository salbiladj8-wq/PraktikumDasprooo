package joobsheet9;
import java.util.Scanner;
public class menuMakanCafe28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        System.out.print("Masukkan nama menu yang diinginkan: ");
        String temukan = sc.nextLine();
        boolean ketemu = false;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(temukan)) {
                ketemu = true;
                break;
            }
        }
        if (ketemu) {
            System.out.println("Menu \"" + temukan + "\" tersedia di kafe.");
        } else {
            System.out.println("Menu \"" + temukan + "\" tidak ditemukan didaftar menu.");
        }
    }
}

