package day07stringmanipulations;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class StringManipulation02 {

    public static void main(String[] args) {
         /*
        Ornek:
            Asagidaki kurallara gore kullanicinin girdigi password u kontrol ediniz
                1) En az 8 charcter olsun
                2) Space characteri passwordde olmasin
                3) En az bir buyuk harf olsun
                4) En az bir kucuk harf olsun
                5) En az bir rakam olsun
         */
        Scanner input = new Scanner(System.in);
        System.out.println("lutfen sifrenize giriniz");
        String pwd=input.nextLine();

        boolean first = pwd.length()>7;
        System.out.println("en az 8 karakter var mi: " +first);

        boolean second= !pwd.contains(" ");
        System.out.println("Space true mu false mu: "+second);

        //Note: Buyuk harf olmayalari sil
        //kalan karakter sayisina bak
        //eger karakter sayisi 0 ise buyuk haft yok demektir
        //0 dan buyuk ise, buyuk harf var demektir

        boolean third= pwd.replaceAll("[^A-Z]","").length()>0; //hiclikle degistir(yani sildi)
        System.out.println("buyuk harf var mi: "+third);

        boolean fourth=pwd.replaceAll("[^a-z]","").length()>0; //kucuk harf haric[^a-z]
        System.out.println("kucuk harf var mi: "+fourth);

        boolean fifth=pwd.replaceAll("[^0-9]]","").length()>0;
        System.out.println("rakam var mi: "+fifth);

        System.out.println(("Password gecerli mi?"+(fifth && second && third && fourth && fifth )));

    }



}
