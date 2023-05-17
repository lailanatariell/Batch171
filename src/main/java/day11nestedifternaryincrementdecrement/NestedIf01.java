package day11nestedifternaryincrementdecrement;

import java.util.Scanner;

public class NestedIf01 {
            /*
           Kullanicidan 0'dan kucuk 120'den buyuk deger giremiyecek sekilde datalari aldiktan sonra

           Eger calisan kadin ise;
            60 yasindan buyukse "Emekli Olabilir "yazdirin

           Eger calisan erkek ise;
            65 yasindan buyukse "Emekli Olabilir" yazdiran kodu olusturunuz
        */
            public static void main(String[] args) {
                Scanner input =new Scanner(System.in);
                System.out.println("cinsiyetiniz?");

                String gender=input.next();
                System.out.println("yasiniz?");

                int age=input.nextInt();

                if (age<0 || age>120 ){
                    System.out.println("lutfen yasi 0 ile 120 arasinda giriniz");

                }else if (gender.equalsIgnoreCase("Kadin")){
                    if (age>60){
                        System.out.println("emekli olabilir");
                    }else {
                        System.out.println("calismali");

                    }

                } else if (gender.equalsIgnoreCase("Erkek")) {
                    if (age>65){
                        System.out.println("emekli olabilir");
                    }else {
                        System.out.println("calismali");

                    }

                }else {
                    System.out.println("Tanimli degil");

                }


            }
}
