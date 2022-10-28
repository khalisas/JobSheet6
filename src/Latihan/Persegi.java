
package Latihan;

import java.io.*;

public class Persegi {
    public static void main (String[] args){
    BufferedReader data = new BufferedReader(new InputStreamReader(System.in));
    String x = " ";
    int hitungLuas=0;
    System.out.println("---LuasPersegi---");
    System.out.print("Masukan nilai sisi");
    
try {
    x = data.readLine ();
    int angka = Integer.parseInt(x);
    hitungLuas = angka * angka;
} catch (Exception e){
    System.out.println("Error");
}
        System.out.println("Luas persegi dengan sisi " + x + "adalah" + hitungLuas);
    }
}
