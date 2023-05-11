package day03methodobjectcreationscanner;

public class Runner {
    public static void main(String[] args) {
        //new keywordu sifirdan yeni bir object olusturmak icin kullanilir
        //Object nasil olusturulur
        //Class isimi+ objec ismi + assigment op +"new " keyword u+ Constructor(class ismi ile ayni olmali)
        //Constructor java da objeleri olusturmak icin kullanilan ozel bir methodtur
        Car myCar = new Car();
        //passif ozellikler
        System.out.println(myCar.fiyat);
        System.out.println("myCar.model = " + myCar.model);
        //aktif ozellikler
        myCar.dur();

        Student aliCan = new Student();


        System.out.println("aliCan.name = " + aliCan.name);
        System.out.println("aliCan.adress = " + aliCan.adress);
        System.out.println("aliCan.grade = " + aliCan.grade);
        aliCan.study();
        aliCan.feed();

    }
}
