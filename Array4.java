package Replit_Cozumler;

public class Array4 {
    public static void main(String[] args) {

        /*
        aşağıdaki şekli yazınız
          0  0  0  0  0  0  0  0  0  0
          0  0  0  0  0  0  0  0  0  0
          0  0  0  0  0  0  0  0  0  0
          0  0  0  0  0  0  0  0  0  0
          0  0  0  0  0  0  0  0  0  0
          0  0  0  0  0  0  0  0  0  0
          0  0  0  0  0  0  0  0  0  0
          0  0  0  0  0  0  0  0  0  0
          0  0  0  0  0  0  0  0  0  0
          0  0  0  0  0  0  0  0  0  0
         */
        int[] arr={0,0,0,0,0,0,0,0,0,0};
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr.length ; j++) {
                System.out.print(arr[i]+"  ");
            }
            System.out.println();
        }

        System.out.println("----------------------------");
        int[][] arr1=new int[10][10];
        for (int[] each:arr1){
           for (int each1:each){
               System.out.print(each1+"  ");
           }
            System.out.println();
        }
    }
}
