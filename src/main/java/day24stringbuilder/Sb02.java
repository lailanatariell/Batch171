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

    }
}
