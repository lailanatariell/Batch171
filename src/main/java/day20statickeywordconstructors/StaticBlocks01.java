package day20statickeywordconstructors;

public class StaticBlocks01 {

    // bir variable olusturdugunuzda , deger atamazsaniz o veriable i "initialize"
    //etmediniz demektir
    static double pi;

    //bazen main method calistirilmadan once variable arin hazir hale getirlmesi gerekiyor
    //bu yuzden static blocklar kullanilir
    //static variable lar static bloacklar icinde initialize edilirse o classin icinde
    //her seyden once hazir hale getirilmis olur
    static {
         pi=3.14;
    }

    public static void main(String[] args) {

    }

}
