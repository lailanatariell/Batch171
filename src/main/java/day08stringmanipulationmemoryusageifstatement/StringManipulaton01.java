package day08stringmanipulationmemoryusageifstatement;

public class StringManipulaton01 {
    public static void main(String[] args) {
        //ornek: bir string in hic karakter icermedigini kontrol eden kodu yaziniz
        String str="";
        boolean result1=str.length()==0;
        System.out.println("result1: "+ result1);
        //isEmpty bos mu demektir

        boolean result2=str.isEmpty();
        System.out.println("result2: " +result2);

        //ornek: bir String space haric hicbir character icermedigini kontrol eden kodu yaziniz

        String space="       ";

        boolean result3= space.replace(" ","").length()==0;
        System.out.println("result3: " + result3);

        boolean result4 = space.replace(" ","").isEmpty();
        System.out.println("result4: " + result4);

        boolean result5=space.isBlank();
        System.out.println("result5: " + result5);
        //isBlank() methodu sadece space iceren String ler icin true verir, space disinde bir character var ise false verir
        //isBlank() methodu bos stringler icin de true verir
        //isBlank() methodu space + hic birsey icin true verir
        //isEmpty() methodu sadece hic bersey icin true verir

        //ornek: bir string de a, i, e charcterlerinin ilk gorunumlerinin indexleri toplamini ekrana yazdiriniz

        String index="java is easy to learn";
        int indxA=index.indexOf('a');
        System.out.println("indxA = " + indxA);

        int indxI=index.indexOf('i');
        System.out.println("indxI = " + indxI);

        int indxE=index.indexOf('e');
        System.out.println("indxE = " + indxE);

        System.out.println(indxA+indxI+indxE);

        //ornek: bir string deki "java" kelime sinin ilk olarak kacince index te kullanildigini gosteren kodu yaziniz

        String java="Ah Java vah Java seninle olmuyor ama sensiz de olmuyor Java";
        int javaIndex=java.indexOf("Java");
        System.out.println("javaIndex = " + javaIndex); //3

        int javaIndex1=java.indexOf("java");
        System.out.println("javaIndex1 = " + javaIndex1); //-1

        //ornek: bir string de a.i.e characterlerinin son gorunumlerinin indexleri toplamini ekrana yazdiriniz
        String sonGorunum="java is easy to learn";

        int inxOfA=sonGorunum.lastIndexOf('a');
        System.out.println("inxOFA = " + inxOfA);

        int inxOfI=sonGorunum.lastIndexOf('i');
        System.out.println("inxOFI = " + inxOfI);

        int inxOfE=sonGorunum.lastIndexOf('e');
        System.out.println("inxOFE = " + inxOfE);

        System.out.println(inxOfA+inxOfI+inxOfE);

        //Note: lastIndexOf() methodu olmayan characterler icin kullanilirsa her zaman -1 verir.




    }
}
