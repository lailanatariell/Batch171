package day09ifstatements;

public class IfStatements01 {
    public static void main(String[] args) {
        //ormek: sayiyi uc basamak ile ekrana "sayi uc basamaklidir "yazdirin
        int number=123;
        number=Math.abs(number);
        if (number>99 && number<1000){
            System.out.println("sayi uc basamaklidir");

        }

        // intervew sorusu
        // ornek: bir string deki tekrarsiz characterleri ekrana yazdiriniz

        //aabbccdc -ad
        String str="acacb";
        char ch1=str.charAt(0);
        if (str.indexOf(ch1)==str.lastIndexOf(ch1)){
            System.out.println(ch1);
        }
        char ch2=str.charAt(1);
        if (str.indexOf(ch2)==str.lastIndexOf(ch2)){
            System.out.println(ch2);
        }
        char ch3=str.charAt(2);
        if (str.indexOf(ch3)==str.lastIndexOf(ch3)){
            System.out.println(ch3);
        }
        char ch4=str.charAt(3);
        if (str.indexOf(ch4)==str.lastIndexOf(ch4)){
            System.out.println(ch4);
        }
        char ch5=str.charAt(4);
        if (str.indexOf(ch5)==str.lastIndexOf(ch5)){
            System.out.println(ch5);
        }


    }
}
