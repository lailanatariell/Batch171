package day17arrays;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {
        //specific bir elemanin array de olup olmadigini anlamak icin gereken kodu yaziniz

        String name []= {"K","C","R","A","S"};
        String eleman ="R";

        //1. yol
        int counter=0;
        for (String w: name){
            if (w.equals(eleman)){
                counter++;
                break;
            }
        }
        if (counter>0){
            System.out.println("Array has "+ eleman);
        }else {
            System.out.println("Array does not have"+eleman);
        }



        /*
        1. binarySearch() methodunu sort() kullanmadan kullanmayiz, cunku binarySearch() mantigi sirali elemanlar icin gecerlidir
        2. binarySearch() methodu var olan elemanlar icin size o elemanin index ini verir
        3. binarySearch() methodudan aldiginiz index 0 veya 0 dan buyukse bu o eleman arrayde var demektir
        4. binarySearch() methodu olmayan elemanlar icin negarif tamsayi verir
        "-" isaretinin anlami o eleman yok demektir
        "sayi" ise o eleman olsaydi kacinci eleman olurdu demektir

         */
         //2. yol. binarySearch() methodu hizli calisir
        Arrays.sort(name);
        int result = Arrays.binarySearch(name,eleman);
        if (result<0){
            System.out.println("Array does not have" +eleman);
        }else{
            System.out.println("Array has"+eleman);
        }






    }
}
