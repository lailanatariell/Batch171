package day06swapvaluesstringmanipulations;

public class SwapValues {
    public static void main(String[] args) {
        //1.yol
        int a=12;
        int b=2;
        //a=b; 2
        //b=a; 2
        System.out.println(a);
        System.out.println(b);
        int c=a;
        a=b; //2
        b=c; //12
        System.out.println(a);
        System.out.println(b);
        //2.yol
        int x=12;
        int y=15;
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println(x);
        System.out.println(y);

    }

}
