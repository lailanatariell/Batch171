package day04scannerwrapper;

import java.util.Scanner;

public class ScannerOdev {
    public static void main(String[] args) {
        /*
    1) Kullanicidan aldiginiz 3 tane sayinin ortalamasini bulan kodu yaziniz.
    Ornegin ==> 3,5,7 icin ortalama (3+5+7)/3=5
     */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen 3 sayi giriniz");

        int sayi1 = input.nextInt();
        int sayi2 = input.nextInt();
        int sayi3 = input.nextInt();

        int ortalama = (sayi1 + sayi2 + sayi3) / 3;
        System.out.println("Girilen 3 sayinin ortalamasi = " + ortalama);

        /*
        2) Kullanicidan aldiginiz 3 basamakli bir sayinin rakamlari toplamini bulunuz
        Ornegin ==> 312 icin rakamlari toplami 3+1+2=6
         */

        System.out.println("Lutfen 3 basamakli bir sayi giriniz");

        int girilenSayi = input.nextInt();
        int yuzlerBasamagi = girilenSayi%10;
        girilenSayi = girilenSayi/10;
        int onlarBasamagi = girilenSayi%10;
        girilenSayi = girilenSayi/10;
        int birlerBasamagi = girilenSayi%10;

        System.out.println("Girilen sayinin rakamlari toplami = " + (yuzlerBasamagi+onlarBasamagi+birlerBasamagi));


    }
}
