package day03methodobjectcreationscanner;

public class MethodCreation01 {
    public static void main(String[] args) {
        double cube=getCube(5);
        System.out.println(cube);
        printt("java is easy");
        //2
        int a=3;
        int b=4;
        carpmaYap(a,b);

        int i=5;
        karesi(i);


    }

    private static void karesi(int i) {
        System.out.println(i*i);
    }

    private static void carpmaYap(int a, int b) {
        System.out.println(a*b);
    }

    //verilen bir onladik sayinin kupunu hesaplayan bir method olusturup kullaniniz
    static double getCube(double a){
        //Note:  eger access modifier  defoult kullanmak istersek access modifier Kullanmayiz
        return a*a*a;
    }
    //eger bir method yeni bir data uretmiyor ise return type void olur
    //methodun return type i void ise method body icinde return keywordu yazilmaz
    public  static void printt(String str){
        System.out.println(str);
    }
    /*
    Homework
    1)Cemberin cevresini hesaplayan methodu olusturunuz ve kullaniniz
    2)Dairenin alinini hesaplayan methodu olusturunuz ve kullaniniz
     */

}
