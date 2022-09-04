package Replit_Cozumler;

import java.util.Arrays;

public class Array5 {
    public static void main(String[] args) {
      /*  yazılan değerin array içerisinde arayan Java Kodu yazınız.
        Array: [1551,1223,1443,1267,1789,1023,2020]
        Aranan Değer:2020
       */
        int[] arr={1551,1223,1443,1267,1789,1023,2020};
        boolean arananDeger=false;
        for (int each:arr){
            if (each==2020){
                arananDeger=true;
            }
        }
        System.out.println(arananDeger);
        System.out.println(Arrays.stream(arr).anyMatch(t -> t == 2020));

    }
}
