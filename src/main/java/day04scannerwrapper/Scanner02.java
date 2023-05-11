package day04scannerwrapper;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
        // 1.ornek kullanicidan adresini aliniz ve ekrana yazdiriniz
        Scanner input = new Scanner(System.in);
        System.out.println("adresinizi giriniz");
        String addres=input.nextLine();
        System.out.println(addres);
        // nextLine() methodu kullanicidan cok kelimeli string almak icin kullanilir
    }

}
