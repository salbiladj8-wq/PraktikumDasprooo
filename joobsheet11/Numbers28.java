package joobsheet11;
import java.util.Arrays;
public class Numbers28 {
    public static void main(String[] args) {
       int [][] Mynumbers;     
        Mynumbers = new int [3][];
        Mynumbers[0] = new int [5];
        Mynumbers[1] = new int [3];
        Mynumbers[2] = new int [1];
        for (int i = 0; i < Mynumbers.length; i++) {
            System.out.println(Arrays.toString(Mynumbers[i]));
        }
        for (int i = 0; i < Mynumbers.length; i++) {
           System.out.println(" Panjang baris ke- " + (i + 1) + ": " + Mynumbers[i].length);
        }
    }
}
