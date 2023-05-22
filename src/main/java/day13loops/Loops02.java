package day13loops;

import java.util.Scanner;

public class Loops02 {
    //ornek: 21den 180e kadar hem 2 hemde 3 ile tam bolunebilen tamsayilari ekrana yazdiran kodu yazdiriniz
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
// Ornek 1: 21 den 180 e kadar hem 2 hemde 3 ile tam bolunebilen tamsayilari ekrana yazdiran kodu yaziniz
       /* for( int i=21   ; i<181  ; i++  ){
            if(i%2==0  && i%3==0){
                System.out.print(i+" ");
            }
        }

        */

        //System.out.println();
        //Ornek 2: Size verilen  kucuk harfle yazilmis Stringini index i cift sayi olan characterlerini buyuk harfe donusturunuz
        //          ankara  ==> AKR
        System.out.println("isim giriniz");

        String s = input.next();
        //i<=s.length()-1
        for(int i=0; i< s.length() ; i++  ){

            String ch = s.substring(i,i+1);



            if(i==0 || i==1){
                System.out.print(ch.toUpperCase());
            }else {
                System.out.print("*");
            }



        }

        //Ornek 3: Verilen bir String de ilk a harfinden onceki tum characterleri console a yazdiriniz
        // "I love Java"  ==>  "I love J"
        String s1 = "Tramway";

        for(int i=0;i<s1.length() ;                  i++ ){

            char ch =s1.charAt(i);
            if(ch=='a'){
                break;
            }
            System.out.print(ch);
        }
        //ornek4:verilen bir stringte son a dan sonraki tum karakterleri ters sirada yazdiriniz
        //  "Germany"  ==>  yn

        String t ="Germany";

        for ( int i= t.length() -1 ;  i>=0  ;                 i-- ){

            if(t.charAt(i)=='a'){
                break;
            }

            System.out.print(t.charAt(i));
        }



    }
}
