
package menghitung;
import java.util.Scanner;



public class MENGHITUNG {

   
    public static void main(String[] args) {
      int panjang;
      int lebar;
      double luas;
     
      
      Scanner scan = new Scanner(System.in);
      
      System.out.println("Masukkan Nama Anda : ");
      String nama = scan.nextLine();
      System.out.println("Masukkan NIM Anda :");
      String nim = scan.nextLine();
      System.out.println("Masukkan Nama Kampus :");
      String kampus = scan.nextLine();
       
      System.out.println("Tugas Kalkulus Menghitung Persegi panjang ");
              
      System.out.println("Menghitung Luas Persegi Panjang");
      System.out.print("Masukkan Nilai Panjang : ");
      panjang = scan.nextInt();
      System.out.print("Masukkan Nilai Lebar : ");
      lebar = scan.nextInt();
      
      luas = (panjang * lebar);
      System.out.println("Luas Persegi Panjang = " + luas);
      lebar =(int) (luas / panjang);
      System.out.println("Lebar Persegi Panjang = " + lebar);
      
      
      System.out.println("Kesimpulannya yaitu Luas Persegi panjang Rumusnya Panjang * Lebar ");
      System.out.println("Kesimpulan yang ke 2 yaitu  Lebar persegi panjang rumusnya luas / panjang");
      
     
      
      
      
      
      
      
      
    }
    
}
