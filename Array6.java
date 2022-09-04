package Replit_Cozumler;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Array6 {


    public static void main(String[] args) {
     /*   Aranan değerin Array içerisinde kaçıncı eleman olduğunu bulan Java Kodu yazınız.
        Array: [12,15,43,23,56,76,78,90,77,43]
        Aranan değer:56      */

        int[] arr = {12, 15, 43, 23, 56, 76, 78, 90, 77, 43};
        int aranan = 56;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == aranan) {
                System.out.println(i + 1);
            }
        }



    }
}
