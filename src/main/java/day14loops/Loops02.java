package day14loops;

public class Loops02 {
    public static void main(String[] args) {
        //ornek: 5 den 8 e kadra tamsayilarin toplamini veren kodu yaziniz
        //5+6++&+8 ==>26

        int sum=0;
        for (int i = 5; i <9 ; i++) {

            sum=sum+1;

        }
        System.out.println(sum);

        //ornek: 7 den 9 a kadra tamsayilarin carpimini veren kodu yaziniz
        // 7*8*8 ==>584

        int multiply=1;
        for (int i = 7; i < 10; i++) {
            multiply=multiply*i;
        }
        System.out.println(multiply);

        //ornek: verilen bir tamsayinin rakamlarinin toplamini veren kodu yaziniz
        //578==> 5+7+8=20




    }

}
