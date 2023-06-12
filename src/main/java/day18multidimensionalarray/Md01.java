package day18multidimensionalarray;

import java.util.Arrays;

public class Md01 {
    public static void main(String[] args) {
        //bir array in elemanlari array ise bu array ler multidimensional array dir
        // multidimensional array lere eleman nasil eklenir?

        int a[][]= new int[3][2];
        a[0][0]=5;
        a[1][1]=45;
        a[2][0]=123;
        a[0][1]=12;
        a[1][0]=81;
        a[1][0]=0;

        System.out.println(Arrays.deepToString(a));

        //multidimensional arrayleri consola yazdirmak icin to string methodu degil
        //deeptostring methodu kullanilir

    }
}
