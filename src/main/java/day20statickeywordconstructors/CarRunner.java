package day20statickeywordconstructors;

public class CarRunner {
    public static void main(String[] args) {
        //siz kendi constructorunuzu olusturdugunuzda java default cinstructor i siler

        Car c1= new Car("bmv", "m4",2023,false);
        Car c2= new Car("auce","r8",2022,true);
        Car c3= new Car("honda","civic",1999,false);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}
