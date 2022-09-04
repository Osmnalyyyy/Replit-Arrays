package Replit_Cozumler;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static java.util.Collections.reverseOrder;

public class Array8 {
    public static void main(String[] args) {
     //  Array listesindeki 2. en büyük sayıyı bulan Java Kodunu yazınız.
     //  Array: [1232,2345,5467,678,3454,2312,3451]
        int[] arr= {1232, 2345, 5467, 678, 3454, 2312, 3451};
        Arrays.sort(arr);
        int enBuyukIkinci=arr[arr.length-2];
        System.out.println(enBuyukIkinci);
   int[] a=    Arrays.stream(arr).sorted().limit(1).skip(arr.length - 4).toArray();

        System.out.println(Arrays.toString(a));

    }
}
