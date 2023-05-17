package day11nestedifternaryincrementdecrement;

import java.util.Scanner;

public class Ternary01 {
    //Ternary Statement
    //Ornek1: Sayi 10 dan kucuk ise console a "kucuk" yazdirin degil ise "kucuk degil" yazdirin
    //----------if else cozumu-------
    public static void main(String[] args) {
        int num=2;
        if (num<10){
            System.out.println("kucuk");
        }else{
            System.out.println("kucuk degil");
        }

        //.........Ternary Cozumu...............
        //Condation ? Condation true ise calisir : Condation false ise calisir ;

        String SONUC= num<10 ? "Kucuk" : "Kucuk degil";
        System.out.println(SONUC);

        //Ornek: 2 Sayi cift ise console a "cift" , tek ise "Tek" yazdirin

        //----------if else cozumu-------
        int k =13;
        if(k%2==0){
            System.out.println("Cift");
        }else {
            System.out.println("Tek");
        }
        //...........................................
        int i =5;
        String  sonuc1 = i%2==0 ? "cift" : "tek";
        System.out.println(sonuc1);

        //Ornek 3: Sayi 0 dan buyuk ise "pozitif" degilse ekrana "pozitif degil" yazdirin
        int a=-5;
        String sayilar= a>0 ? "pozitif" : "pozitif degil";
        System.out.println(sayilar);

        //Ornek 4: Kullanicidan iki sayi aliniz, "buyuk olmayan" (kucuk veya esit olan) sayiyi yazdiriniz
        Scanner input = new Scanner(System.in);
        System.out.println("iki sayi giriniz..");
        double a1 = input.nextDouble();
        double b = input.nextDouble();

        //1.yol if else
        if(a1<b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }

        //2. yol Ternary
        double result2 = a1<b ? a1 : b;
        System.out.println(result2);

    }

}
