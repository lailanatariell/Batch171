package day20statickeywordconstructors;

public class StdRunner {
    public static void main(String[] args) {
        //stdName static oldugundan ona ulasmak icin object olusturmadan sadece
        //class isimini kullanmak yeterlidir
        System.out.println(Student.stdName);
        // age non static oldugundan ona ulasmak icin ona object olusturmak zorundayiz

        Student std1= new Student();
        System.out.println(std1.age);

        Student std2= new Student();
        System.out.println(std2.age);

        Student.staticMethod();

        std1.nonStaticMethod();


    }
}
