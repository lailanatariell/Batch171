package day04scannerwrapper;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {
        // kullanicidan iki sayi alip 4 islem yapan ve islemlerin sonuclarini ekrana yazdiran kodu yazdiriniz
        Scanner input = new Scanner(System.in);
        System.out.println("iki sayi giriniz");
        double sayi=input.nextDouble();
        double sayi2=input.nextDouble();

        System.out.println(sayi+sayi2);
        System.out.println(sayi*sayi2);
        System.out.println(sayi-sayi2);
        System.out.println(sayi/sayi2);;;

    }
}
