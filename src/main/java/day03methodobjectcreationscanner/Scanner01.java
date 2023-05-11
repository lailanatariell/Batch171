package day03methodobjectcreationscanner;
//javanin util kutuphanesinden scanner class impot edildi
import java.util.Scanner;


public class Scanner01 {
    public static void main(String[] args) {


        // 1.Adim Scanner Classtan object olustur
        Scanner input = new Scanner(System.in);
        //2.adim kullaniciya ne istediginie dair mesaj veriiz
        System.out.  println("lutfen yaziniza giriniz");


        //3.adim uygun methodu kullanarak kullanicinin verdigi datayi memory ye yerlestiriniz
        byte age = input.nextByte();
        System.out.println("age: "+ age);
    }
}
