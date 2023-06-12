package day24stringbuilder;

public class Sb01 {
    public static void main(String[] args) {
        /*
        1. stringbuilder classi da string ureten classtir
        2. string class kullanarak string uretiriz java nicin string stringbuilder classi da olusturdu?
            string class immutable (degistirilemez) string uretir
            stringbuilder "murable"(degistirilebilir) string uretir
        3. immutable olmak demek orjinal degerin korunmasi , degistirilemez olmasi demektir
        "mutable" olmak demek orijinal degrin degesririlebilir olmasi demektir

         */

        //immutable
        String s= "java";
        String t= s+"!";
        String w= t+"?";

        //mutable
        //stringbuilder kullanarak string uretmenin 1.yolu:
        StringBuilder sb1= new StringBuilder("python");
        sb1.append("!");



        System.out.println(sb1);

    }
}
