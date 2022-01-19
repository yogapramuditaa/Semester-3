
package tugas2;
import java.util.Scanner;

public class Tugas2 extends ktp {
    String nama, nim, alamat;
    int usia;
    
    Scanner inputUser = new Scanner(System.in);
    
    void input(){
        System.out.println("Masukkan Identitas Anda");
        System.out.println("Nama : ");
        nama = inputUser.nextLine();
        System.out.println("NIM : ");
        nim = inputUser.nextLine();
        System.out.println("Alamat : ");
        alamat = inputUser.nextLine();
        System.out.println("Usia : ");
        usia = inputUser.nextInt();
                
    }
    
    void output(){
        System.out.println("-------Identitas Mahasiswa----------");
        System.out.println("Nama : " + nama);
        System.out.println("Usia : " + usia + "Tahun");
        System.out.println("NIM : " + nim);
        System.out.println("Alamat : " + alamat);
        
        System.out.println("NIK : " + nik);
        System.out.println("Golongan Darah : " + goldar);
        System.out.println("Tempat Tanggal Lahir : " + ttl);
        System.out.println("Kewarganegaraan : " + wn);
        System.out.println("Berlaku Hingga : " + masa);
                     
    }

    public static void main(String[] args) {
        Tugas2 yoga = new Tugas2();
        yoga.input();
        yoga.output();
    }
    
}
