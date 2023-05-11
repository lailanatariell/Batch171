package day04scannerwrapper;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {
        //kullanicidan dikdortgenin iki kenar uzunlugunu ainiz
        // a) alalini hesaplayiniz (kisa kenar* uzun kenar)
        //b) cevresini hesaplayiniz (2*kisa kenar+2*uzun kenar)

        Scanner input = new Scanner(System.in);
        System.out.println("dikdortgenin kisa kenar uzunlugunu giriniz");
        double kisaKenar=input.nextDouble();
        System.out.println("dikdortgenin uzun kenarini giriniz");
        double uzunKenar= input.nextDouble();
        System.out.println("alani:"+ (kisaKenar*uzunKenar));
        System.out.println("cevresi:"+ (2*kisaKenar+2*uzunKenar));
    }
}
