package day10ifstatements;

import java.util.Scanner;

public class IfStatemens01 {
    public static void main(String[] args) {
        //ornek: verilen bir sayinin pozitif negatif  veya notr oldugunu kontrol eden kodu yaziniz
        Scanner input= new Scanner(System.in);
        System.out.println("lutfen bir sayiya giriniz");
        int num = input.nextInt();

        if (num > 0) {
            System.out.println("pozitif");
        }else if(num<0){
            System.out.println("negatif");
        }else{
            System.out.println("notr");
        }

    }
}
