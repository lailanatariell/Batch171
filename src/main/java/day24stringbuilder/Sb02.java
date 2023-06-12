package day24stringbuilder;

public class Sb02 {

    public static void main(String[] args) {
        StringBuilder sb1= new StringBuilder("java is easy");
        System.out.println(sb1);

        sb1.reverse(); //string in ters cevirilmesi looplar ile de yapilir bu kisa yoludur

        System.out.println(sb1);

        sb1.deleteCharAt(0);

        System.out.println(sb1);

        System.out.println(sb1.delete(0, 3));//baslagis indexi dahil bitis indexine kadar (haric) olan karakterleri siler

        System.out.println(sb1.replace(2, 5, "o"));

        //sb1.replace(2, 5, "o") methodu 2 dahil 5 haric yeni index 2,3,4 deki karakterlerin yerine "o" koyar

        System.out.println(sb1.insert(3, "xxx"));

        StringBuilder sb2=new StringBuilder("java ");
        StringBuilder sb3=new StringBuilder("java ");

        //sonuc 0 ise alfabetik olarak ayni siradalar demektir
        //sonuc -1 ise sb2 sb3 ten alfabetik olarak bir onde demektir
        //sonuc 1 ise sb2 sb3 ten alfabetik olarak bir sonra demektir


        int r1=sb2.compareTo(sb3);
        System.out.println(r1);

        //stringbuilder nasil string e cevirilir

        String str= sb2.toString().toUpperCase();
        System.out.println(str);

        StringBuilder newSb2 = new StringBuilder(str);
        System.out.println(newSb2);


    }
}
