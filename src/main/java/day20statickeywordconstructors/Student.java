package day20statickeywordconstructors;

public class Student {
    /*
    1)static variable(pasif ozellikler) veya static methodlar(aktif ozellikler)
    tum objectler icin ortek elemandir.
    2) static class memberlars uzerinde yapilan tum degisiklikler tum objectleri etkiliyr
    3)static class memberlar Classa , non-static class memberlar objectlere monte edilir
    mesela: bir class dan 100 tane object olusturdugunuzda non-static olanlar 100 kere olusturulur
    ama static olanlar object sayisindan bagimsiz olarak bir kere olusturulurlar
    4)static class memberlara ulasmak icin object olusturmaya gerek duyulmaz
    ama non static class memberlara ulasmak icin object olusturmak sarttir
    5) static variable larin diger adi "Class variable"dir
    non static varibale larin diger adi "instance variable " veya "object variable"dir

     */
    //passif ozellikler
    public static String stdName="Tom Hanks";

    public int age=13;

    //aktif ozellikler

    public static  void staticMethod(){
        System.out.println("ben static methodum");
    }

    public void nonStaticMethod(){
        System.out.println("ben static olmayan methodum");
    }
}
