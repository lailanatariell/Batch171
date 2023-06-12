package day17arrays;

import java.util.Scanner;

public class Arrays02 {
    public static void main(String[] args) {
        //ornek: kullanicinin coklu data yi bir array e yerlestirebilmesi
        //istedigi zaman durdurabilmesi icin gereken kodu yaziniz

        /*
        1. kullanicidan data almak icin scanner object olustur
        2. coklu data yi yerlestirmek icin bir array olusturmaliyiz
        3. array olusturabilmek icin kullanicidan array e kac tane eleman koyacagini almaliyiz
        4. loop olusturup eleman ekleme islemini takrar tekrar yapabilmaliyiz

         */

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen eklemek istediginiz ogrenci sayisini giriniz");
        int numOfElement= input.nextInt();

        String stdNames[]= new String[numOfElement];
        System.out.println("islemi durdurmak icin 'q' ya basiniz");
        for (int i = 0; i < stdNames.length ; ++) {
            System.out.println((i+1)+ ". ogrencinin ismini giriniz");
            String name= input.next();

            if(name.equalsIgnoreCase("q")){
                break;
            }else{
                stdNames[i]=name;
            }

        }

    }
}
