package Latihan;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;  
public class ContohBufferReader {
    public static void main (String[] args) throws IOException{
        String nama;
        // Membuat objek inputstream
        InputStreamReader isr = new InputStreamReader(System.in);
        // Membuat objek bufferreader
        BufferedReader br = new BufferedReader(isr);
        // Mengisi variabel nama dengan Bufferreader 
        System.out.print("Inputkan nama: ");
        nama = br.readLine();
        //Tampilkan output ini variabel nama 
        System.out.println("Nama kamu adalah "+ nama);
             
   }
    
}
