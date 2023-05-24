package day15loops;

public class DoWhileLoop01 {
   /*
     baslangiv degeri
     while(loop calisma kurali){
     calisacak kodlar

     arttirma/azaltme
     }

    */
   public static void main(String[] args) {
       for (int i = 3; i < 7; i++) {
           System.out.println(i+" ");

       }

       int j=3;
       while (j<7){
           System.out.print(j+" ");
           j++;
       }
       System.out.println();

       //................................//
       //Ornek 2 : 23 den 12 ye kadar cift sayilari console a yazdiriniz
       int k =23;
       while (k>11){
           if (k%2==0){
               System.out.println(k+" ");
           }
           k--;
       }
       //Ornek 3: 6 dan 19 a kadar tum tek sayilari console a yazdiriniz.
       int a=6;

       while(a<20){
           if (a % 2 != 0) {
               System.out.println(a + " ");

           }
           a++;
       }
   }
}
