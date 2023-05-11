package day04scannerwrapper;

public class WrapperClass {
    public static void main(String[] args) {
        //primitive     : char      - boolean - byte - short - int   - long - float -double
        //Wrapper Class : Character - Boolean - Byte - Short -Integer- Long - Float -Double

        //Wrapper class lar non-primitive dir. o yuzden memory de cok yer kaplarlar
        //dolayisiyla sart degilse Wrapper Class kullanmayi tercih etmeyiz
        //n yazip nokta koyarsaniz hic method goremezsiniz cunku primitive ler method icermez
        int n = 12;

        // m yazip nokta koyarsaniz bir cok method gorebilirsiniz cunku wrapper classlar method icerir
        Integer m = 12;

        byte p = 33;
        Byte r = 44;

        //Ornek : short data type inin minimum ve maximum degerlerini kod yazarak bulunuz
        short maxShort = Short.MAX_VALUE;
        System.out.println("maxShort = " + maxShort);//maxShort = 32767

        short minShort = Short.MIN_VALUE;
        System.out.println("minShort = " + minShort);//minShort = -32768
        //Ornek int data type inin minimum degeri ile byte data type inin maximum degerinin toplamini bulunuz
        int minInt= Integer.MIN_VALUE;
        byte maxByte= Byte.MAX_VALUE;
        System.out.println(minInt+ maxByte);
        // ornek: primitiv int i Integer e cevir(Autoboxing)
        int num =12;
        Integer wrapperNum=num;
        //ornek: wrapper byte i primitive byte a ceviriniz(Unboxing)

        Byte k=12;
        byte prpmitiveK=k;




    }
}
