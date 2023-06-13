package day25inheritance;

public class Animal {
//Inheritance ==> Miras alma
    /*
    Ozellikleri bir classtan diger classlara alan bir kavramdir, Bunun javadaki karsiligi sudur:
    Siz bir class olusturacaksiniz ama daha once olusturulmus bir class sizin istediginiz ozelliklerin
     bir cogunu kapsiyor, o zaman direkt yeni olusturdugunuz classi ozelliklerini kullanmak istediginiz
     classa  child yapariz

     Inhertiance in faydalari
     1) Code tekrarlarindan kurtuluruz
     2) Code tamiri (maintenance) kolay olur
     3) Child classlari daha atomic yapmis oluruz

     =>Bir class i baska bir classin child classi yapmak icin "extends" keyword kullanilir.
     Ilk yazilan class child, ikinci yazilan class parent (veya super) olur,

     =>Child class objectleri Parent Class dan method ve variablellari kullanabilirler
     =>Parent class objectleri child classtan method ve variablellari kullanamazlar

     */


    public void eat(){
        System.out.println("Animals eat... ");
    }

    public void drink(){
        System.out.println("Animals drink... ");
    }




}
