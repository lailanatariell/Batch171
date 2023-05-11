package day06swapvaluesstringmanipulations;



public class StringManipulation02 {
    public static void main(String[] args) {
        String alf="learn java earn money";
        //ornek: "s" String inin "money" ile bitip bitmedigini kontrol edin
        boolean isEnd= alf.endsWith("money");
        System.out.println(isEnd);//true

        //ormek: "s" String indeki "money" kelimesini "dollar" kelimesine degistir
        String change= alf.replace("money","dollar");
        System.out.println(change);//learn java earn dollar

        //ornek: "change" String indeki "earn" kelimesini "win" kelimesine cevirin
        String all= change.replace("earn","win");
        System.out.println(all); //lwin java win dollar




    }
}
