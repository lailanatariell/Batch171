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
        //string i degistirdikten sonra ayni string e assign edersiniz,
        //java yine yeni bir container olusturur
        //degismis degeri bu yeni container in icine koyar ve eski container i gosteren pointer yeni container a
        //dolayisiyla eski container adressiz kalir, ve garbage collection adressiz olan containerleri siler

        String a= "money";
        a=a+"more";

        //mutable
        //stringbuilder kullanarak string uretmenin 1.yolu:
        StringBuilder sb1= new StringBuilder("python");
        sb1.append("!");
        System.out.println(sb1);

        //2.yol
        StringBuilder sb2= new StringBuilder();
        System.out.println(sb2.length());
        System.out.println(sb2.capacity());

        sb2.append("java");
        sb2.append("xxxxxxxxxxxxxxx");

        System.out.println(sb2.length());
        System.out.println(sb2.capacity());

        //capacity() ve lentgh() arasindaki fark?
        /*
        capacity java nin size verdigi data depolama yer sayisidir
        length ise size verilen data depolama yerinin kullanilan kismidir

        java baslangic size capacity i 16 olarak verir
        siz verilen capacity i asarsaniz java yeni capacity i verilenin 2 katinin 2 fazlasi olacak sekilde degistirir
        16==>16*2+2    31==>34*2+2
         */

        StringBuilder sb3= new StringBuilder(3);
        System.out.println(sb3.append("javaa"));
        System.out.println(sb3.capacity());



    }
}
