package day20statickeywordconstructors;

public class Car {
    String make="Honda";

    String model="Accord";

    int year= 2023;

    boolean hybrid=true;
    //orject olusturmadan constructor olmazsa olmazdir
    /*
    Coonstructor nedir
    class dan object uretmemize yarayan code blockleridir
    class olustudugumuzda java bize otomatik olarak bir constructor verir. Ama bu constructor gozle gorulmez
    Gozle gorulmeyen otomatik olarak java tarafindan verilen bu constructorlara "default constructor" denir
     "default constructor" "    Car (){ }" seklindedir


     */

    //constructor//
    public  Car(String make,String model,int year,boolean hybrid){
        this.make=make;
        this.model=model;
        this.year=year;
        this.hybrid=hybrid;

    }
    public Car(String make, String model){
        this.make=make;
        this.model=model;
    }

    public Car(String make, int year) {
        this.make = make;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", hybrid=" + hybrid +
                '}';
    }
}
