package day09ifstatements;

import java.util.Scanner;

public class IfStatements02 {
    public static void main(String[] args) {
        //ornek: kullanicidan alinan tek mi cift mi oldugunu consala yazdiriniz
        Scanner input=new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi=input.nextInt();

        if (sayi%2==0){
            System.out.println("cift");

        }
        if(sayi%2!=0){
            System.out.println("tek");
        }
        //........................//

        if (sayi%2==0){
            System.out.println("cift");
        }else{
            System.out.println("tek12");
        }


    }
}
