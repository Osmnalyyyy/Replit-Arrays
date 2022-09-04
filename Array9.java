package Replit_Cozumler;

import java.util.Arrays;

public class Array9 {
    public static void main(String[] args) {
        //Array içerisindeki tek ve çift sayıların kaçar tane olduğunu bulan Java Kodu yazınız.
        //
        //Array: [1,2,3,4,5,6,7,8,9]
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int tekler = 0;
        int ciftler = 0;
        for (int x:arr){
            if(x%2==0){
                ciftler++;
            }else tekler++;
        }
        System.out.println("tek sayisi = " + tekler);
        System.out.println("cift sayisi = " + ciftler);
        System.out.println("Cift sayisi : "+Arrays.stream(arr).filter(t -> t % 2 == 0).count());
        System.out.println("Tek sayisi : "+Arrays.stream(arr).filter(t -> t % 2 == 1).count());
    }
}
