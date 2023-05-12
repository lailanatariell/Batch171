package day07stringmanipulations;

public class StringManipulations03 {
    public static void main(String[] args) {
        //ornek:  bir string in bas ve sonunda space charakter i varsa siliniz
        String s="ALI CAN";
        //trim() methodu bir string in bos ve sonundaki space karakterlerini siler, aradaki  space lere dokunmaz
        String sTrimmed=s.trim();
        System.out.println(sTrimmed);

        //ornek: asagidaki fiyatlari verilen urunlerin toplam fiyatini bulunuz
        String tv ="$234.99";
        String laptop ="$234.99";

        String tv2=tv.replace("$","");
        System.out.println(tv2);

        String laptop1= laptop.replace("$","");
        System.out.println(laptop1);

        //string i aliyor double a ceviriyor (double.valueOf(tv2))

        double totalPrice=Double.valueOf(tv2)+ Double.valueOf(laptop1);
        System.out.println(totalPrice);

        //ornek: verilen ismin ilk isminin ilk harfinin ve soy isminin ilk harfini ekrana yazdiriniz

        String name="aLi CAn";
        char first= name.trim().toUpperCase().charAt(0);
        System.out.println(first);
        char second= name.trim().toUpperCase().split(" ")[1].charAt(0);
        System.out.println(second);
        System.out.println(" "+first+ second);
        //split methodu bir stringi istedigimiz karakterden patcalamaya yarar


    }
}
