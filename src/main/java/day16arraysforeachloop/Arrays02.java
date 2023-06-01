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



    }

}
