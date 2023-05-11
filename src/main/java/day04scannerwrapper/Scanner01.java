package day04scannerwrapper;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        // ornek kullanicidan ilk ismini sonra soyismini alip ikisini ayni satirda ekrana yazdiriniz
        // 1.adin scanner classtan bir orject olustur
        Scanner input= new Scanner(System.in);
        //2.adim kullaniciya mesaj(ne istedigimize dair bilgi)veriyoruz
        System.out.println("ilk isminizi ogreneyim");
        //3.adim datayi memory ye yerlestirecegiz(uygun method u kullanarak kullanicinin verdigi datayi memory ye yerlestirecegiz)
        String firstName=input.next();
        System.out.println("ilk soy isminizi ogreneyim");
        String lastName= input.next();
        // next() mothodu tek kelimeli string almalar icindir

        System.out.println(firstName+""+lastName);
        /* Scanner disaridaki datalari digital ortama aktarma islemidir
           Scanner kullanicidan data almaya yarar.
           Scanner kullanici ile interaktif etkilesim saglar
           Scanner bir Java Class'idir, bu Class'i kullanabilmek icin import etmek gerekir.
           Scanner Class'i Java'nin util kutuphanesindendir
           Javanin icinde bir suru kutuphane var ve ilk basta kullanacagimiz kutuphane java.util kutuphanesidir. kutuphanenin
           icinde bir suru Class vardir ve Scanner bir Java Class'idir. */



    }
}
