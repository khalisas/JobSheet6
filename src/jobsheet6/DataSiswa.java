
package jobsheet6;

import java.util.Scanner;

public class DataSiswa {

    public static void main(String[] args) {
        //deklarasi variabel
        int usia, absen;
        String nama, alamat;
        // membuat scanner baru
        Scanner keyboard = new Scanner (System.in);
        // Tampilkan output ke user 
        System.out.println("*### DATA SISWA SMK TELKOM MALANG###");
        System.out.println("Nama siswa: ");
        //menggunakan scanner dan menyimpan apa yang diketik variabel nama 
        nama = keyboard.next();
        // Tampilkan output lagi 
        System.out.println("Alamat: ");
        //menggunakan scanner lagi  
        alamat = keyboard.next();
        System.out.println("Absen:  ");
        usia = keyboard.nextInt();
        System.out.print("Usia:  ");
        absen = keyboard.nextInt();
        //menampilkan apa yang sudah simpa n di variabel 
        System.out.println("SISWA SMK TELKOM MALANG");
        System.out.println("Nama Siswa: " + nama );
        System.out.println("Alamat: "+alamat);
        System.out.println("Absen: "+absen);
        System.out.println("Usia: "+usia+"tahun");
              
    }
    
}
