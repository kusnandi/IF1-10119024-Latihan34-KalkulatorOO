/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119024.latihan34.objectorientedkalkulator;

import java.util.scanner;

/**
 *
 * @author Kusnandi
 * NAMA  : Kusnandi Pirmansyah
 * KELAS : IF-1
 * NIM   : 10119024
 */
public class If110119024Latihan34Objectorientedkalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner (System.in);
        Kalkulator calculator = new Kalkulator();
        System.out.println("Aplikasi Kalkulator Bilangan");
        System.out.print("Masukan Angka ke-1 : ");
        calculator.value1 = scanner.nextDouble();
        System.out.print("Masukan Angka ke-2 : ");
        calculator.value2 = scanner.nextDouble();
        System.out.println();
        
        System.out.println("Hasil Pertambahan : " + calculator.tambahBilangan());
        System.out.println("Hasil Pengurangan : " + calculator.kurangBilangan());
        System.out.println("Hasil Perkalian : " + calculator.kaliBilangan());
        System.out.println("Hasil Pembagian : " + calculator.bagiBilangan());
        System.out.println("Hasil Sisa : " + calculator.sisaBilangan());
    }
    
}
