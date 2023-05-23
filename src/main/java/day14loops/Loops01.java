package day14loops;

public class Loops01 {
    //ornek: bir string i ters ceviren kodu yaziniz
    //java==> avaj
    public static void main(String[] args) {
        String t="java";
        String ters="";
        for (int i = t.length()-1; i <0 ; i--) {

            ters=ters+ t.substring(i,i+1);//string return eder
            // birincisi dahil,ikincisi haric

        }
        System.out.println(ters);
        //2.yol

        String u= "Java";
        String ters2="";
        for (int i =u.length()-1; i >=0 ; i--) {
            ters2=ters2+u.charAt(i);//char return eder

        }
        System.out.println(ters2);

        //ornek 2: size verilen bir string in polindrome olup olmadigini kontrol eden kodu yaziniz
        // ey edip adanada pide ye, nalan, kucuk,ada
        //logic: String i ters cevir sonra da duz hali ile ters halini karsilastir, ayni ise Polindrome dur.
        String duz ="ey edip adanada pide ye";
        String ters3="";

        for (int i =duz.length()-1; i >=0 ; i--) {
            ters3=ters3+duz.charAt(i);

        }
        System.out.println(ters3);

        if (duz.equalsIgnoreCase(ters3)){
            System.out.println("palindrome dur");
        }else {
            System.out.println("Palindrome degildir");
        }

    }
}
