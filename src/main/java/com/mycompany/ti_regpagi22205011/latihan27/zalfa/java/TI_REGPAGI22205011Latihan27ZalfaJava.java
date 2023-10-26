/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ti_regpagi22205011.latihan27.zalfa.java;
import java.util.Scanner;
/**
 *
 * @author User
 Nama : Zalfa Rosiyah Riski 
 Nim : 22205011
 Jurusan : Teknik Informatika 
 Deskripsi : Buatlah program menampilkan formatting kalimat menjadi huruf besar dan kecil dimana user menginputkan sendiri kalimatnya
 */
public class TI_REGPAGI22205011Latihan27ZalfaJava {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        boolean ulangi = true;
        
        while (ulangi) {
            System.out.println("Masukan kalimat : ");
            String kalimat = input.next();
            
            String kalimatKecil = kalimat.toLowerCase();
            String kalimatBesar = kalimat.toUpperCase();
            
            System.out.println("==== Hasil formating ===="); 
            System.out.println("HurufBesar = " +kalimatBesar);
            System.out.println("HurufKecil = " +kalimatKecil);
            
            System.out.println("\nUlangi program? (ya/tidak)");
            String ulang = input.next();
            if(ulang == "ya"){
                System.out.println("Program akan diulangi");
            }else if(ulang == "tidak"){
                System.out.println("Program berhenti terimakasih");
                ulangi = false;
            }
        }
    }
}
