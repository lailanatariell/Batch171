package day20statickeywordconstructors;

public class StaticBlocks01 {

    // bir variable olusturdugunuzda , deger atamazsaniz o veriable i "initialize"
    //etmediniz demektir
    static double pi;
    static  String shape;

    //bazen main method calistirilmadan once variable arin hazir hale getirlmesi gerekiyor
    //bu yuzden static blocklar kullanilir
    //static variable lar static bloacklar icinde initialize edilirse o classin icinde
    //her seyden once hazir hale getirilmis olur


    public static void main(String[] args) {
        System.out.println(pi);
        System.out.println(shape);
        System.out.println("main method" );

    }
    static {//static block her zaman once  calisir
        pi=3.14;
        System.out.println("statc block 1");
    }

    static {
        shape="Circle";
        System.out.println("static block 2");
    }
}
