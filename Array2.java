package Replit_Cozumler;

public class Array2 {
    public static void main(String[] args) {
        // Arraydeki sayıları toplayan java kodu yazınız
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum +=arr[i];
        }
        System.out.println(sum);
    }
}
