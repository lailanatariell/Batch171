package day17arrays;

public class Arrays03 {
    public static void main(String[] args) {
        //specific bir elemanin array de olup olmadigini anlamak icin gereken kodu yaziniz

        String name []= {"K","C","R","A","S"};
        String eleman ="R";

        //1. yol
        int counter=0;
        for (String w: name){
            if (w.equals(eleman)){
                counter++;
                break;
            }
        }
        if (counter>0){
            System.out.println("Array has "+ eleman);
        }else {
            System.out.println("Array does not have"+eleman);
        }





    }
}
