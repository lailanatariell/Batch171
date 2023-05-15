package day09ifstatements;

import java.util.Scanner;

public class IfStatements03 {
    public static void main(String[] args) {
        //ornek: verilen karakter buyuk harf ise ekrana buyuk harf yazdiran kucuk harf ise kucuk harf yazdiran kodu olusturunuz
        Scanner inpit = new Scanner(System.in);
        System.out.println("lutfen bir karakter giriniz");
        //next string olusturuyor
        char karakter=inpit.next().charAt(0);
        if(karakter>='A' && karakter<='Z'){
            System.out.println("buyuk harf");

        }
        if(karakter>='a' && karakter<='z'){
            System.out.println("kucuk harf");

        }


    }
}
