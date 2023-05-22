package day13loops;

public class Loops01 {
    public static void main(String[] args) {

        /*
        code standarts
        1. tekrar (repetition) olamamali
        2. dynamic olmalidir
        3.tamir (fix) ve update kolay yapilabilmelidir
        */

        //2.yol
        // ayni adimler tekrar tekrar yapilmasi gerektiginde "loop"lar kullanilir
        //dort tane loop var 1.for loop 2.while loop 3.do while looop 4.dor each loop

        /*for(baslangic degeri ; loop calisma saati ; arttirma/ eksiltme){
            calisacak kodlar
        }

         */
        for(int i=0; i<6; i++){
            System.out.println("hi");
        }
        //ornek: 11den 14e kadar tum tamsayilari ekrana yazdiran kodu yaziniz

        for (int i=11; i<15; i++){
            System.out.println(i);
        }
        //ornek: 40 dan 23e kadar tum cift sayilari ekrana yazdiriniz
        for (int i=40; i>22; i--){
            if (i%2==0){
                System.out.println(i);
            }
        }
        //ornek: 18den 56ya kadar tum tek sayilari ekrana yazdiriniz

        for (int i=18; i<57; i++){
            if (i%2!=0){
                System.out.print(i+" ");
            }
        }

    }
}
