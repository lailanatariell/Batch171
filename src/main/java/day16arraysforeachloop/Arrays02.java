package day16arraysforeachloop;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {
        //ornek: string array olusturun icine 5 tane eleman ekleyin ilk
        // eleman ile son elemanin icerdigi karakter sayilari toplamini
        // ekrana yazdirin
        String arr[]=new String[5];
        arr[0]="Math";
        arr[1]="Science";
        arr[2]="Music";
        arr[3]="English";
        arr[4]="Art";

        System.out.println(Arrays.toString(arr));

        System.out.println(arr[0].length()+arr[arr.length-1].length());
        //System.out.println(arr[0].length()+arr[4].length());
        //arr.length-1 == arr[4]
        //arr.length arr.nin uzunlugunu verir yani 5 , -1 deyince 5-1 dort olur bu yuzden arr[4] ile esdegerdir

        // ornek: string bir array olusturun icine  5 tane eleman ekleyin, tum elemanlarin icerdigi karakter
        //sayilari toplamini ekrana yazdirin

        String brr[]=new String[5];
        brr[0]="talas";
        brr[1]="bishkek";
        brr[2]="osh";
        brr[3]="ohio";
        brr[4]="naryn";

        //1.yol for loop

        int totalChar=0;
        for (int i = 0; i < brr.length; i++) {
            totalChar= totalChar+brr[i].length();
        }
        System.out.println(totalChar);





    }

}
