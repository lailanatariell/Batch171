package day05concatinationoperaorstypecasting;

public class Concatination {
    public static void main(String[] args) {
        //ornek: bir string ve iki integer variable olusturun. String degeri ile Integer larin toplamini consola yazdirin
        String s= "elma";
        int x=5;
        int y=6;
        System.out.println(x + y + s);//11elma
        System.out.println(s+ x+ y);//elma56
        //java soldan saga dogru islem yapar x e bakar int ,y ye bakar int bunlari toplar, sonra s ye bakar string atama yapar
        System.out.println(s+ (x+y));//elma11
        System.out.println(s + x * y);//elma30
        System.out.println(x + s + y);//5elma6

        //ornek: size string olarak verilen iki fiyatin toplamini ekrana yazdiriiz
        String shirt="2300";
        String shoes="5200";
        System.out.println(shirt+shoes);//23000520

        int fiyat = Integer.valueOf(shirt)+Integer.valueOf(shoes);
        //Integer.valueOf() string degeri integer a cevirir
        System.out.println(fiyat);//7500



    }

}
