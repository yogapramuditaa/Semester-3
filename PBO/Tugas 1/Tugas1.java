
package tugas.pkg1;
import java.util.Scanner;

public class Tugas1 {

    public static void main(String[] args) {
       String  nama,nim,alamat,usia;
       Scanner keyboard = new Scanner (System.in);
       
       System.out.println("____BIODATA MAHASISWA___");
       System.out.println();
       
       System.out.println("NAMA : ");  
       nama = keyboard.nextLine();
       
       System.out.println("NIM : ");  
       nim = keyboard.nextLine();
       
       System.out.println("ALAMAT : ");  
       alamat = keyboard.nextLine();
       
       System.out.println("USIA : ");  
       usia = keyboard.nextLine();
       
       System.out.println("---------");
       System.out.println("NAMA :" + nama);
       System.out.println("NIM :" + nim);
       System.out.println("ALAMAT :" + alamat);
       System.out.println("USIA :" + usia);
    }  
}
