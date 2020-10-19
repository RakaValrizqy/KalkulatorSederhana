package kalkulatorsederhana;
import java.util.Scanner;
public class KalkulatorSederhana {
public static void main(String[] args) {
     Scanner input = new Scanner (System.in);
     int pilihan;
     double bilangan1, bilangan2, hasilTambah, hasilKurang, hasilKali, hasilBagi, hasilModulus;
     String[] list = {"Pertambahan","Pengurangan","Perkalian","Pembagian","Hasil sisa bagi modulus","Semua"};
     
     System.out.println("-----PROGRAM KALKULATOR SEDERHANA------");
     System.out.print("Masukkan bilangan pertama : ");
     bilangan1 = input.nextDouble();
     System.out.print("Masukkan bilangan kedua   : ");
     bilangan2 = input.nextDouble();
     
     hasilTambah = bilangan1 + bilangan2;
     hasilKurang = bilangan1 - bilangan2;
     hasilKali = bilangan1 * bilangan2;
     hasilBagi = bilangan1 / bilangan2;
     hasilModulus = bilangan1 % bilangan2;
     
     System.out.println("Pilih Operasi Aritmatika : ");
     for (int i = 0; i < list.length; i++) {
         System.out.println(i+". "+list[i]);
    }
     System.out.print("Masukkan pilihan anda : ");
     pilihan = input.nextInt();
     switch (pilihan) {
         case 0 :
             System.out.print("Hasil Pertambahan kedua bilangan : "+hasilTambah);
             break;
         case 1 :
             System.out.print("Hasil Pengurangan kedua bilangan : "+hasilKurang);
             break;
         case 2 :
             System.out.print("Hasil Perkalian kedua bilangan   : "+hasilKali);
             break;
         case 3 : 
             System.out.print("Hasil Pembagian kedua bilangan   : "+hasilBagi);
             break;
         case 4 : 
             System.out.print("Hasil Sisa Bagi kedua bilangan   : "+hasilModulus);
             break;
         case 5 :
             System.out.println("Hasil Pertambahan kedua bilangan : "+hasilTambah);
             System.out.println("Hasil Pengurangan kedua bilangan : "+hasilKurang);
             System.out.println("Hasil Perkalian kedua bilangan   : "+hasilKali);
             System.out.println("Hasil Pembagian kedua bilangan   : "+hasilBagi);
             System.out.println("Hasil Sisa Bagi kedua bilangan   : "+hasilModulus);
             break;
         default :
             System.out.println("Kode yang anda masukkan salah!");
             System.out.println("Harap ulang program!");
     }
    }
    
}
