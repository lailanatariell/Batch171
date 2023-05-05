package day02datatypesmethodcreation;

public class MethodCreation01 {
    public static void main(String[] args) {
        int sonuc= isim(3,5, 6);
        System.out.println(sonuc);

    }
    //Method burada yazilir, classin icinde olusmaz. classin icinden cagirilir
    //static main in icinden sadece static olan methodlari cagirabiliyoruz
    public static int isim(int a, int b, int c){
        return ((a*b)+c);
    }

}
 /*
    Java da method nasil olusturulur?

    1) main method un disinda classin icinde olusturulur
    2) Access Modifier + return type + method ismi + () + {}

    Olusturulun method lar nasil kullanilir?
    1)Methodu olusturmak methodu calistirmak icin yeterli degildir, Kullanilmak istenen
      method main method un icinden kullanilir
    2) method un ismi + () yazin
        varsa islem yapacaginiz datalari parantezin icine koyun
        bu islem method call (method cagirma) olarak adlandirilir
    3) methodun ismi + parametreler ===> method signature
     */
