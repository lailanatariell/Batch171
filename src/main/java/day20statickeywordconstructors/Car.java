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

     */
    //constructor//
    public  Car(String make,String model,int year,boolean hybrid){
        this.make=make;
        this.model=model;
        this.year=year;
        this.hybrid=hybrid;

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
