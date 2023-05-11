package day06swapvaluesstringmanipulations;

public class StringManipulations01 {
    public static void main(String[] args) {
        //String s="java is easy";
        //System.out.println(s.toUpperCase());
        String k="JAVA IS EASY";
        System.out.println(k.toLowerCase());

        String d="JAVA KOLAY DEGILDIR";
        System.out.println(d);

        System.out.println("" + d.charAt(5)+ d.charAt(6)+d.charAt(7)+ d.charAt(8)+d.charAt(9)+d.charAt(16)+d.charAt(17)+d.charAt(18)+"!");

        System.out.println(d.length()); //19
        System.out.println(d.substring(5, 10)); //kolay
        System.out.println(d.substring(11)); //degildir

        System.out.println(d.contains("monay")); //false
        System.out.println(d.contains("JAVA")); //true
        System.out.println(d.contains("java")); //false
        System.out.println(d.startsWith("JAVA")); //TRUE
        //String bir non-primitive data type dir ve ayni zamanda bir classdir
        String s = "Java is easy";

        //Ornek1: "s" Stringindeki tum characterleri buyuk harf yapiniz
        String sUpper = s.toUpperCase();
        System.out.println(sUpper);//JAVA İS EASY

        //Ornek2:"s" Stringindeki tum characterleri kucuk harf yapiniz
        String sLower = s.toLowerCase();
        System.out.println(sLower);//java is easy

        //Ornek3: "s" String'indeki ilk characteri aliniz.
        char firstChar = s.charAt(0);
        System.out.println(firstChar);//J

        //Ornek4: "s" string'indeki bastan ikinci ve sondan ikinci characteri aliniz ve ekrana yazdiriniz
        char secondChar = s.charAt(1);
        char secondLastChar = s.charAt(10);
        System.out.println("" + secondChar + secondLastChar);//as

        //Ornek 5: "s" string'inde kullanilan character sayisini bulunuz
        int sLength = s.length();
        System.out.println(sLength);//12

        //Ornek 6: "s" String'indeki ilk 4 characteri aliniz
        // s.substring(0,4) ==> bu kullanimda ilk index dahildir, ikinci index harictir.
        String sub1 = s.substring(0, 4);
        System.out.println(sub1);//Java

        //Ornek7: "s" String'indeki "is" kelimesini aliniz
        String sub2 = s.substring(5, 7);
        System.out.println(sub2);//is

        //Ornek8: "s" String'indeki "easy" kelimesini aliniz
        String sub3 = s.substring(8, 12);
        System.out.println(sub3);//easy

        //ikinci yol
        String sub4 = s.substring(8);
        System.out.println(sub4);//easy

        //Ornek 9:  "s" String'inde "money" kelimesinin var olup olmadigini kontrol ediniz
        boolean isExist = s.contains("money");
        System.out.println(isExist);

        //Ornek 10:  "s" String'inin belli bir harf yada harflerle baslayip baslamadigini kontrol ediniz
        boolean isStart=s.startsWith("Java");
        System.out.println(isStart);

        //Ornek 11: "s" String inin 5. index dahil olmak uzere bu indexten itibaren "i" karakteri ile baslayip baslamadigini
        //kontrol eden kodu yaziniz
        boolean isBegin=s.startsWith("i",5);
        System.out.println(isBegin);//true

    }
}
