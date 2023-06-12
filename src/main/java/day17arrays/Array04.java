package day17arrays;

import java.util.Arrays;

public class Array04 {
    public static void main(String[] args) {
        //ornek: size verilen bir cumlede kac tane kelime oldugunu gosteren kodu yaziniz

        String s="Java is easy. Learn Java earn money.";

        String words[]= s.split(" ");
        System.out.println(Arrays.toString(words));
        System.out.println(words.length);
    }
}
