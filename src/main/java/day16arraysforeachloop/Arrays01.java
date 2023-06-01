package day16arraysforeachloop;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        int a=13;
        //bu yapinin icinde sadece bir tane data  depolanabilir
        //ama biz code yazarken bir yapinin icinde coklu data depolama ihtiyaci hissederiz
        //bir yapinin icinde coklu data depolayabilme icin java Array yapisinin olusturmustur

        //array nasil olusturulur?

        String stdName[]= new String[5];
        /*
        Arrayler diger collectionlardan cok cok daha hizlidir (superfast).
        Arrayler diger collectionlardan daha az memory kullanirlar
         */

        stdName[1]="Ailana";
        stdName[4]="Mustafa";
        stdName[0]="Tariel";
        //Arrayler console a nasil yazdirilir?
        //toString() methodu nu kullanmadan sadece array ismi ile yazdirirsaniz java o Array in adresini yazdirir
        System.out.println(Arrays.toString(stdName));
        //Array'den specific bir elemani nasil aliriz?
        System.out.println(stdName[1]);

        //ornek: Arraydeki her elemanin sonuna "!" isareti koyarak ekrana yazdiriniz
        // length() string lerde method(parantezli)
        //arraylerde ise parantezsiz yazilir(method degil)
        for (int i = 0; i < stdName.length; i++) {
            System.out.println(stdName[i]+"!");

        }
    }
}
